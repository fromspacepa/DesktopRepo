package _6a__OOPsPractice_Class_Instructor;

public class Instructor {//This is a Class and named Instructor.
	//Here following variables are declared:
	String firstName;
	String lastName;
	int age;
	String phoneNo;
	String address;
	String subject;
	String email;
	
	public Instructor() {//This is a default constructor.
		//Here following variables are initialized with default values:
		firstName = "";
		lastName = "";
		age = 0;
		phoneNo = "";
		address = "";
		subject = "";
		email = "";
	}
	
	public Instructor(String firstName, String lastName, int age, String phoneNo, String address, String subject, String email) {//This is a parameterized constructor.
		//Here following we are using a keyword "this":
		//A keyword "this" will refer to the variables out of the current scope of method body or in other words, will refer to the variables in the body of the class.
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.subject = subject;
		this.email = email;
	}
	

	@Override
	//Following method 'toString' is a special method that comes with Java, and it will get run any time that you print name of the object of this class,
	//so you will need to define this (toString) method for your class if you want the information to be printed in the cases that you print the name of the object.
	//The way that you can make sure your definition of the method 'toString' is valid, you will see a green arrow-up on the line number, or use the '@Override'
	//to see if your method 'toString' is correct/working.
	public String toString() {
		//This following is just going to print-out texts and a line when the object of this class:
		System.out.println("Objects of Class Instructor:\n-------------------------------------------");
		//This following is to substring the variable 'phoneNo' created above in the format of: (000) 000-0000, while the number is entered as: 0000000000.
		String tempPhone = "("+ phoneNo.substring(0, 3)+") "+phoneNo.substring(3, 6)+"-"+phoneNo.substring(6, 10);
		return "Instructors Information:\n\nFirst Name:\t" + firstName + "\nLast Name:\t" + lastName + "\nAge:\t\t" + age + "\nPhoneNo:\t" 
				+ tempPhone + "\nAddress:\t" + address + "\nSubject:\t" + subject + "\nEmail:\t\t" + email;
	}


}
