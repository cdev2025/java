package sec4;

public class CounterMain {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		// 동기화 없는 경우
		Runnable task1 = () -> {
			for (int i=0; i<5; i++) {
				counter.incrementWithoutSync();
			}
		};
		
		// 동기화 있는 경우
		Runnable task2 = () -> {
			for (int i=0; i<5; i++) {
				counter.incrementWithSync();
			}
		};
		
		System.out.println("=== 동기화 없는 실행 ===");
		Thread t1 = new Thread(task1, "스레드A");
		Thread t2 = new Thread(task1, "스레드B");
		t1.start();
		t2.start();
		
		// 잠시 대기 후 동기화 실행
		try{Thread.sleep(2000);} catch (InterruptedException e) {}
		
		System.out.println("=== 동기화 있는 실행 ===");
		Thread t3 = new Thread(task2, "스레드C");
		Thread t4 = new Thread(task2, "스레드D");
		t3.start();
		t4.start();

	}

}
