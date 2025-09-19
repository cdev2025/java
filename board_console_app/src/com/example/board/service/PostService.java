package com.example.board.service;

import java.util.concurrent.atomic.AtomicInteger;

import com.example.board.repository.PostRepository;
import com.example.board.common.ValidationUtils;
import com.example.board.domain.Post;
import com.example.board.dto.PostCreateRequest;
import com.example.board.dto.PostResponse;
/**
 * 게시글 비즈니스 로직 담당 서비스
 * - 생성/조회/목록/수정/삭제
 * - 유효성 검증
 * - 검색/정렬/페이징
 */
public class PostService {
	private final PostRepository repository;
	private final AtomicInteger seq = new AtomicInteger(1); // ID 관리
	
	public PostService(PostRepository repository) {
		this.repository=repository;
	}
	
	// 게시글 등록
	public PostResponse create(PostCreateRequest req) {
		validateCreate(req);
		Post post = new Post(
				seq.getAndIncrement(), 
				req.getTitle().trim(), 
				req.getContent().trim(), 
				req.getWriter().trim()
		);
		repository.save(post);
		return new PostResponse(post);
	}
	
	// 유효성 검증 
	private void validateCreate(PostCreateRequest req) {
		ValidationUtils.notBlank(req.getTitle(), "제목");
	}
}
