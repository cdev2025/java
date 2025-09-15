package sec3;

public class ThrowsEx {

	public static void main(String[] args) {
		// throws가 붙어 있는 메서드는 반드시 try 블록 내에서 호출되어야 하고
		// catch 블록에서 예외를 처리해야 함
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	// ClassNotFoundException 예외가 발생하는데 직접처리하지 않고
	// 메서드를 호출한 곳에서 처리하도록 떠 넘김(throws)
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}
