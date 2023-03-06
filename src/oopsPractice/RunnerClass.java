package oopsPractice;

import java.util.ArrayList;

public class RunnerClass {

	public static void main(String[]args) { 
		
	Student st1 = new Student("Halim", "Khan", 23, "345-45-3321", "Java",
			"halimkhan@yahoo.com", "(267) 345-6547", "345 Khan St, Fairfax, VA 3929");
	Student st2 = new Student("Shah", "Wali", 25, "111-22-3333", "Java",
			"halimkhan@yahoo.com", "(267) 323-2423", "543 Shah Wali St, Fairfax, VA 3929");
	Student st3 = new Student("BadShah", "Khan", 30, "444-55-6666", "Java",
			"halimkhan@yahoo.com", "(267) 234-4523", "867 BadShah Khan St, Fairfax, VA 3929");

	st1.printInfo();
	st2.printInfo();
	st3.printInfo();
	
	
	System.out.println("Objects of Class Instructor:\n-------------------------------------------");
	
	Instructor inst1 = new Instructor("Ahmad","Khan", 23,"9998887777","Out of No Where","Java","ahmad@khan");
	
	System.out.println(inst1+"\n");

	ArrayList<Instructor> inst2 = new ArrayList<Instructor>();
		inst2.add(new Instructor("Gul","Wali", 23,"8886669999","Out of No Where","Java","ahmad@khan"));

		for(Instructor a: inst2) {
			System.out.println(a);
			
			
	Session objectSession = new Session("Java Script", st1, st2, st3, );
		}

		
		

}}
