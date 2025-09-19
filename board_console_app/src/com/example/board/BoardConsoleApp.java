package com.example.board;

import com.example.board.controller.PostController;
import com.example.board.dto.PostCreateRequest;
import com.example.board.repository.InMemoryPostRepository;
import com.example.board.repository.PostRepository;
import com.example.board.service.PostService;

// App엔트리포인트, Repository->Service->Controller 조립해서 실행 
// 기본적으로 Spring Framework에서는 어노테이션으로 선언된 Bean들을 자동으로 실행줌.
public class BoardConsoleApp {

	public static void main(String[] args) {
		// 1. Repository(데이터 저장소)
		PostRepository repo = new InMemoryPostRepository();
		
		// 2. Service(비즈니스 로직)
		PostService service = new PostService(repo);
		
		// 3. 초기 데이터 세팅
		init(service);
		
		// 4. Controller 실행(콘솔 메뉴 기반 라우터)
		PostController controller = new PostController(service);
		controller.run();

	}
	
	private static void init(PostService service) {
		service.create(new PostCreateRequest("첫 글", "안녕하세요!", "nari"));
		service.create(new PostCreateRequest("정렬/검색 테스트", "키워드 포함된 글", "tester"));
	}

}
