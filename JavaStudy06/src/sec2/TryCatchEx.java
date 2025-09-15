package sec2;

public class TryCatchEx {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try {
			System.out.println(arr[5]); // 여섯번째 요소 출력
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
		}
	}

}
