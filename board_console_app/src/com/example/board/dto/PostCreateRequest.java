package com.example.board.dto;

/**
 * 게시글 생성 요청 DTO
 * - 사용자가 새 글을 작성할 때 필요한 입력값을 담음
 * - Service 계층에서 유효성 검증 후 Post 객체로 변환하여 저장
 */
public class PostCreateRequest {
	private final String title; // 제목
	private final String content; // 내용
	private final String writer; // 작성자
	
	public PostCreateRequest(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	// Getter
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	@Override
	public String toString() {
		return "PostCreateRequest ["  + "\n"
				+ "title=" + title + "\n"
				+ ", content=" + content  + "\n"
				+ ", writer=" + writer  + "\n"
				+ "]";
	}
	
	
	
	
}
