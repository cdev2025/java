package sec6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	static final int MAX_INPUT = 4;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i<MAX_INPUT; i++) {
			System.out.println("단어를 입력하세요 >> ");
			list.add(sc.nextLine());
		}
		System.out.println("--------------------------");
		
		String strMax = "";
		for(String word : list) {
			System.out.print(word + " ");
			if( word.length() > strMax.length() ) {
				strMax = word;
			}
		}
		System.out.println();
		System.out.println("가장 긴 단어는 : " + strMax);
		System.out.println("가장 긴 단어의 길이는 : " + strMax.length());
		
		sc.close();
	}

}
