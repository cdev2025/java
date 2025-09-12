package sec5;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;	
	
	// 추상 메서드 : 실행 블록이 없는 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴드 메서드 : 실행 블록이 있는 메서드 JAVA 8
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
