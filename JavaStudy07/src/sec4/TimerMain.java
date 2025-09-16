package sec4;

public class TimerMain {

	public static void main(String[] args) {
		Thread timer = new Thread(new TimerTask(), "타이머스레드");
		timer.start();
		
		try {
			Thread.sleep(5000); // 5초만 실행 후
		} catch (InterruptedException e) {}
		
		timer.interrupt(); // 스레드 종료 요청
	}

}
