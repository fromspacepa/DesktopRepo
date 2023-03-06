package oopsPractice;

public class Instructor {
	
	String firstName;
	String lastName;
	int age;
	String phoneNo;
	String address;
	String subject;
	String email;
	
	public Instructor() {
		firstName = "";
		lastName = "";
		age = 0;
		phoneNo = "";
		address = "";
		subject = "";
		email = "";
	}
	
	public Instructor(String firstName, String lastName, int age, String phoneNo, String address, String subject, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.subject = subject;
		this.email = email;
	}
	

	@Override
	public String toString() {
		System.out.println("Objects of Class Instructor:\n-------------------------------------------");
		String tempPhone = "("+ phoneNo.substring(0, 3)+") "+phoneNo.subSequence(3, 6)+"-"+phoneNo.substring(6, 10);
		return "Instructors Information:\n\nFirst Name:\t" + firstName + "\nLast Name:\t" + lastName + "\nAge:\t\t" + age + "\nPhoneNo:\t" 
				+ tempPhone + "\nAddress:\t" + address + "\nSubject:\t" + subject + "\nEmail:\t\t" + email;
	}


}
