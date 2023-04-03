package _6c__OOPs_PolymorphismExamples;


   /* Object Oriented Programming (OOPs) Pillar number 3:
    * >>> POLYMORPHISM:
    * 
    * Here keyword 'extends' is used to inherit the class Object from java. (keyword 'extends' is used in the concept of Inheritance)
    * while you use the keyword 'extends' it will inherit all the attributes(variables) and methods from the parent class, but
    * it cannot inherit the constructors; in order to inherit constructor(s), you will need to use method 'super()'; 
    * more about method 'super()' explanation is given below where I used it.
    */
public class ParentClass extends Object{
	
   /* Here keyword 'private' is used to Encapsulate variables, (keyword 'private' is used in the concept of Encapsulation)
    * it makes the attribute/variable to be only accessed within the current class it is used. However, it is possible to access these private attributes, 
	* to access them by using public methods: Getters and Setters, you will need to either import the public get and set methods from java for every single 
	* private attribute, or write them by yourself, below/after constructor methods.
	*/
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String nationality;


	// Here this is the default constructor (default constructor(s) is/are without parameters).
	public ParentClass() {
		super();/* Here method 'super()' is used to inherit default constructor of a parent class (which is the Object class from java in here).
		         * NOTE: To use method 'super()' it should be used the first thing before calling any attribute in the body (implementation) of 
		         * default constructor, also the same action applied to parameterized constructor.
		         */
		
		this.firstName = "";  // Here the keyword 'this' is used to call on the variable that is encapsulated in the current class 'ParentClass'
		this.lastName = "";   // Basically the keyword 'this' is used to access the variable the is encapsulated in the current class by the keyword 'private'
		this.dateOfBirth = "";// as you can see it above.
		this.nationality = "";
		
	}
	/* Here this is the parameterized constructor (parameterized constructor(s) is/are with inputs in the argument).
	 * The inputs in the argument of parameterized constructor are also called parameters and basically they are temporary attributes to be assigned 
	 * to the initially declared and initialized attributes.
	 */
	public ParentClass(String firstName, String lastName, String dateOfBirth, String nationality) {
		this.firstName = firstName;// Here the keyword 'this' is used to eliminate the confusion between class attributes and parameters with the same name.
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
	}
	/* >>> Methods Getters and Setters:
	 * As your read above in the keyword 'private' section; 
	 * Below here are Getters and Setters methods for every single attribute that is private above:
	 * Basically, the method 'get' is used to get access to the attribute that is encapsulated in the current class, it also makes the attribute public to be 
	 * accessed out side the current class. And if you want the attribute not to be accessed outside the current class, you would need to defining the get method,
	 * so that you can control the access of attribute, as well as, by not using the get method, the attribute won't be accessed.
	 */
	public String getFirstName() {
		return firstName;
	}
	// The method 'set' is used to get access and change the value of the attribute that is encapsulated.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	/* The annotation 'Override' will help with correction of method "toString", 
     * in case the method toString is not written correct, the annotation "@Override" will help in indicating the red underline toString, and 
	 * when the toString method is underline with red color, it means that the method 'toString' is not functional/working.
	 */
	@Override 
	
	/* The method 'toString' is a class which comes with java, it basically lets you format the template of your class, and you can define the format of
	 * your class/code the way you want print it.
	 */
	public String toString() {
		String title = "-->> ParentClass:\n(This is the parent class)\n";// This is to create a String variable and the assign the value (which is after the assignment operator).
	    String sep = "**********************************************************************";// Same here to create a String variable and assign the value (line).
		String formatDOB = dateOfBirth.substring(0, 2) + "/" + dateOfBirth.substring(2, 4) + "/" + dateOfBirth.substring(4, 8);// This is substring the attribute: dateOfBirth.
		return title + sep +"\nFirst Name:\t" + firstName + "\nLast Name:\t"+ lastName + "\nDate of Birth:\t" + formatDOB + "\nNationality:\t" + nationality;
	}

		
	

}
