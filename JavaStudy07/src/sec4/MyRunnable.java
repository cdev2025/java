package sec4;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable 실행 중: " + Thread.currentThread().getName());
	}

}
