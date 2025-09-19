package com.example.board.domain;

import java.util.Date;

/**
 * 게시글(Post) 도메인 클래스
 * - id, title, content, writer, views, createdAt, updatedAt
 * - update(), increaseViews() 메서드 포함
 */
public class Post {
	private final int id;
	private String title;
	private String content;
	private String writer;
	private int views;
	private final Date createAt;
	private Date updatedAt;
	
	// 생성자
	public Post(int id, String title, String content, String writer) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.views = 0;
		this.createAt = new Date();
		this.updatedAt = new Date();
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
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
	
	
	// update() 메서드 : 게시글 전체 수정
	public void update(String title, String content) {
		this.title = title;
		this.content = content;
		this.updatedAt = new Date();
	}
	
	// increaseViews() 메서드 구현 : 조회수 증가
	public void increaseViews() {
		this.views++;
	}
	
	@Override
	public String toString() {
		return String.format("%d. %s (%s) [views: %d]", id, title, writer, views);
	}
}
