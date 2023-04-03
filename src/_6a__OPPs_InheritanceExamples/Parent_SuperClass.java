package _6a__OPPs_InheritanceExamples;

/* Object Oriented Programming (OOPs) Pillar number 1:
 * >>> INHERITANCE (SubClass and SuperClass):
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

public class Parent_SuperClass {// Here this is the class named: InheritableClass

	// This following is the keyword "private" it is used to encapsulate (make the
	// variable accessible/private to the current class only) variable(s):
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	private String email;
	private String phoneNo;

	public Parent_SuperClass() {// Here this is the default constructor.
		// Keyword "this" refers to the current class; which means that your are
		// referring to a variable of the current class.
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.address = "";
		this.email = "";
		this.phoneNo = "";

	}

	public Parent_SuperClass(String firstName, String lastName, int age, String address, String email, String phoneNo) {// Here
																														// this
																														// is
																														// the
																														// parameterized
																														// constructor.
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;

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

	public Parent_SuperClass(String firstName, String lastName, String address, String email, String phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;

	}

	public String getFirstName() {// Here this is the method "get" known as "getter"
		return firstName;
	}

	public void setFirstName(String firstName) {// Here this is the method "set" known as "setter"
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		String nameClass = "\nObject of Class (Parent_SuperClass):";
		String sep = "\n***********************************************************";
		String phoneNum = "(" + phoneNo.substring(0, 3) + ") " + phoneNo.substring(3, 6) + "-"
				+ phoneNo.substring(6, 10);
		return nameClass + sep + "\nFirst Name:\t" + firstName + "\nLast Name:\t" + lastName + "\nAge:\t\t" + age
				+ "\nAddress:\t" + address + "\nEmail:\t\t" + email + "\nPhone No:\t" + phoneNum;

	}

}
