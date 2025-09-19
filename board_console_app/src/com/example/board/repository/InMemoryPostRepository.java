package com.example.board.repository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.board.domain.Post;

/**
 * 메모리 기반 게시글 저장소 구현체
 * - LinkedHashMap을 사용하여 삽입 순서를 유지
 * - 학습용/테스트용 저장소
 */
public class InMemoryPostRepository implements PostRepository {
	private final Map<Integer, Post> store = new LinkedHashMap<Integer, Post>();
	
	@Override
	public Post save(Post post) {
		store.put(post.getId(), post);
		return post;
	}

	@Override
	public Optional<Post> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
