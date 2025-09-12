package sec3;

// 추상 클래스 : abstract class
public abstract class DrawingObject {
	public String penColor;
	
	public void colorInfo() {
		System.out.println(penColor +"색상 펜 사용합니다.");
	}
	
	// 추상 메서드 : body가 구현되지 않고, 선언부만 있는 메서드
	public abstract void draw();
}
