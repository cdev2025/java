package sec5;

// 제너릭 : 멀티 타입 파라미터 예제
public class Product<T, M> { // 클래스설계시 타입 미정
	private T kind;
	private M model;
	
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
