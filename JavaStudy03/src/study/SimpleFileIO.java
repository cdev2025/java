package study;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileIO {

	public static void main(String[] args) {
		// 파일에 텍스트 쓰기
		try (FileWriter writer = new FileWriter("example.txt")){
			writer.write("안녕하세요, Java 파일 입출력!");
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 파일에서 텍스트 읽기
		try ( BufferedReader reader =  new BufferedReader(new FileReader("example.txt")) ){
			String line = reader.readLine();
			System.out.println("읽은 내용: " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
