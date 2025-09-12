package sec2;

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
		
		System.out.println("------------------");
		
		// 강제 자식 타입으로 변형하고자 할 때 (원위치) : 강제 타입 변환
		// 현재 ap는 Animal 타입 : Animal 클래스의 메서드만 사용 가능
		// 오버라이딩 된 메서드는 예외
		ap.animalMethod();
		// ap.dogMethod(); // 사용 불가
		
		// Dog 클래스의 dogMethod()를 사용하고 싶으면
		// 다시 Dog 타입으로 강제로 타입 변환해야 함
		if(ap instanceof Dog) {
			d = (Dog)ap; // Animal 타입 -> Dog 타입으로 강제 타입 변환
			System.out.println("Dog 타입으로 변환 성공");
		}else {
			System.out.println("Dog 타입으로 변환 불가");
		}
		d.dogMethod();
		
		// 강제 타입 변환시 오류가 나지 않도록 미리 확인!!!
		Animal aa = new Animal();
		//Dog dd = (Dod)aa; // 타입 변환 x : aa는 처음부터 부모타입 객체로 선언 되었음.
		// instanceof 연산자 사용 
		if(aa instanceof Dog) {
			Dog dd = (Dog)aa;
			System.out.println("Dog 타입으로 변환 성공");
		}else {
			System.out.println("Dog 타입으로 변환 불가");
		}
	}
}
