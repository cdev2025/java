package sec5;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(100);
		rc.turnOff();
		
		Searchable sch = new SmartTelevision();
		sch.search("www.naver.com");
	}

}
