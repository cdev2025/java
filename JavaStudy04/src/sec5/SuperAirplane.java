package sec5;

public class SuperAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	private int flyMode;
	
	public SuperAirplane() {
		super();
		this.flyMode = NORMAL;
	}

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		}else {
			super.fly(); // 부모 클래스의 fly() 메서드 호출
		}
	}
	
	public void setNormalMode() {
		this.flyMode = NORMAL;
	}
	
	public void setSuperMode() {
		this.flyMode = SUPERSONIC;
	}
	
	
}
