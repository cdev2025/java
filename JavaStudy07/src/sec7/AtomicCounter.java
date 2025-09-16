package sec7;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
	// AtomicInteger 사용 -> 원자적 연산 보장
	private AtomicInteger count = new AtomicInteger(0);
	
	public void increment() {
		// count ++ 대신 incrementAndGet() 사용
		int newValue = count.incrementAndGet();
		System.out.println(Thread.currentThread().getName() + " -> count: " + newValue);
	}
	
	public int getValue() {
		return count.get();
	}
}
