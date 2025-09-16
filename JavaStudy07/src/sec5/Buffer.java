package sec5;

import java.util.LinkedList;
import java.util.Queue;

// 생산자-소비자 패턴 실습
// 공유 자원 (버퍼)
public class Buffer {
	private Queue<Integer> queue = new LinkedList<Integer>();
	private final int LIMIT = 5; // 최대 저장 가능 개수
	
	// 데이터 생산 (버퍼에 넣기)
	public synchronized void produce(int value) throws InterruptedException {
		// 버퍼가 가득 찼으면 대기
		while(queue.size()>=LIMIT) {
			System.out.println("버퍼 FULL -> 생산자 대기");
			wait(); // 소비자가 데이터를 꺼낼 때까지 대기
		}
		
		queue.offer(value); // 데이터 추가
		System.out.println("생산: " + value);
		notify();  // 소비자 깨우기
	}
	
	// 데이터 소비 (버퍼에서 꺼내기)
	public synchronized int consume() throws InterruptedException {
		// 버퍼가 이었으면 대기
		while(queue.isEmpty()) {
			System.out.println("버퍼 EMPTY -> 소비자 대기");
			wait(); // 생산자가 데이터를 넣을 때까지 대기
		}
		
		int value = queue.poll(); // 데이터 꺼내기
		System.out.println("소비: " + value);
		notify();  // 생산자 깨우기
		return value;
	}
}
