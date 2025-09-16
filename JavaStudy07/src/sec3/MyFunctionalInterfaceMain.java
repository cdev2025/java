package sec3;

public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
		
		// 매개변수와 리턴값이 없는 람다식
		MyFunctionalInterface fi = (x, y) -> {
			return x+y;
		};
		
		// 메서드 호출: 매개값으로 10, 3 전달
		fi.method(10, 3);
		
		
		int a = 10;
		int b = 5;
		String op = "/";
		
		switch(op) {
		case "+":
			fi = (x, y) -> x+y;
			break;
		case "/":
			fi = (x, y) -> {
                 if (y == 0) {
                     throw new ArithmeticException("0으로 나눌 수 없습니다.");
                 } else {
                     return x / y;
                 }
             };
             break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		
		System.out.println("연산 결과: " + fi.method(a, b));
		
	}
}
