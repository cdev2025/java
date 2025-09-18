package baekjoon10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 상근이가 가지고 있는 숫자 카드의 개수 N을 입력 받음
		int N = Integer.parseInt(br.readLine());
		// 각 숫자 카드의 수를 Map에 저장해서 count
		Map<Integer, Integer> cardCount = new HashMap<Integer, Integer>();
		
		// 숫자 카드에 적힌 정수를 입력 받아서 Map에 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int number = Integer.parseInt(st.nextToken());
			cardCount.put(number, cardCount.getOrDefault(number, 0) + 1);
		}
		
		// 구해야할 숫자 카드의 개수M을 입력 받음
		int M = Integer.parseInt(br.readLine());
		int[] queries = new int[M];
		
		// 구해야할 숫자 카드들을 입력 받음
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			queries[i] = Integer.parseInt(st.nextToken());
		}
		
		// 결과 출력
		StringBuilder sb = new StringBuilder();
		for (int query : queries) {
			sb.append(cardCount.getOrDefault(query, 0)).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
