package sec1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// 기본 ThreadPool  vs 커스텀 ThreadPool
public class ThreadPoolEx02 {
	private static AtomicInteger taskCounter = new AtomicInteger(0);

	public static void main(String[] args) {
		System.out.println("=== ThreadPool 비교 실험 ===");
		System.out.println();
		
		// 기본 방식 : 무작정 스레드 생성
		System.out.println("1. 무작정 스레드 생성 방식: ");
		testUnlimitedThreads();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		// 커스텀 ThreadPool 방식
		System.out.println("2.  커스텀 ThreadPool 방식: ");
		testCustomThreadPool();
	}
	
	static void testUnlimitedThreads() {
		long start = System.currentTimeMillis();
		taskCounter.set(0);
		
		// 100개 작업을 100개 스레드로!
		for(int i=0; i<100; i++) {
			new Thread(() -> {
				doWork();
				taskCounter.incrementAndGet();
			}, "UnlimitedThread-" + i).start();
		}
		
		// 완료까지 대기
		while( taskCounter.get() < 100 ) {
			try {Thread.sleep(10);} catch (Exception e) {}
		}
		
		System.out.println("소요 시간: " + (System.currentTimeMillis() - start) + "ms");
		System.out.println("생성된 스레드 수: 100개");
	}
	
	static void testCustomThreadPool() {
		long start = System.currentTimeMillis();
		taskCounter.set(0);
		
		// 최적화된 ThreadPool 설정
		ThreadPoolExecutor executor = new ThreadPoolExecutor(
				5,  // 기본 스레드 5개
				10,  // max Threads num
				60L, TimeUnit.SECONDS,  // 60초 후 여분 스레드 제거
				new ArrayBlockingQueue<>(50),  // 대기열 50개
				new ThreadFactory() {
					private AtomicInteger threadNumber = new AtomicInteger();
					public Thread newThread(Runnable r) {
						Thread t = new Thread(r, "CustomPool-" + threadNumber.getAndIncrement());
						
						System.out.println("새 스레드 생성: " + t.getName());
						return t;
					}
				},
				new ThreadPoolExecutor.CallerRunsPolicy() // 거부 정책
		);
		
		// 100개 작업 제출
		for(int i=0; i<100; i++) {
			try {
				executor.submit(()->{
					doWork();
					taskCounter.incrementAndGet();
				});
			}catch (RejectedExecutionException e) {
				System.err.println("작업 거부됨!");
			}
		}
		
		// 완료까지 대기
		while( taskCounter.get() < 100 ) {
			try {Thread.sleep(10);} catch (Exception e) {}
		}
		
		System.out.println("소요 시간: " + (System.currentTimeMillis() - start) + "ms");
		System.out.println("생성된 스레드 수: " + executor.getMaximumPoolSize() + "개");
	}
	
	static void doWork() {
		// 작업 시뮬레이션(100ms)
		try { Thread.sleep(100); } catch (Exception e) {}
	}

}
