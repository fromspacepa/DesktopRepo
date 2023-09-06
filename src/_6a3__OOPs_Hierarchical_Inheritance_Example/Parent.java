package _6a3__OOPs_Hierarchical_Inheritance_Example;

public class Parent {
	
	private String lastName;
	private String firstName;
	private int age;
	
	public Parent() {
		super();
		this.lastName = "";
		this.firstName = "";
		this.age = 0;
		
	}
	
	public Parent(String lastName, String firstName, int age) {
		this();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "\nLast Name:\t" + lastName + "\nFirst Name:\t" + firstName + "\nAge:\t\t" + age;
	}


}
