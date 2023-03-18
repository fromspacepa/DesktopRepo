package _8__OPPsPractice_InheritanceExamples;

public class InheritableClass {
	
		private String firstName;
		private String lastName;
		private int age;
		private String address;
		private String email;
		private String phoneNo;
		
		public InheritableClass() {
			this.firstName = "";
			this.lastName = "";
			this.age = 0;
			this.address = "";
			this.email = "";
			this.phoneNo = "";
			
			}
		
		public InheritableClass(String firstName, String lastName, int age, String address, String email, String phoneNo) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.address = address;
			this.email = email;
			this.phoneNo = phoneNo;
					
		    }
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
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
