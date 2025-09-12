package sec3;

public class Circle extends DrawingObject{

	public Circle() {
		penColor = "blue";
	}
	
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 원 그리기");
	}

}
