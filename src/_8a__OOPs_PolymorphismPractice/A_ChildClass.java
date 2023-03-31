package _8a__OOPs_PolymorphismPractice;

public class A_ChildClass extends ParentClass{
	
	private int age;
	private String phoneNo;
	private String major;
	
	public A_ChildClass() {
		super();
		this.age = 0;
		this.phoneNo = "";
		this.major = "";
		
	}
	public A_ChildClass(String firstName, String lastName, String dateOfBirth, String nationality, int age, String phoneNo, String major) {
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
		String sep = "\n***********************************\n";
		String title = "Child Class___A:";
		String temPhone = "(" + phoneNo.substring(0, 3) + ") " + phoneNo.subSequence(3, 6) + "-"+ phoneNo.substring(6, 10); 
		return title + sep + super.toString() + "\nAge:\t\t" + age + "\nPhone No:\t" + temPhone + "\nMajor:\t\t" + major;
		
	}
}
