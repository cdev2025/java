package sec2;

public class TryCatchOrderEx {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} 
	}

}
