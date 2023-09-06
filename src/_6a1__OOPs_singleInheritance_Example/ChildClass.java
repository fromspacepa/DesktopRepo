package _6a1__OOPs_singleInheritance_Example;

public class ChildClass extends ParentClass {
	
	private String lastName;
	
	
	public ChildClass() {
		super();
		this.lastName = "";
		
	}
	public ChildClass(String lastName, String firstName, int age) {
		super(firstName, age);
		this.lastName = lastName;
				
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String toString() {
		return "\nLast Name:\t" + lastName + "\nFirst Name:\t" + super.getFirstName() + "\nAge:\t\t" + super.getAge();
	}

}
