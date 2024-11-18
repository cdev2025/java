package ThreadEx2;

import java.awt.Toolkit;

// 단일 스레드: 메인 스레드만 존재
public class BeepPrintMain {

	public static void main(String[] args) {
		
		// Runnable 객체 구현
		Runnable beepTask = new BeepTask();
		
		// 작업 스레드 생성
		Thread thread = new Thread(beepTask);
		
		// 스레드 실행
		thread.start();
		
		// 땡 다섯번 출력
		for(int i=0; i<5; i++) {
			System.out.print("땡");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}
