package _8__OPPs_InheritancePractice;

// Here the class name is "Student"; the keyword "extends" is to inherit all of the methods and variables
// but not constructors from a parent/super class; the parent/super class here inheriting from is named: IheritableClass.
                    
public class Student extends InheritableClass {// This here is the child/sub-class which extends from a parent/super class (InheritableClass).

	// This following is the keyword "private" it is used to encapsulate (make the variable accessible/private to the current class only) variable(s):
	private double gpa;// Here the keyword "private" is going to encapsulate the variable "gpa".
	private String major;// Same here the keyword "private" is going to encapsulate the variable "major".
	
	public Student() {// This here is the default constructor; the argument of a default constructor is always empty, which means the argument should be empty.
		// Keyword "super" means that you are referring to the parent class.
		// super.setFirstName("");// Using method "super." will only refer to a single variable in the parent/super class, which is "firstName".
		// super.setLastName("");// This is also refers to a single variable in the parent/super class.
		super();// This refers to a default constructor with it's initialized variable(s) in the parent/super class.
		
		// Keyword "this" refers to the current class; which means that your are referring to a variable of the current class.
		this.gpa = 0.0;
		this.major = "";
	}
	// The following here is the parameterized constructor, which is holding temporary variables (which are the inputs to the earlier initialized variables) in the class.
	public Student(String firstName, String lastName, int age, String address, String email, String phoneNo, double gpa, String major) {
		super(firstName, lastName, age, address, email, phoneNo);// Here this method "super" is inheriting a parameterized constructor from a parent/super class.
		this.gpa = gpa;
		this.major = major;
	}
	
	// >>>>> NOTE: 
	// While using keyword "private" to encapsulate the variable(s) you would need to have/write method "get" known as a "getter" and method "set" known as a "setter"
	// for each variable that is encapsulated so that the variable(s) is/are accessible from outside the current class.
	// method "get" is used to access the encapsulated attribute(s)/variable(s) from the parent/super class.
	// method "set" is used to set/update the encapsulated attribute(s)/variable(s) from the parent/super class.
	// Following here are the methods "get/getters" and "set/setters" for each variable that is encapsulated above here in this class.
	
	public double getGpa() {// Here this is the method "get" known as "getter"
		return gpa;
	}
	
	// 
	public void setGpa(double gpa) {// Here this is the method "set" known as "setter"
		this.gpa = gpa;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
		@Override
		public String toString(){// Here this is the method "toString" which could be modified as how you want to print-out the information refers to the current class. 
			System.out.println("CLASS STUDENT:");
			String sep = "***********************************";
			String phoneNum = "("+getPhoneNo().substring(0, 3)+") "+getPhoneNo().substring(3, 6)+"-"+getPhoneNo().substring(6, 10);
			return sep + "\nFirst Name:\t" + getFirstName() + "\nLast Name:\t" + getLastName() + "\nAge:\t\t" + getAge() + "\nAddress:\t" + 
					getAddress() + "\nEmail:\t\t" + getEmail() + "\nPhone No:\t" + phoneNum + "\nGPA:\t\t" + gpa + "\nMajor:\t\t" + major + "\n";
					
	}
}
