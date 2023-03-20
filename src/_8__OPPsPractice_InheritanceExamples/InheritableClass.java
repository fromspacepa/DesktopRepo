package _8__OPPsPractice_InheritanceExamples;

/*
 * Why Encapsulation?
 * Better control of class attributes and methods
 * Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
 * Flexible: the programmer can change one part of the code without affecting other parts
 * Increased security of data
 */
public class InheritableClass {// Here this is the class named: InheritableClass
	
	    // This following is the keyword "private" it is used to encapsulate (make the variable accessible/private to the current class only) variable(s):
		private String firstName;
		private String lastName;
		private int age;
		private String address;
		private String email;
		private String phoneNo;
		
		public InheritableClass() {// Here this is the default constructor.
			// Keyword "this" refers to the current class; which means that your are referring to a variable of the current class.
			this.firstName = "";
			this.lastName = "";
			this.age = 0;
			this.address = "";
			this.email = "";
			this.phoneNo = "";
			
			}
		
		public InheritableClass(String firstName, String lastName, int age, String address, String email, String phoneNo) {// Here this is the parameterized constructor.
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.address = address;
			this.email = email;
			this.phoneNo = phoneNo;
					
		    }
		
		// >>>>> NOTE: 
		// While using keyword "private" to encapsulate the variable(s) you would need to have/write method "get" known as a "getter" and method "set" known as a "setter"
		// for each variable that is encapsulated so that the variable(s) is/are accessible from outside the current class.
		// method "get" is used to access the encapsulated attribute(s)/variable(s) from the parent/super class.
		// method "set" is used to set/update the encapsulated attribute(s)/variable(s) from the parent/super class.
		// Following here are the methods "get/getters" and "set/setters" for each variable that is encapsulated above here in this class.
		
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
		public String toString(){
			String sep = "***********************************";
			String phoneNum = "("+phoneNo.substring(0, 3)+") "+phoneNo.substring(3, 6)+"-"+phoneNo.substring(6, 10);
			return sep + "\nFirst Name:\t" + firstName + "\nLast Name:\t" + lastName + "\nAge:\t\t" + age + "\nAddress:\t" + address + "\nEmail:\t\t" + email +
					"\nPhone No:\t" + phoneNum;


		


		}    	
	

}
