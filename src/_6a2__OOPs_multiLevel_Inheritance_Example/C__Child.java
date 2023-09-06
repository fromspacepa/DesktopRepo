package _6a2__OOPs_multiLevel_Inheritance_Example;

public class C__Child extends B__Child{
	
	private String phoneNo;
	
	
	public C__Child() {
		super();
		this.phoneNo = "";
		
	}
	public C__Child(String lastName, String firstName, int age, String phoneNo) {
		super(lastName, firstName, age);
		this.phoneNo = phoneNo;
		
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	public String toString() {
		String phoneFor = "(" + phoneNo.substring(0, 3) + ") " + phoneNo.substring(3, 6) + "-" + phoneNo.substring(6, 10);
		return "\nLast Name:\t" + super.getLastName() + "\nFirst Name:\t" + super.getFirstName() + "\nAge:\t\t"+ super.getAge() + "\nPhone No:\t" + phoneFor;
	}
	

}
