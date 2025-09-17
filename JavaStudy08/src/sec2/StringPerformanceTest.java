package sec2;

public class StringPerformanceTest {

	public static void main(String[] args) {
		// String
		long startTime = System.nanoTime();
		String str = "";
		for(int i=0; i<10000; i++) {
			str += i; 
		}
		long endTime = System.nanoTime();
		System.out.println("String: " + (endTime - startTime) + "ns");
		
		// StringBuilder
		startTime = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10000; i++) {
			sb.append(i);
		}
		endTime = System.nanoTime();
		System.out.println("StringBuilder: " + (endTime - startTime) + "ns");
		
		// StringBuffer
		startTime = System.nanoTime();
		StringBuffer sbf = new StringBuffer();
		for(int i=0; i<10000; i++) {
			sbf.append(i);
		}
		endTime = System.nanoTime();
		System.out.println("StringBuffer: " + (endTime - startTime) + "ns");
	}

}
