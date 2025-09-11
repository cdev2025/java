package sec3;

public class Singleton {
	
	// 클래스 자신의 타입으로 static 필드 선언
	private static Singleton singleton = new Singleton();
	
	// 외부에서 new 연산자로 생성자를 호출할 수 없도록 private으로 막음
	private Singleton() {}
	
	//외부에서 호출할 수 있는 static 메서드 사용
	public static Singleton getInstance() {
		return singleton;
	}
}
