package sec2;

public class MultiTryCatch {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try {
			System.out.println(arr[5]);
			System.out.println(Integer.parseInt("a100"));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} finally {
			// 무조건 실행
			System.out.println("다시 실행하세요.");
		}
	}

}
