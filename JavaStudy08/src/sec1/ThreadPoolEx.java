package sec1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {

	public static void main(String[] args) {
		// 스레드 3개를 가진 고정 풀 생성
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=1; i<=5; i++) {
			int taskId = i;
			executor.submit(()->{
				System.out.println("작업 " + taskId + " 실행 : " + Thread.currentThread().getName());
				
				try {
					Thread.sleep(1000); // 작업 처리 시뮬레이션
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
		
		executor.shutdown(); // 더 이상 새로운 작업은 받지 않고 종료 준비
	}

}
