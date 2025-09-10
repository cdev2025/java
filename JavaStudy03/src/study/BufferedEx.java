package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedEx {

	public static void main(String[] args) {
		//버퍼 사용 파일 읽기
		try(
			BufferedReader reader = new BufferedReader(new FileReader("example.txt"))
		){
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//버퍼 사용 파일 쓰기기
		try(
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))
		){
			writer.write("첫 번째 줄");
			writer.newLine(); // 줄바꿈
			writer.write("두 번째 줄");
			writer.flush(); // 버퍼 내용을 강제로 출력(연결된 스트림: 파일)
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
