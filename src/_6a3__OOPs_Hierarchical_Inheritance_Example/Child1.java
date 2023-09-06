package _6a3__OOPs_Hierarchical_Inheritance_Example;

public class Child1 extends Parent{
	
	private String major;
	
	public Child1() {
		super();
		this.major = "";
		
	}
	public Child1(String lastName, String firstName, int age, String major) {
		super(lastName, firstName, age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	
	public String toString() {
		return "\nLast Name:\t" + super.getLastName() + "\nFirst Name:\t" + super.getFirstName() + "\nAge:\t\t" + super.getAge() + "\nMajor\t\t" + major;
	}
}
