package _6a3__Hierarchical_Inheritance_Example;

public class Child2 extends Parent{
	
	private String nationality;
	private String address;
	private String phoneNo;
	
	public Child2() {
		super();
		this.nationality = "";
		this.address = "";
		this.phoneNo = "";
		
	}
	public Child2(String firstName, String lastName, int age, String nationality, String address, String phoneNo) {
		super(firstName, lastName, age);
		this.nationality = nationality;
		this.address = address;
		this.phoneNo = phoneNo;
		
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	public String toString() {
		String formatPhone = "(" + phoneNo.substring(0, 3) + ") " + phoneNo.substring(3, 6) + " " + phoneNo.substring(6, 10);
		return "\nFirst Name:\t" + super.getFirstName() + "\nLast Name:\t" + super.getLastName() + "\nAge:\t\t" + super.getAge()
		+ "\nNationality:\t" + nationality + "\nAddress:\t" + address + "\nPhone No:\t" + formatPhone;
	}

}
