package sec3;

public class Rect extends DrawingObject {

	public Rect() {
		penColor = "green";
	}
	
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 사각형 그리기");
	}

}
