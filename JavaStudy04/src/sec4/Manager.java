package sec4;

public class Manager extends Employee{
	private String position;

	public Manager(String empNo, String empName, String empDpt, String position) {
		super(empNo, empName, empDpt);
		this.position = position;
	}
	
	public void showManagerInfo() {
		showEmpInfo();
		System.out.printf("직위: %s\n", position);
	}
}
