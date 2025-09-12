package sec6_mvc;

import java.util.ArrayList;

public interface IMemberDAO {
	// 회원등록 : 1명의 회원 정보를 받아서 DB에 저장하고 반환값은 없음
	public void insertMember(MemberDTO dto);
	
	// 회원정보 삭제 : 회원아이디(memId)를 전달 받아서
	// DB에서 해당되는 회원 찾아서 삭제하고 종료. 반환값 업음
	public void deleteMember(String memId);
	
	// 전체 회원 정보 조회 : DB에서(회원테이블) 전체 회원 정보를 반환
	public ArrayList<MemberDTO> getAllMember();
	
	// 회원 정보 수정 : 1명의 수정된 회원 정보를 전달하고, DB 저장하고 종료. 반환값 없음
	public void updateMember(MemberDTO dto);
}
