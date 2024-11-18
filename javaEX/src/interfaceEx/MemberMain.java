package interfaceEx;

public class MemberMain {

	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO(1L, "홍길동");
		
		MemberController c = new MemberController();
		c.insertMember(dto);
		
	}

}
