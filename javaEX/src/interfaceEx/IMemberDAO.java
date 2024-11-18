package interfaceEx;

import java.util.ArrayList;

public interface IMemberDAO {
	
	// 회원 등록
	public void insertMember(MemberDTO dto);
	
	// 회원 정보 삭제
	public void deleteMember(Long memId);
	
	// 회원 조회 : 전체 회원 정보 조회
	// DB에서 전체 회원 정보 반환
	public ArrayList<MemberDTO> getAllMember();
	
	// 회원 수정
	public void updateMember(MemberDTO dto);

}
