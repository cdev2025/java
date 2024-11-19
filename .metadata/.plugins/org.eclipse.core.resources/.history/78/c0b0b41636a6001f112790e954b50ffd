package multiGeneric;

public class ProductMain {

	public static void main(String[] args) {
		Product<TV, String> prd1 = new Product<TV, String>();
		prd1.setKind(new TV());
		prd1.setModel("스마트TV");
		
		TV tv = prd1.getKind();
		String tvModel = prd1.getModel();
		System.out.println(tv + ": " + tvModel);
		
		Product<Car, String> prd2 = new Product<Car, String>();
		prd2.setKind(new Car());
		prd2.setModel("스포츠카");
		
		Car car = prd2.getKind();
		String carModel = prd2.getModel();
		System.out.println(car + ": "+carModel);
	}

}
