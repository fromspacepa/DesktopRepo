package _6__OOPs_ClassObjectExamples;

// Below here is the sample example of a class, none of the variables/attributes are encapsulated and inherited from any other class.

public class Student {// This is a Class and named Student.
	// Here following variables are declared:
	String firstName;
	String lastName;
	int age;
    String ssn;
	String subject;
	String email;
	String phoneNo;
	String address;
	
	public Student() {// This is a default constructor.
		//NOTE: The job of any constructor is to initialize all of the variables of a class and help us to create object(s) of the class.
		firstName = "";
		lastName = "";
		age = 0;
		ssn = "";
		subject = "";
		email = "";
		phoneNo = "";
		address = "";

	}
	
	public Student(String firstName, String lastName, int age, String ssn, String subject, String email, String phoneNo, String address) {//This is a parameterized constructor.
		// Here following we are using a keyword "this":
		// A keyword "this" will refer to the variables out of the current scope or in other words, will refer to the variables in the body of the class.
		// OR we can say that "this" keyword will call on the initially declared variables in the body of this class.
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	    this.ssn = ssn;
		this.subject = subject;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;

		
	}
	/*
	 * Example of String Manipulation:
	 * >>> The meaning of "String Manipulation" is basically playing around with a String/Strings.
	 * ___Create a method to print out the student information (Values that are assigned to the variables
	 * in the "RunnerClass") in the following format: 
	 * Basically, all the information is initialized and assigned to the above variables in the RunnerClass
	 * and when you call on the following method in your RunnerClass all the information is going to be printed
	 * in the following format for each object of the above class Student.
	 *  
	 * --------------------------------------------
	 * Student Information:
	 * First Name:    value assigned              
	 * Last Name:     value assigned
	 * Age:           value assigned           
	 * SSN:           ***-**-0000
	 * Subject:       value assigned           
	 * Email:         value assigned
	 * Phone No:      (000) 000-0000
	 * Address:       value assigned
	 * --------------------------------------------
     *
	 */
	public void printInfo() {// We create this method which will print-out the content/data of each object of the above class in the following format just by calling 
                             // the method "printInfo();"... You can see the example of this in the "RunnerClass_Student.
		String separator = "------------------------------------------------\n";
		String tempSSN = "***-**-" + ssn.substring(7);// Here the "substring();" method is going to print the last 4 digits of SSN and 
		// by creating a variable "tempSSN" is going to print "***-**-3321" the stars and last 4 digits of SSN with the help of "substring" method.
		String line1 = "First Name:\t" + firstName + "\nLast Name:\t" + lastName + "\n";
		String line2 = "Age:\t\t" + age + "\nSSN:\t\t" + tempSSN + "\n";
	    String line3 = "Subject:\t" + subject + "\nEmail:\t\t" + email + "\n";
	    String line4 = "Phone No:\t" + phoneNo + "\nAddrss:\t\t" + address + "\n";
	    
	    System.out.println(separator + line1 + line2 + line3 + line4 + separator);//This is to Concatenate the above syntaxes and print it.  

   }
		

	

}
