package _8a__OOPs_PolymorphismPractice;

public class ChildClass__C extends ParentClass{
	
	private String emailAdd;
	private String phoneNo;
	private String address;

	public ChildClass__C() {
		super();
		this.emailAdd = "";
		this.phoneNo = "";
		this.emailAdd = "";
		
	}
	public ChildClass__C(String firstName, String lastName, String dateOfBirth, String nationality, String emailAdd, String phoneNo, String address) {
		super(firstName, lastName, dateOfBirth, nationality);
		this.emailAdd = emailAdd;
		this.phoneNo = phoneNo;
		this.address = address;
		
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAdderss() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		String name = "\n\n-->> ChildClass__C:\n(Child class of a 'ParentClass')\n";
		String sep = "======================================================================";
		String phoneFormat = "(" + phoneNo.substring(0, 3) + ") " + phoneNo.substring(3, 6) + "-" + phoneNo.substring(6, 10);
		String tempDOB = getDateOfBirth().substring(0, 2) + "/" + getDateOfBirth().substring(2, 4) + "/" + getDateOfBirth().substring(4, 8);
		return name + sep + "\nFirst Name:\t" + getFirstName() + "\nLast Name:\t" + getLastName() + "\nDOB:\t\t" + tempDOB 
		+ "\nNationality:\t" + getNationality() + "\nEmail Address:\t" + emailAdd + "\nPhone No:\t" + phoneFormat + "\nAdress:\t\t" + address;
	}
	
	

}
