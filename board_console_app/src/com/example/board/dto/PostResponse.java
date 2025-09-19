package com.example.board.dto;

import java.util.Date;

import com.example.board.domain.Post;

// 게시글 응답 DTO
// 목록/상세 조회 시 클라이언트에게 반환되는 데이터 모델
public class PostResponse {
	private final int id;
	private String title;
	private String writer;
	private int views;
	private final Date createAt;
	private Date updatedAt;
	
	// Post 엔티티로부터 DTO 생성
	public PostResponse(Post post) {
		this.id = post.getId();
		this.title = post.getTitle();
		this.writer = post.getWriter();
		this.views = post.getViews();
		this.createAt = post.getCreateAt();
		this.updatedAt = post.getCreateAt();
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public int getViews() {
		return views;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	@Override
	public String toString() {
		return String.format("%d. %s (%s) [views: %d]", id, title, writer, views);
	}
	
	
}
