package sec5;

public class SuperAirplaneMain {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		
		sa.takeOff(); 	// 이륙
		sa.fly(); 		//  일반 비행
		
		sa.setSuperMode();
		sa.fly();		// 	초음속 비행
		
		sa.setNormalMode();
		sa.fly();		// 일반 비행
		
		sa.land(); 		// 착륙
	}

}
