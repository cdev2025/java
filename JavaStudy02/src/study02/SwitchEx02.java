package study02;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		int dayType = 2;
		String fruit = "사과";
		
		// 1)요일 타입
		String dayMsg = switch(dayType) {
			case 1, 2, 3, 4, 5 -> "평일입니다.";
			case 6, 7 -> "주말입니다.";
			default -> "알 수 없는 값";
		};
		System.out.println(dayMsg);
		
		String color = switch(fruit) {
			case "사과" -> {
					//////
					System.out.println("추가 작업 중입니다....");
					//////
					yield "빨간 과일";
			}
			case "바나나" -> "노란 과일";
			default -> "색상 정보 없음";
		};
		System.out.println(color);
	}

}
