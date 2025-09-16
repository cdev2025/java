package sec4;

public class MyRunnableMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
	}

}
