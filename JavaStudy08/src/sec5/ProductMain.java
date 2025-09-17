package sec5;

public class ProductMain {

	public static void main(String[] args) {
		// 실제 클래스가 사용될 때 구체적 타입 지정
		// 컴파일 시 컴파일러가 타입에 맞게 재구성(타입 변환)
		Product<TV, String> prd1 = new Product<>();
		prd1.setKind(new TV());
		prd1.setModel("스마트TV");
		
		TV tv = prd1.getKind();
		String tvModel = prd1.getModel();
		System.out.println(tvModel);
		
		// ---------------------------------------
		Product<Car, String> prd2 = new Product<Car, String>();
		prd2.setKind(new Car());
		prd2.setModel("디젤");
		
		Car car = prd2.getKind();
		String carModel = prd2.getModel();
		System.out.println(carModel);

	}

}
