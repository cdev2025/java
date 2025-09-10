package study;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamEx {

	public static void main(String[] args) {
		// 텍스트 파일 읽고 쓰기
		try(
				FileReader fr = new FileReader("example.txt");
				FileWriter fw = new FileWriter("output.txt");
			){
			int data;
			while( ( data = fr.read() )!=-1 ) {
				fw.write(data); // 문자 단위로 쓰기
				System.out.print((char)data);
			}
			System.out.println("파일 복사 완료!");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// 만약 여기서 한글 인코딩 오류가 있다면~

	}

}
