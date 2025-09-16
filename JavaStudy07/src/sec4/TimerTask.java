package sec4;

import java.time.LocalTime;

public class TimerTask implements Runnable{

	@Override
	public void run() {
		while(true) {
			// 현재 시간 출력
			System.out.println("현재 시간: " + LocalTime.now());
			
			try {
				Thread.sleep(1000); // 1초 대기
			} catch (InterruptedException e) {
				System.out.println("타이머 스레드 종료 요청");
				break; // 스레드 종료
			} 
		}
	}

}
