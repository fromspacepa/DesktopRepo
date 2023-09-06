package _6a2__OOPs_multiLevel_Inheritance_Example;

public class A__Parent {
	private String firstName;
	private int age;
	
	public A__Parent() {
		super();
		this.firstName = "";
		this.age = 0;
		
	}
	
	public A__Parent(String firstName, int age) {
		this();
		this.firstName = firstName;
		this.age = age;
		
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
		return "\nFirst Name:\t" + firstName + "\nAge:\t\t" + age;
	}


}
