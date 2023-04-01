package _8a__OOPs_PolymorphismPractice;

public class ChildClass__B extends ChildClass__A{
	
	private String address;
	
	public ChildClass__B() {
		super();
		this.address = "";
		
	}
	public ChildClass__B(String firstName, String lastName, String dateOfBirth, String nationality, int age, String phoneNo, String major, String address) {
		super(firstName, lastName, dateOfBirth, nationality, age, phoneNo, major);
		this.address = address;
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		String name = "\n\n-->> ChildClass__B:\n(Child class of 'Class__A' and a grand child class of 'ParentClass'):\n";
		String sept = "----------------------------------------------------------------------";
		String tempPhoneNo = "(" + getPhoneNo().substring(0, 3) + ") " + getPhoneNo().substring(3, 6) + "-" + getPhoneNo().substring(6, 10);
		String tempDOB = getDateOfBirth().substring(0, 2) + "/" + getDateOfBirth().substring(2, 4) + "/" + getDateOfBirth().substring(4, 8);
		return name + sept + "\nFirst Name:\t" + getFirstName() + "\nLast Name:\t" + getLastName() + "\nDate of Birth:\t" + tempDOB + 
				"\nNationality:\t" + getNationality()+ "\nAge:\t\t" + getAge() + "\nPhone No:\t" + tempPhoneNo + "\nMajor:\t\t" + getMajor() + 
				"\nAddress:\t" + address;
		
	}
	
	
	
	
	
	
	

}
