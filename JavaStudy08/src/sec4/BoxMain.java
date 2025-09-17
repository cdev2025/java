package sec4;

public class BoxMain {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.setT("hello");
		
		String str = box1.getT();// 강제 타입 변환 없음
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.setT(10);
		
		int value = box2.getT();
		System.out.println(value);
	}

}
