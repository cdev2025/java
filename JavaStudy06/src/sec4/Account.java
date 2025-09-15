package sec4;

public class Account {
	private long balance; // 계좌 잔액
	
	public Account() {}
	
	//잔고 알려주는 메서드
	public long getBalance() {
		return balance;
	}
	
	//예금
	public void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금 완료");
	}
	
	//인출
	public void withdraw(int money) throws BalanceInsufficientException{
		// 잔고가 부족할 경우에 대비해서 예외 처리
		// 예외 발생 시킴. 예외 메시지 전달. 예외 메시지는 예외 객체 내부에 저장
		if( balance < money) {
			throw new BalanceInsufficientException("[사용자정의예외] 잔고부족 : " + (money-balance) +"원 모자람");
		}
		
		balance -= money; 
		System.out.println(money + "원 출금 완료");
	}

}
