package com.example.board.controller;

import java.util.Scanner;

import com.example.board.common.BusinessException;
import com.example.board.dto.PostCreateRequest;
import com.example.board.dto.PostResponse;
import com.example.board.service.PostService;

public class PostController {
	private final PostService service;
	private final Scanner sc = new Scanner(System.in);
	
	public PostController(PostService service) {
		this.service = service;
	}
	
	// 콘솔 라우터 실행
	public void run() {
		while(true) {
			try {
				printMenu();
				String menu = sc.nextLine().trim();
				switch(menu) {
					case "1" -> create();
					case "0" -> {
						System.out.println("프로그램을 종료합니다.");
						return;
					}
					default -> System.out.println("메뉴를 올바르게 선택하세요.");
				}
			} catch (BusinessException e) {
				System.out.println("[비즈니스 오류] "+e.getMessage());
			} catch (Exception e) {
				System.out.println("[시스템 오류] " + e);
			}
		}
	}
	
	private void create() {
		System.out.println("\n[글 작성]");
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String content = sc.nextLine();
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		PostResponse res = service.create(new PostCreateRequest(title, content, writer));
		System.out.println("등록 완료 -> " + res);
		
	}
	
	private void printMenu() {
		System.out.println("1. 등록 | 2. 목록 | 3. 상세 | 4. 수정 | 9. 검색 | 0. 종료");
	}
}

