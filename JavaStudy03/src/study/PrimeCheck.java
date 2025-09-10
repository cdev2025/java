package study;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		//사용자로 부터 숫자 입력받아 소수인지 판단
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소수인지 판별할 숫자 입력하세요: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		boolean result = isPrime(number);
		
		System.out.println(number + (result ? "은(는) 소수" : "은(는) 소수 아님"));
		
		System.out.println("-----------------------");
		
		// 1부터 100,000 사이의 모든 소수를 찾아 출력하세요 =>(에라토스테네스의 체X)
		for(int i=1; i<=100000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}
	
	// 주어진 숫자 num이 소수인지 판별하는 메서드
	public static boolean isPrime(int num) {
		// 1과 0은 소수가 아님
		if (num <=1 ) {
			return false;
		}
		
		// 2부터 num의 제곱근까지 나눗셈을 시도해서 소수 여부 판단
		for(int i=2; i<=Math.sqrt(num); i++) {
			//나누어 떨어지는 수가 있으면 소수 아님
			if ( num%i==0 ) {
				return false;
			}
		}
		
		// 나누어 떨어지는 수가 없으면 소수
		return true;
	}

}
