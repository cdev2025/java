package ArrayListEx;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductMain {

	public static void main(String[] args) {
		ArrayList<Product> prdList = new ArrayList<Product>();
		
		Product p1 = new Product(10001, "모니터", 200000);
		Product p2 = new Product(10002, "키보드", 30000);
		Product p3 = new Product(10003, "마우스", 10000);
		
		prdList.add(p1);
		prdList.add(p2);
		prdList.add(p3);
		
		for(int i=0; i<prdList.size(); i++)
			System.out.println(prdList.get(i));
		
		System.out.println("-----------------");
				
		for(Product prd : prdList)
			System.out.println(prd);
		
		System.out.println("-----------------");
		
		Iterator<Product> it = prdList.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
