package _7__SpecifierExamples;

public class Student {
	
	static int num = 0;
	String name;
	String phoneNo;
	String address;
 public Student() {
	 this.name = "";
	 this.phoneNo = "";
	 this.address = "";
	 num++;

 }
 public Student(String name, String phoneNo, String address) {
	 this();
	 this.name = name;
	 this.phoneNo = phoneNo;
	 this.address = address;


}

}
