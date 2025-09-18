package sec01;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// 배열 Stream 만들기
		String[] arr = new String[] {"y", "n", "j", "c", "h"};
		printStream("배열 스트림", Arrays.stream(arr));
		printStream("배열 일부 스트림", Arrays.stream(arr, 1, 4));
		
		// builder()를 이용
		Stream<String> builderStream = Stream.<String>builder().add("ynjch").add("eunjy").add("velog").build();
		printStream("Builder 스트림", builderStream);
		
		// iterate()
		Stream<Integer> iteratedStream = Stream.iterate(10, n->n+2).limit(3);
		printStream("Iterate 스트림", iteratedStream);
		
	}
	
	// Stream<Object>를 처리하기 위한 메서드
	public static <T> void printStream(String comment, Stream<T> stream) {
		System.out.println(comment + " : " + Arrays.toString(stream.toArray()));
	}

}
