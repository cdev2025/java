package ThreadEx6;

public class MultiThread extends Thread{

	private int id;
	
	public MultiThread(int id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++)
			System.out.println("thread(" + id + "), i:" + i);
	}
}
