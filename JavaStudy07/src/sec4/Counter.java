package sec4;

// 공유 자원 : 카운터
public class Counter {
	private int count = 0;
	
	// 동기화 없는 증가 메서드
	public void incrementWithoutSync() {
		count++;
		System.out.println(Thread.currentThread().getName() + " -> count: " + count);
	}
	
	// synchronized 키워드로 동기화된 증가 메서드
	public synchronized void incrementWithSync() {
		count++;
		System.out.println(Thread.currentThread().getName() + " (동기화) -> count: " + count);
	}
}
