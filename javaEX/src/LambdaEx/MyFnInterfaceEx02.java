package LambdaEx;

public class MyFnInterfaceEx02 {
public static void main(String[] args) {
	MyFnInterface2 fi;
	
	fi = (x, y) -> {
		return x+y;
	}; 
	System.out.println(fi.method(2, 5));
	
	fi = (x, y) -> x + y;
	System.out.println(fi.method(10, 20));
	
	fi = (x, y) -> sum(x, y);
	System.out.println(fi.method(11, 12));
	
}

public static int sum(int x, int y) {
	return x+y;
}
}
