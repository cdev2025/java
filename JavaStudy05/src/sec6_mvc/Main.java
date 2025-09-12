package sec6_mvc;

public class Main {

	public static void main(String[] args) {
		// 입력 화면이라고 가정하고 DTO 객체 생성하면서 초기화
		MemberDTO dto = new MemberDTO("abcd", "1234", "홍길도", "010-1234-5678", "서울시");
		
		// 컨트롤러에게 dto 전달
		MemberController c = new MemberController();
		c.insertMember(dto);
	}

}
