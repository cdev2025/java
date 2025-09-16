package sec1;

public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 매개변수와 리턴값이 없는 람다식
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		
		// 메서드 호출: 람다식의 중괄호 {...} 실행
		fi.method();
		
		//------------------------------
		fi = () -> {System.out.println("method call");};
		fi.method();
	}

}
