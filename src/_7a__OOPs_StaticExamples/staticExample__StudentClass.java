package _7a__OOPs_StaticExamples;


	/* >>>>> STATIC (KeyWord/Non-Access Modifier/Specifier):
	 * 
	 * 
	 */

public class staticExample__StudentClass {
	
	private String name;
	private String phoneNo;
	private String address;
	private static int classNum;//<<< This is static attribute/variable, only declared here and then initialized in the default constructor.
	//private static int classNum = 283;//<<< This is static attribute/variable declared and initialized here.
	private static String schoolName;//<<< This is static attribute/variable, only declared here and then initialized in the default constructor.
	//private static String schoolName = "Northeast High";//<<< This is static attribute/variable declared and initialized here.
	
 public staticExample__StudentClass() {
	 super();//<<< This is to inherit the default constructor from class Object from java.
	
	 this.name = "";
	 this.phoneNo = "";
	 this.address = "";
	 staticExample__StudentClass.classNum = 283;//<<< This is to initialize the above declared static variable.
	 staticExample__StudentClass.schoolName = "Northeast High";//<<< This is to initialize the above declared static variable.

 }
 public staticExample__StudentClass(String name, String phoneNo, String address) {
	 this();//<<< This is to inherit the default constructor of this class.
	 this.name = name;
	 this.phoneNo = phoneNo;
	 this.address = address;

}
 public String getName() {
	 return name;
}
 public void setName(String name) {
	 this.name = name;
}
 public String getPhoneNo() {
	 return phoneNo;
}
 public void setPhoneNo(String phoneNo) {
	 this.phoneNo = phoneNo; 
}
 public String getAddress() {
	 return address;
 }
 public void setAddress(String address) {
	 this.address = address;
 }
 public int getClassNum() {// This is the getter method for a static variable named: classNum
	 return classNum;
 }
 public void setClassNum(int classNum) {// This is the setter method for a static variable named: classNum
	 staticExample__StudentClass.classNum = classNum;
 }
 public static String getSchoolName() {// This is the getter method for a static variable named: schoolName
	return schoolName;
 }
 public static void setSchoolName(String schoolName) {// This is the setter method for a static variable named: schoolName.
	staticExample__StudentClass.schoolName = schoolName;	
}

 
// Following here is the toString method:
@Override 
 public String toString() {
	 return "\nObject of class Student:____\nName:\t\t\t" + name + "\nPhone Number:\t\t" + phoneNo + "\nAddress:\t\t" + address + 
			 "\nClass Number:\t\t" + classNum + "\nSchool:\t\t\t" + schoolName;
 }




}
