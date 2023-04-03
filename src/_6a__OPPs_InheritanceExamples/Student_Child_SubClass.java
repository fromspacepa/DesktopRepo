package _6a__OPPs_InheritanceExamples;

/* Object Oriented Programming (OOPs) Pillar number 1:
 * >>> INHERITANCE (SubClass and SuperClass):
 * 
 * Q: What does the word Inheritance mean to you?
 * A: When someone pass-on/away he/she leaves his/her belongings to someone else, in most cases to someone in the family or he/she can choose 
 * who he/she wants to give his/her belongings to, and that would be considered as Inheritance or Heritage; 
 * __So, we have similar concept in coding in Object Oriented Programming (OOPs) fashion that it is possible to inherit attributes/variables, 
 * methods, from one class (Super/Parent Class) to another class (Sub/Child Class) just by using the keyword "extends".
 * __We group the "Inheritance Concept" into two categories:
 * 1) SubClass (ChildClass) <-- the class that inherits from another class.
 * 2) SuperClass (ParentClass) <-- the class being inherited from.
 * __As mentioned above to inherit from you would need to use the keyword "extends", it would only help in inheriting attributes and methods, 
 * but not any constructors. 
 * __To inherit constructors, you would need to use the method "super()" (for inheriting a default constructor). And to inherit the parameterized
 * constructor, you would need to use the method "super(firstName, lastName, etc), with all the parameters in the argument of parameterized 
 * constructor. 
 * 
 * >>> Below here is the example of childClass (being a grandChildClass of initial parentClass) inheriting from a class which is the childClass 
 * of another parentClass:
 * 
 * >>> Hints:
 * __Keyword "extends" is used to inherit from another class to the current class, being a sub/childClass.
 * __Keyword "private" is used to encapsulate/hid/secure attributes into the current class and secured from out side classes; in case, you want to
 * get access to the encapsulated or hidden attributes, you would need to create/call on methods called "Getters and Setters" for every single 
 * attribute that you have encapsulated.
 * __Keyword "this" is used to call on encapsulated attributes in the same class.
 * __Methods "Getters and Setters", method "get()" is used to read only the encapsulated attributes
 * and method "set()" is used to change the value of encapsulated attributes.
 */

// Here the class name is "Student"; the keyword "extends" is to inherit all of the methods and variables
// but not constructors from a parent/super class; the parent/super class here inheriting from is named: IheritableClass.

public class Student_Child_SubClass extends Parent_SuperClass {// This here is the child/sub-class which extends from a
																// parent/super class (InheritableClass).

	// This following is the keyword "private" it is used to encapsulate (make the
	// variable accessible/private to the current class only) variable(s):
	private double gpa;// Here the keyword "private" is going to encapsulate the variable "gpa".
	private String major;// Same here the keyword "private" is going to encapsulate the variable "major".

	public Student_Child_SubClass() {// This here is the default constructor; the argument of a default constructor
										// is always empty, which means the argument should be empty.
		// Keyword "super" means that you are referring to the parent class.
		// super.setFirstName("");// Using method "super." will only refer to a single
		// variable in the parent/super class, which is "firstName".
		// super.setLastName("");// This is also refers to a single variable in the
		// parent/super class.
		super();// This refers to a default constructor in the parent/super class.

		// Keyword "this" refers to the current class; which means that your are
		// referring to a variable of the current class.
		this.gpa = 0.0;
		this.major = "";
	}

	// The following here is the parameterized constructor, which is holding
	// temporary variables (which are the inputs to the earlier initialized
	// variables) in the class.
	public Student_Child_SubClass(String firstName, String lastName, int age, String address, String email,
			String phoneNo, double gpa, String major) {
		super(firstName, lastName, age, address, email, phoneNo);// Here this method "super" is inheriting a
																	// parameterized constructor from a parent/super
																	// class.
		this.gpa = gpa;
		this.major = major;
	}

	public Student_Child_SubClass(String firstName, String lastName, String address, String email, String phoneNo) {
		super(firstName, lastName, address, email, phoneNo);

	}

	// >>>>> NOTE:
	// While using keyword "private" to encapsulate the variable(s) you would need
	// to have/write method "get" known as a "getter" and method "set" known as a
	// "setter"
	// for each variable that is encapsulated so that the variable(s) is/are
	// accessible from outside the current class.
	// method "get" is used to access the encapsulated attribute(s)/variable(s) from
	// the parent/super class.
	// method "set" is used to set/update the encapsulated attribute(s)/variable(s)
	// from the parent/super class.
	// Following here are the methods "get/getters" and "set/setters" for each
	// variable that is encapsulated above here in this class.

	public double getGpa() {// Here this is the method "get" known as "getter"
		return gpa;
	}

	//
	public void setGpa(double gpa) {// Here this is the method "set" known as "setter"
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {// Here this is the method "toString" which could be modified as how you want to
								// print-out the information refers to the current class.
		System.out.println("\n1st Constructor of Child/Sub-Class (Student_Child_SubClass):");
		String sep = "************************************************************";
		String phoneNum = "(" + getPhoneNo().substring(0, 3) + ") " + getPhoneNo().substring(3, 6) + "-"
				+ getPhoneNo().substring(6, 10);
		return sep + "\nFirst Name:\t" + getFirstName() + "\nLast Name:\t" + getLastName() + "\nAge:\t\t" + getAge()
				+ "\nAddress:\t" + getAddress() + "\nEmail:\t\t" + getEmail() + "\nPhone No:\t" + phoneNum
				+ "\nGPA:\t\t" + gpa + "\nMajor:\t\t" + major + "\n";
	}

	public void printInfo_of_2nd_Constructor() {
		String nameClass = "\n2nd Constructor of Child/Sub-Class (Student_Child_SubClass):";
		String sepLine = "\n===========================================================";
		String formatPhone = "(" + getPhoneNo().substring(0, 3) + ") " + getPhoneNo().substring(3, 6) + " "
				+ getPhoneNo().substring(6, 10);
		System.out.println(nameClass + sepLine + "\nFirst Name:\t" + getFirstName() + "\nLast Name:\t" + getLastName()
				+ "\nHome Add:\t" + getAddress() + "\nEmail Add:\t" + getEmail() + "\nPhone No:\t" + formatPhone);
	}
}
