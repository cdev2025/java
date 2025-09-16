package sec5;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		// 생산자 스레드
		Runnable producer = () -> {
			try {
				for (int i=1; i<=10; i++) {
					buffer.produce(i); // 데이터 넣기
					Thread.sleep(500); // 생산 간격 0.5sec
				}
			}catch (InterruptedException e) {
				System.out.println("생산자 종료");
			}
		};
		
		// 소비자 스레드
		Runnable consumer = () -> {
			try {
				for (int i=1; i<=10; i++) {
					buffer.consume(); // 데이터 꺼내기
					Thread.sleep(1000); // 소비 간격 1sec
				}
			}catch(InterruptedException e) {
				System.out.println("소비자 종료");
			}
		};
		
		// 스레드 실행
		new Thread(producer, "생산자").start();
		new Thread(consumer, "소비자").start();
	}

}
