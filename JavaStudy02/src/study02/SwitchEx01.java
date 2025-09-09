/**
 * 
 */
package study02;

import java.util.Scanner;

/**
 * 
 */
public class SwitchEx01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 코드를 입력하세요 (A, B, C, D): ");
		char code = sc.next().toUpperCase().charAt(0);
		
		/*
		String category;
		
		switch(code) {
			case 'A':
				category = "전자제품";
				break;
			case 'B':
				category = "도서";
				break;
			case 'C':
				category = "의류";
				break;
			case 'D':
				category = "식품";
				break;
			default:
				category = "기타 상품";
				break;
		}*/
		
		// Java 14+
		String category = switch(code) {
			case 'A' -> "전자제품";
			case 'B' -> "도서";
			case 'C' -> "의류";
			case 'D' -> "식품";
			default -> "기타 상품";
		};
		
		System.out.println("입려하신 상품은 " + category + " 카테고리입니다.");
		
		sc.close();

	}

}
