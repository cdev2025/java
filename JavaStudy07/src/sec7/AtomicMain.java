package sec7;

public class AtomicMain {

	public static void main(String[] args) {
		AtomicCounter counter = new AtomicCounter();
		
		Runnable task = () -> {
			for (int i=0; i<5; i++) {
				counter.increment();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {}
			}
		};
		
		Thread t1 = new Thread(task, "스레드1");
		Thread t2 = new Thread(task, "스레드2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {}
		
		System.out.println("최종 count 값: " + counter.getValue());
	}

}
