package sec3;

@FunctionalInterface
public interface MyFunctionalInterface {
	// 1개의 추상 메서드만 포함
	// 매개 변수 2개, 정수값 리턴하는 추상 메서드
	public int method(int x, int y);
}
