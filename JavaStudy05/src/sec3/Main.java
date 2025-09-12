package sec3;

public class Main {

	public static void main(String[] args) {
		// 실체 클래스 객체 생성 / 메서드 호출
		Line line = new Line();
		line.colorInfo();
		line.draw();
		
		Circle circle = new Circle();
		circle.colorInfo();
		circle.draw();
		
		Rect rect = new Rect();
		rect.colorInfo();
		rect.draw();
		
		Triangle tri = new Triangle();
		rect.colorInfo();
		tri.draw();

	}

}
