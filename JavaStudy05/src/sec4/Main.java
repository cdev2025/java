package sec4;

public class Main {

	public static void main(String[] args) {
		// 인터페이스 변수 = new 클래스명();
		ISmartPhone isp = new SamsungPhone();
		isp.sendCall();
		isp.setMute(true);
		
		isp = new IPhone();
		isp.sendCall();
		isp.setMute(false);
		
		ISmartPhone.changeBattery();
	}

}
