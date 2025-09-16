package sec6;

public class MultiThreadJoinEx {

	public static void main(String[] args) {
		// 숫자 출력 스레드 (1~10, 1초 간격)
		Runnable numberTask = ()->{
			for(int i=1; i<=10; i++) {
				System.out.println("숫자: " + i);
				try {
					Thread.sleep(1000); // 1초 대기
				} catch (InterruptedException e) {
					System.out.println("숫자 스레드 종료");
				}
			}
		};
		
		// 문자 출력 스레드 (A~J, 2초 간격)
		Runnable charTask = () -> {
			 for (char c='A'; c<='J'; c++) {
				 System.out.println("문자: " + c);
				 try {
					Thread.sleep(2000); // 2초 대기
				} catch (InterruptedException e) {
					System.out.println("문자 스레드 종료");
				}
			 }
		};
		
		// 스레드 객체 생성
		Thread t1 = new Thread(numberTask, "숫자스레드");
		Thread t2 = new Thread(charTask, "문자스레드");
		
		//실행 시작
		t1.start();
		t2.start();
		
		try {
			// join() -> 두 스레드가 끈날 때까지 main 스레드 대기
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("모든 작업이 완료되었습니다!");
		
	}

}
