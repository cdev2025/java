package sec1;

import java.time.InstantSource;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * [문제]
 * 주어진 입력 중 최대값을 구하고, 최대값이 위치하는 index 값의 목록을 반환하세요.
 * 입력: [2, 4, 1, 3, 2, 5, 6, 6, 1]
 * 		입력된 목록의 최대값은 6입니다.
 * 		5와 동일한 값을 가진 위치는 6번째, 7번째 위치입니다.
 * 		이 위치에 해당하는 index는 [6, 7]입니다.
 * 출력: [6, 7]
 * -----------------------------------------------------------------
 * 입출력 예 1
 * 입력: [2, 4, 1, 3, 2, 5, 6, 6, 1]
 * 출력: [6, 7]
 * 
 * 입출력 예 2
 * 입력: [9, 2, 3, 1, 0, 2, 9, 9]
 * 출력: [0, 6, 7]
 * 
 * 입출력 예 3
 * 입력: [0, 2, 4, 2, 4, 0]
 * 출력: [2, 4]
 * */

public class MaxIndexEx4 {

	public static void main(String[] args) {
		int[] arr1 = {2, 4, 1, 3, 2, 5, 6, 6, 1};
		int[] arr2 = {9, 2, 3, 1, 0, 2, 9, 9};
		int[] arr3 = {0, 2, 4, 2, 4, 0};
		
		System.out.println("입력: " + Arrays.toString(arr1));
		System.out.println("출력: " + Arrays.toString(solution(arr1)));
		System.out.println("입력: " + Arrays.toString(arr2));
		System.out.println("출력: " + Arrays.toString(solution(arr2)));
		System.out.println("입력: " + Arrays.toString(arr3));
		System.out.println("출력: " + Arrays.toString(solution(arr3)));
	}
	
	// 4. java.util.stream.IntStream 활용
	public static int[] solution(int[] arr) {
		// 최대값 구하기
		int max = Arrays.stream(arr).max().getAsInt();
		
		return IntStream.range(0,  arr.length).filter(i -> arr[i]==max).toArray();
	}

}








