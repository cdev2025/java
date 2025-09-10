package study;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class EncodingBestEx {

	// 인코딩 처리 예
	public static void main(String[] args) {
		// 나쁜 예 : FileReader 사용 (시스템 기본 인코딩에 의존)
		try(
			FileReader badReader = new FileReader("example.txt")
		) {
			// 한글 깨짐 발생 가능성 높음
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 좋은 예 : 명시적 인코딩 지정
		try(
			BufferedReader goodReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("example.txt"), StandardCharsets.UTF_8))
		) {
			String line; 
			while( (line=goodReader.readLine()) != null ) {
				System.out.println(line); // 한글 정상 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 실무에서 자주 마주치는 상황
		// CSV 처리 : CSV 인코딩
		try(
			BufferedReader excelCsv = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("test_csv.csv"), StandardCharsets.UTF_8)) 
			// Exel에서 만든 CSV라면 인코딩이 보통 (EUC-KR / CP949), EUC-KR보다는 "MS949"권장
		) {
			// CSV 처리 로직
			String line;
			while( (line=excelCsv.readLine()) != null) {
				// CSV 한 줄 읽기 -> 쉽표로 분리
				String[] cols = line.split(",");
				for (String col : cols) {
					System.out.print(col.trim() + " | ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
