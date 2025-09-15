package sec1;

public class BookMain {

	public static void main(String[] args) {
		// 입력화면이라고 가정하고 DTO 객체 생성하면서 초기화
		BookDTO dto = new BookDTO("A000101", "JAVA의 정석", 35000, "남궁성", "2020-09-09", "도우출판");
		
		// 컨트롤러에게 dto 전달
		BookController bc = new BookController();
		bc.insertBook(dto);
	}

}
