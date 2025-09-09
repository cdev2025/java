package study02;

public class LabeledLoopEx {

	public static void main(String[] args) {
		// 레이블을 사용한 중첩 반복문
		outerLoop: for(int i=1; i<=3; i++) {
			System.out.println("외부 반복: " + i);
			
			innerLoop: for(int j=1; j<=5; j++) {
				System.out.print(j + " ");
				
				if (i==2 && j==3) {
					System.out.println("\n외부 루프 종료!");
					break outerLoop;
				}
				
				if(j%3==0) {
					System.out.println("\n내부 루프 다음 반복으로 이동!");
					continue innerLoop;
				}
				System.out.print("*****");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
