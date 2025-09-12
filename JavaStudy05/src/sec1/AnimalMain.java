package sec1;

public class AnimalMain {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.show(); 
		a.sound();
		
		Cat c = new Cat();
		c.show();
		c.sound();
		
		Dog d = new Dog();
		d.show();
		d.sound();
		
		// 다형성 표현 : 부모 클래스 타입에 여러 자식 객체 대입
		// 하나의 타입에 여러 객체를 대입함으로써 다양한 기능 이용
		// 자식 타입이 부모 타입으로 자동 타입변환 발생
		Animal ap = null; // 부모 타입 객체
		// null : 처음 선언할 때 자식 객체 지정 안하겠다는 의미(객체의 레퍼런스가 없다)
		// 사용할 때 대입하겠다
		
		System.out.println("------------------");
		
		// 부모 타입 변수에 Cat  자식 객체 대입
		ap = new Cat(); // 자동 타입 변환(Cat->Animal)
		ap.show();
		ap.sound();
		
		// 부모 타입 변수에 Dog 자식 객체 타입 대입
		ap = new Dog(); // 자동 타입 변환(Dog->Animal)
		ap.show();
		ap.sound();
		
		// 만일 자식 클래스에서 오버라이딩을 안했다면
		// 부모 클래스 Animal 클래스의 show()/sound() 호출
		
		// [추가] 강제 타입 변환 예제: sec2 패키에서....
	}
}
