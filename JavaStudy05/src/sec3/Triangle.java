package sec3;

public class Triangle extends DrawingObject{
	public Triangle() {
		penColor = "pink";
	}
	
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 삼각형 그리기");
	}
}
