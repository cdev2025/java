package baekjoon11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	// set 사용해서 중복된 부분  문자열 제거
	// 1. 모든 부분 문자열 생성
	// 2. 중복 제거 => set 사용 자동 중복 제거
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		// 서로 다른 부분 문자열을 저장할 Set
		Set<String> substrings = new HashSet();
		
		// 모든 부분 문자열을 탐색해서 Set 추가(중복 제거)
		for(int i=0; i<s.length(); i++) {
			// 시작점을 기준으로 부분 문자열 생성
			for(int j=i+1; j<=s.length(); j++) {
				// 부분 문자열 생성
				String substring = s.substring(i, j);
				// Set에 추가 (중복 제거)
				substrings.add(substring);
			}
		}
		
		// 서로 다른 부분 문자열 개수 출력
		System.out.println(substrings.size());
	}

}
