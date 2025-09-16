package sec4;

public class ThreadControl {

	public static void main(String[] args) {
		Thread t = new Thread( () -> {
			for (int i=1; i<=5; i++) {
				System.out.println("작업: " + i);
				try {
					Thread.sleep(1000); // 1초 대기
				} catch (InterruptedException e) {
					System.out.println("스레드 종료 요청 받음");
					return;
				} 
			}
		});
		
		t.start();
		try {
			t.join(); // t가 끝날 때까지 main 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("모든 작업 완료");
	}

}
