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

public class Employee_Child_SubClass extends Student_Child_SubClass {

	private String backGround;
	private String dateOfBirth;

	public Employee_Child_SubClass() {
		super();
		this.backGround = "";
		this.dateOfBirth = "";

	}

	public Employee_Child_SubClass(String firstName, String lastName, String backGround, String dateOfBirth,
			String address, String email, String phoneNo) {
		super(firstName, lastName, address, email, phoneNo);
		this.backGround = backGround;
		this.dateOfBirth = dateOfBirth;

	}

	public String getBackGround() {
		return backGround;
	}

	public void setBackGround(String backGround) {
		this.backGround = backGround;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		String nameClass = "\nObject of Class (Employee_Child_SubClass):";
		String sepLine = "\n===========================================================";
		String formatDOB = dateOfBirth.substring(0, 2) + "/" + dateOfBirth.substring(2, 4) + "/"
				+ dateOfBirth.substring(4, 8);
		String formatPhone = "(" + getPhoneNo().substring(0, 3) + ") " + getPhoneNo().substring(3, 6) + " "
				+ getPhoneNo().substring(6, 10);
		return nameClass + sepLine + "\nFirst Name:\t\t" + super.getFirstName() + "\nLast Name:\t\t"
				+ super.getLastName() + "\nBackground:\t\t" + backGround + "\nDate of Birth: \t\t" + formatDOB
				+ "\nHome Address:\t\t" + super.getAddress() + "\nEmail Address:\t\t" + super.getEmail()
				+ "\nPhone Number\t\t" + formatPhone;
	}

}
