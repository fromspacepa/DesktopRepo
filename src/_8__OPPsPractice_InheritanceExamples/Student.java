package _8__OPPsPractice_InheritanceExamples;

public class Student extends InheritableClass {
	
	private double gpa;
	private String major;
	
	public Student() {
		//Keyword super means that you are referring to the parent class.
		//super.setFirstName("");//This is to refer to a single variable in the parent/super class.
		//super.setLastName("");//This is to refer to a single variable in the parent/super class.
		super();//This refer to a constructor with it's variable(s).
		
		//Keyword this means that your are referring to the current class.
		this.gpa = 0.0;
		this.major = "";
	}
	
	public Student(String firstName, String lastName, int age, String address, String email, String phoneNo, double gpa, String major) {
		super(firstName, lastName, age, address, email, phoneNo);
		this.gpa = gpa;
		this.major = major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
		@Override
		public String toString(){
			System.out.println("CLASS STUDENT:");
			String sep = "***********************************";
			String phoneNum = "("+getPhoneNo().substring(0, 3)+") "+getPhoneNo().substring(3, 6)+"-"+getPhoneNo().substring(6, 10);
			return sep + "\nFirst Name:\t" + getFirstName() + "\nLast Name:\t" + getLastName() + "\nAge:\t\t" + getAge() + "\nAddress:\t" + 
					getAddress() + "\nEmail:\t\t" + getEmail() + "\nPhone No:\t" + phoneNum + "\nGPA:\t\t" + gpa + "\nMajor:\t\t" + major;
					
	}
}
