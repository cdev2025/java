package nonGeneric;

// 제너릭 사용하지 않는 경우의 예제
// 강제 타입 변환 발생
public class Box {
	private Object object;
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}
}