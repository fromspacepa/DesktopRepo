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
		//NOTE: The job of any constructor is to initialize all of the variables of a class and help us to create object(s) of the class.
		firstName = "";
		lastName = "";
		age = 0;
		phoneNo = "";
		address = "";
		subject = "";
		email = "";
	}
	// Here following is the Parameterized Constructor, all the variables you see in the argument are called temporary variables. 
	// NOTE: All the original variables are declared in the class and initialized in the default constructor above.
	// and while use keyword "this" you will be to use similar variables names in the argument of your Parameterized Constructor. such as firstName as a firstName;
	// in case of not using keyword "this" then you won't be able to use similar names, you will then need to use different names, such as newFirstName to make a difference with the
	// initially declared and initialized variable name: firstName.
	// But, using keyword "this" is always recommended in order to demonstrate your code more formal and professional.
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
	
	/* Following method toString:
	 * "toString" is a special method that comes with Java, and it will get run any time you call/print the name of object(s) of the class; for our example in the Eclipse if you
	 * call object name of this class in the Runner Class (RunnerClass-Instructor) of this class it will print out all the information as per the modification of toString method below.
	 * Q: What does the toString method do?
	 * A: It basically give you the functionality of that ArrayList has; it prints the all the information of object(s) if you call/print the name of object in the following format:
	 * System.out.println(obj1).
	 * Now, when you want to do something like that, how does Java know to print the information, what format should Java print it. Java does not know, __So what you do? You will need to
	 * define the format in your "toString" method. as shown the practical example below here:
	  	 */
	@Override // <<--This annotation will help with correction of method "toString", 
	          //in case the method toString is not written correct, the annotation "@Override" will help in indicating the red underline toString.
	public String toString() {
		//This following is just going to print-out texts and a line when the object of this class:
		System.out.println("Objects of Class Instructor:\n-------------------------------------------");
		//This following is to substring the variable 'phoneNo' created above in the format of: (000) 000-0000, while the number is entered as: 0000000000.
		String tempPhone = "("+ phoneNo.substring(0, 3)+") "+phoneNo.substring(3, 6)+"-"+phoneNo.substring(6, 10);
		return "Instructors Information:\n\nFirst Name:\t" + firstName + "\nLast Name:\t" + lastName + "\nAge:\t\t" + age + "\nPhoneNo:\t" 
				+ tempPhone + "\nAddress:\t" + address + "\nSubject:\t" + subject + "\nEmail:\t\t" + email;
	}


}
