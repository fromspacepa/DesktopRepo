package _6a1__OOPs_singleInheritance_Example;

public class ParentClass {
	
	private String firstName;
	private int age;
	
	public ParentClass() {
		super();
		this.firstName = "";
		this.age = 0;
		
	}
	
	public ParentClass(String firstName, int age) {
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
