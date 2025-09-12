package sec3;

public class Line extends DrawingObject {
	
	public Line() {
		penColor = "red";
	}
	
	// 추상 메서드 오버라이딩 : 필수(없으면 오류)
	// 클래스 생성 시 자동 포함 되기도 함 (생성시 super class 미리 정의하면)
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 선 그리기");
	}
}
