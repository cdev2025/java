package sec01;

public class ProductMain {

	public static void main(String[] args) {
		//1001, 노트북, 1000000, 삼성, 2022-09-22, 10
		Product p = new Product("1001", "노트북", 1000000, "삼성", "2022-09-22", 10);
		System.out.print(p); // Product 클래스의 인스턴스 변수 p의 toString() 메서드 자동 호출
	}

}
