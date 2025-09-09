package study02;

public class LabeledLoopEx02 {

	public static void main(String[] args) {
		// break label
		System.out.println("1. break label 예제: ");
		outerLoop: for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print("[" + i + ", " + j + "]");
				if (i==2 && j==2) {
					break outerLoop; // 외루 루프 종료
				}
			}
			System.out.println();
		}
		
		// continue label
		System.out.println("\n\n2. continue label 예제: ");
		outerLoop: for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if (i==2 && j==2) {
					continue outerLoop;  // 외부 루프의 다음 반복으로 넘어가기
				}
				System.out.print("[" + i + ", " + j + "]");
			}
			System.out.println();
		}
	}

}
