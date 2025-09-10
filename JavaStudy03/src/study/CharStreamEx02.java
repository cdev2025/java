package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharStreamEx02 {

	public static void main(String[] args) {
		// FileReader로 UTF-8 텍스트파일을 읽었을 때 한글이 깨진다면 
		// FileInputStream + InputStreamReader(UTF-8) 조합으로 해결
		try(
				InputStreamReader isr = new InputStreamReader(new FileInputStream("example.txt"), "UTF-8");
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8");
		){
			char[] buffer = new char[1024];
			int length;
			while((length = isr.read(buffer)) != -1) {
				osw.write(buffer, 0, length);
			}
			System.out.println("파일 복사 완료!");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
