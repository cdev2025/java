package study;

import java.util.Arrays;

public class ParameterEx {

	public static void main(String[] args) {
		// Call by Value (값이 전달)
		int number = 10;
		System.out.println("호출 전: " + number);
		changeValue(number);
		System.out.println("호출 후: " + number);
		
		// Call by Reference (참조값: 객체 주소가 전달)
		int[] numbers = {10, 20, 30};
		System.out.println("호출 전: " + Arrays.toString(numbers));
		changeReference(numbers);
		System.out.println("호출 후: " + Arrays.toString(numbers));
		
	}
	
	// 기본형 타입 매개변수
	static void changeValue(int x) {
		x = 100; 
		System.out.println("changeValue메서드의 x값: " + x);
	}
	
	// 참조형 타입 매개변수
	static void changeReference(int[] arr) {
		arr[0] = 100;
	}

}
