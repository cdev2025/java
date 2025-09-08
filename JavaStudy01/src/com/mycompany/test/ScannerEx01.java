package com.mycompany.test;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		//버퍼 비우기 : nextInt()는 줄바꿈 문자를 버퍼에 남겨둠. 
		sc.nextLine();
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("키(m)를 입력하세요: ");
		double height = sc.nextDouble();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height + "m");
		
		// 토큰화 처리
		sc.nextLine();
		System.out.print("쉼표로 구분된 값 입력: ");
		sc.useDelimiter("[,\\n]");
		while(sc.hasNext()) {
			System.out.println(sc.next().trim());
		}
		
		
		sc.close();
	}

}
