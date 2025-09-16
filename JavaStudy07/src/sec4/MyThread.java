package sec4;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("스레드 실행 중: " + getName());
	}
}
