package sec6_mvc;

import java.util.ArrayList;

public class MemberDAO implements IMemberDAO {

	@Override
	public void insertMember(MemberDTO dto) {
		// 컨트롤러에게 전달 받은 값을 DB에 저장했다고 가정
		// DB에 dto 내용 저장하는 부분 구현해야 하지만....
		System.out.println("회원 등록 성공");
		
		//dto 값 출력
		System.out.println(dto);
		/*
		System.out.println("ID : " + dto.getMemId());
		System.out.println("비밀번호 : " + dto.getMemPass());
		System.out.println("성명 : " + dto.getMemName());
		System.out.println("전화: : " + dto.getMemPhone());
		System.out.println("주소 : " + dto.getMemAddress());*/
	}

	@Override
	public void deleteMember(String memId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MemberDTO> getAllMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		
	}


}
