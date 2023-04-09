package _6e__OOPs_ScannerExamples;

public class A {
	
	private String name;
	private int age;
	private String phoneNo;
	
	public A() {
		super();
		this.name = "";
		this.age = 0;
		this.phoneNo = "";
		
	}
	public A(String name, int age, String phoneNo) {
		this();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setPhoneNo(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "";
		
		
		
	}
	

}
