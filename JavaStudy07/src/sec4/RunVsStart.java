package sec4;

public class RunVsStart {

	public static void main(String[] args) {
		Thread t = new Thread(
				() -> {
					System.out.println("스레드 실행: " + Thread.currentThread().getName());
				});
		
		t.run();   // 메인 스레드에서 실행됨
		t.start(); // 별도의 새로 만들어진 스레드에서 실행됨
	}

}
