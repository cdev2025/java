package study02;

import java.util.Arrays;

// 배열에서 k번째 최소값 찾기
public class KthSmallestElement {
	
	// K번째 최소값을 찾는 메서드
	public static int findKthSmallest(int[] arr, int k) {
		// 배열 정렬
		Arrays.sort(arr);
		
		// k번째 최소값 반환
		return arr[k-1];
	}

	public static void main(String[] args) {
		int[] arr = {3, 5, 2, 6, 4};// 주어진 정수 배열
		int k=3; 					// 배열 내에서 찾아얄 K번째 작은 원소(찾고자 하는 순서)
		
		System.out.println("배열: " + Arrays.toString(arr));
		int kthSmallest = findKthSmallest(arr, k);
		System.out.println(k+"번째 최소값: " + kthSmallest);
		
		System.out.println("배열: " + Arrays.toString(arr));
		System.out.println("최소값: " + arr[0]);
		System.out.println("최대값: " + arr[arr.length-1]);

	}

}
