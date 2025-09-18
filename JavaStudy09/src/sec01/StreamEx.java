package sec01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// ------Stream 생성-----------
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
		
		// range(start, end)와 rangeClosed(start, end)
		IntStream rangeStream = IntStream.range(1,  5); // 1~4
		IntStream rangeClosedStream = IntStream.rangeClosed(1, 5); // 1~5
		printStream("Range 스트림", rangeStream);
		printStream("RangeClosed 스트림", rangeClosedStream);
		
		// chars() : String.chars() = 문자열 -> char배열로
		IntStream charStream = "YNJCH".chars();
		printStream("chars 스트림", charStream);
		
		// splitAsStream()
		Stream<String> splitStream = Pattern.compile(", ").splitAsStream("Dog, Cat, Pig");
		printStream("splitAsStream 스트림", splitStream);
		
		// concat()
		Stream<String> concatStream = Stream.concat(Stream.of("Tiger", "Lione"), Stream.of("Rabbit", "Monkey", "Wolf"));
		printStream("Concat 스트림", concatStream);
		
		// ------가공 연산 : Filter, Sorted, Map 등-----------
		String[] animalArray = {"LEON", "TIGER", "CEBRA", "CEBRA", "OSO"};
		List<String> animalList = Arrays.asList(animalArray);
		printStream("Filter 스트림 (contains 'O')", animalList.stream().filter(str->str.contains("O")));
		printStream("Filter 스트림 (startwWith 'C')", animalList.stream().filter(str->str.startsWith("C")));
		printStream("기본 오름차순 정렬", animalList.stream().distinct().sorted()); // 중복요소 제거, 오름차순 정렬
		printStream("내림차순 정렬", animalList.stream().sorted(Comparator.reverseOrder())); // 내림차순 정렬, 중복요소 제거 X
		printStream("원본 확인: " , animalList.stream()); // stream은 원본을 변경 X
		// map() : Stream내의 값들이 모두 특정 값으로 변환 될 수 있도록 함
		printStream("대문자'O'가 들어있는 모든 문자열 소문자로 변경", animalList.stream().filter(str->str.contains("O")).map(String::toLowerCase));
		printStream("원본 확인: " , animalList.stream()); // stream은 원본을 변경 X
		
		// Integer 타입의 리스트 초기화
		List<Integer> intList = Arrays.asList(3, 7, -4, 6, 0, 2);
		
		// 0보다 큰 수를 필더링하는 스트림 연산
		// filter 메서드를 사용해 조건에 맞는 요소만 추출
		Stream<Integer> filteredStream = intList.stream().filter(i -> i>0);
		printStream("0보다 큰 수", filteredStream);
		
		// IntStream 예제
		// 1부터 5까지 출력
		IntStream.rangeClosed(1, 5).forEach(System.out::println);
		
		// 10개 무작위 수를 생성하고 합계 계산
		int sum = IntStream.generate(() -> (int) (Math.random() * 100)).limit(10).sum();
		System.out.println("Sum: " + sum);
		
		// 배열에서 짝수만 필터링하고 출력
		int[] numbers = {1, 2, 3, 4, 5, 6};
		IntStream.of(numbers).filter(n-> n%2==0).forEach(System.out::println);
	}
	
	// Stream<Object>를 처리하기 위한 메서드
	public static <T> void printStream(String comment, Stream<T> stream) {
		System.out.println(comment + " : " + Arrays.toString(stream.toArray()));
	}
	
	// IntStream 처리하기 위한 메서드
	public static void printStream(String comment, IntStream stream) {
		System.out.println(comment + " : " + Arrays.toString(stream.toArray()));
	}

	
	
}
