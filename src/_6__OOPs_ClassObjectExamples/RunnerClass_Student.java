package _6__OOPs_ClassObjectExamples;

public class RunnerClass_Student {//This is a RunnerClass which is only going to test-out the codes of class: Student
	
	public static void main(String[] args) {
		
	
	
	//Here these following are the Objects of Class Student:
	
	Student st1 = new Student("Halim", "Khan", 23, "345-45-3321", "Java",
			"halimkhan@yahoo.com", "(267) 345-6547", "345 Khan St, Fairfax, VA 3929");//Here the Values assigned into the Object "obj1" of Class Student.
	Student st2 = new Student("Shah", "Wali", 25, "111-22-3333", "Java",
			"halimkhan@yahoo.com", "(267) 323-2423", "543 Shah Wali St, Fairfax, VA 3929");//Here the Values assigned into the Object "obj2" of Class Student.
	Student st3 = new Student("BadShah", "Khan", 30, "444-55-6666", "Java",
			"halimkhan@yahoo.com", "(267) 234-4523", "867 BadShah Khan St, Fairfax, VA 3929");//Here the Values assigned into the Object "obj3" of Class Student.

	st1.printInfo();//This is going to print-out the information of Object "st1" 
	st2.printInfo();//This is going to print-out the information of Object "st2" 
	st3.printInfo();//This is going to print-out the information of Object "st3" 
}
}
