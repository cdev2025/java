package com.example.board.repository;


import java.util.List;
import java.util.Optional;

import com.example.board.domain.Post;

/**
 * 게시글 저장소 인터페이스
 * - 데이터 접근 계층 (DAO) 역할
 * - 현재는 InMemory 구현체 사용, 나중에 Spring에서는 JpaRepository로 대체 가능
 */
public interface PostRepository {
	
	// 저장 (신규 등록 or 수정)
	Post save(Post post);
	
	// ID로 조회
	Optional<Post> findById(int id);
	
	// 삭제(성공시 true 반환)
	boolean deleteById(int id);
	
	// 전체 조회
	List<Post> findAll();

}
