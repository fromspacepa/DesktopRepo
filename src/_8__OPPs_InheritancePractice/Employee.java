package _8__OPPs_InheritancePractice;

public class Employee extends Student{
	
	private String backGround;
	private String dateOfBirth;
	
	public Employee() {
		super();
		this.backGround = "";
		this.dateOfBirth = "";

	}
	
	public Employee(String firstName, String lastName, String backGround, String dateOfBirth, String address, String email, String phoneNo) {
		
		this.backGround = backGround;
		this.dateOfBirth = dateOfBirth;
		
	}
	
	public String getBackGround() {
		return backGround;
	}
	
	public void setBackGround(String backGround) {
		this.backGround = backGround;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}

	
		

	
	

