package baekjoon2738;

import java.util.Scanner;

public class Main {
	// 행렬 덧셈
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 두 행렬의 크기 N, M 입력 받음
		int N = sc.nextInt(); //행 개수
		int M = sc.nextInt(); //열 개수
		
		// 두 행렬 A, B 선언.초기화
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		// 행렬 A에 대한 원소 사용자로부터 입력 받아 저장
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		// 행렬 B에 대한 원소를 사용자로부터 입력 받아 저장
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		// 두 행렬 A와 B의 각 원소를 더하여 결과를 출력
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				// A[i][j] + B[i][j]
				System.out.print( (A[i][j]+B[i][j]) + " " );
			}
			System.out.println();
		}
		
		sc.close();

	}

}
