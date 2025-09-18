package sec02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(100, "홍길동", 3000));
		empList.add(new Employee(101, "이몽룡", 4000));
		empList.add(new Employee(102, "성춘향", 5000));
		
		for(int i=0; i<empList.size(); i++) {
			System.out.println(empList.get(i));
		}
		
		System.out.println("------------------");
		
		for(Employee e : empList) {
			System.out.println(e);
		}
		
		System.out.println("------------------");
		
		// Iterator 사용 가능
		Iterator<Employee> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
