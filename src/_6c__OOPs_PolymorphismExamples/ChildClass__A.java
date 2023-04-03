package _6c__OOPs_PolymorphismExamples;

public class ChildClass__A extends ParentClass{
	
	private int age;
	private String phoneNo;
	private String major;
	
	public ChildClass__A() {
		super();
		this.age = 0;
		this.phoneNo = "";
		this.major = "";
		
	}
	public ChildClass__A(String firstName, String lastName, String dateOfBirth, String nationality, int age, String phoneNo, String major) {
		super(firstName, lastName, dateOfBirth, nationality);
		this.age = age;
		this.phoneNo = phoneNo;
		this.major = major;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		String title = "\n\n-->> ChildClass__A:\n(Child class of 'ParentClass'):\n";
		String sep = "______________________________________________________________________";
		String temPhone = "(" + phoneNo.substring(0, 3) + ") " + phoneNo.subSequence(3, 6) + "-"+ phoneNo.substring(6, 10);
		String tempDOB = getDateOfBirth().substring(0, 2) + "/" + getDateOfBirth().substring(2, 4) + "/" + getDateOfBirth().substring(4, 8);
		return title + sep + "\nFirst Name:\t" + getFirstName() + "\nLast Name:\t" + getLastName() + "\nDOB:\t\t" + tempDOB+ 
				"\nNationality:\t" + getNationality()+ "\nAge:\t\t" + age + "\nPhone No:\t" + temPhone + "\nMajor:\t\t" + major;
		
	}
}
