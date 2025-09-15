package sec2;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String data1 = "100"; // 숫자 타입으로 변환 가능
		String data2 = "a100"; // 숫자타입으로 변환 불가
		
		// 문자열을 숫자 형식으로 변환해서 저장
		int value1 = Integer.parseInt(data1);
		System.out.println(value1);
		
		int value2 = Integer.parseInt(data2);
		System.out.println(value2); // NumberFormatException 발생
	}

}
