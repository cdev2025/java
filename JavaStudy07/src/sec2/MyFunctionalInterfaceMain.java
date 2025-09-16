package sec2;

public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
		
		// 매개변수와 리턴값이 없는 람다식
		MyFunctionalInterface fi = (x) -> {
			System.out.println(x*5);
		};
		
		// 메서드 호출: 매개값으로 2 전달
		fi.method(2);
	}

}
