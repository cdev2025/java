package sec6_mvc;

// 회원 정보 DTO
public class MemberDTO {
	// 멤버 필드
	private String memId;
	private String memPass;
	private String memName;
	private String memPhone;
	private String memAddress;
	
	// 생성자
	public MemberDTO(String memId, String memPass, String memName, String memPhone, String memAddress) {
		this.memId = memId;
		this.memPass = memPass;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memAddress = memAddress;
	}

	// Getters & Setters
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPass() {
		return memPass;
	}

	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemAddress() {
		return memAddress;
	}

	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}

	@Override
	public String toString() {
		return "MemberDTO [memId=" + memId + ", memPass=" + memPass + ", memName=" + memName + ", memPhone=" + memPhone
				+ ", memAddress=" + memAddress + "]";
	}
	
	
}
