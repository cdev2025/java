package study02;

import java.util.Arrays;

// Arrays 클래스 활용법
public class ArraysEx {

	public static void main(String[] args) {
		// 배열 정렬
		int[] numbers = {4,  2, 5, 1, 3};
		Arrays.sort(numbers);
		System.out.println("Sorted: " + Arrays.toString(numbers));
		
		// 이진 검색
		int index = Arrays.binarySearch(numbers, 3);
		System.out.println("Index of 3: " + index);
		
		// 배열 복사 copyOf()
		int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
		System.out.println("Copied: " + Arrays.toString(copiedNumbers));
		
		// 범위 지정 복사 copyOfRange()
		int[] copiedNumbers2 = Arrays.copyOfRange(numbers, 1, 3); // 1~3미만(2까지)
		System.out.println("Range Copied: " + Arrays.toString(copiedNumbers2));
		
		// 비교
		System.out.println("Arrays equal: " + Arrays.equals(numbers, copiedNumbers));
		System.out.println("Arrays equal 2: " + Arrays.equals(numbers, copiedNumbers2));
		
		//채우기
		int[] filledArray = new int[5];
		Arrays.fill(filledArray, 9);
		System.out.println("Filled: " + Arrays.toString(filledArray));
		
		// 다차원 배열 요소 출력
		int[][] deepArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Deep Array to String: " + Arrays.deepToString(deepArray));
		
		// 다차원 배열 비교
		int[][] deepArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Deep Array equal: " + Arrays.deepEquals(deepArray, deepArray2));
		
	}

}
