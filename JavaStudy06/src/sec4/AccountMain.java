package sec4;

public class AccountMain {

	public static void main(String[] args) {
		Account acc = new Account();
		
		// 예금하기
		acc.deposit(10000);
		// 잔액 확인
		System.out.println("예금액 : " + acc.getBalance()+"원");
		
		// 출금
		try {
			acc.withdraw(30000); // 예외를 떠넘겼기 때문에(throws) 반드시 try 블록에서 호출해야 함.
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage()); // 예외 발생시킬 때 생성자에 전달한 메시지 확인
			
			// 예외 발생 코드를 추적한 내용을 출력
			e.printStackTrace();
		} 
	}

}
