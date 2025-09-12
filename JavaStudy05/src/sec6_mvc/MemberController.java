package sec6_mvc;

public class MemberController {
	// main():사용자에게 전달 받은 DTO를 DAO의 insertMember()에게 전달
	// View <-> Controller <-> Model
	// DAO의 insertMember() 메서드를 호출하기 위한 객체 선언
	
	MemberDAO dao = new MemberDAO();
	
	// 멤버 메서드 : DAO의 insertMember()를 호출해서 DTO 전달
	public void insertMember(MemberDTO dto) {
		dao.insertMember(dto);
	}
}
