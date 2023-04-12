package _6a2__multiLevel_Inheritance_Example;

public class B__Child extends A__Parent{
	private String lastName;
	
	
	public B__Child() {
		super();
		this.lastName = "";
		
	}
	public B__Child(String lastName, String firstName, int age) {
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
