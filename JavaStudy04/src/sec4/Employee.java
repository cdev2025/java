package sec4;

public class Employee {
	private String empNo;
	private String empName;
	private String empDpt;
	
	public Employee(String empNo, String empName, String empDpt) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empDpt = empDpt;
	}
	
	public void showEmpInfo() {
		System.out.printf("사원번호: %s\n사원명: %s\n부서: %s\n" , empNo, empName, empDpt);
	}
}
