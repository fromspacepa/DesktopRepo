package _6a__OOPsPractice_Class_Instructor;

import java.util.ArrayList;

public class RunnerClass_Instructor {//This is a RunnerClass which is only going to test-out the codes of class: Instructor

	public static void main(String[] args) {


		
		//Here these following are the Objects of Class Instructor:
		
		Instructor inst1 = new Instructor("Ahmad","Khan", 23,"9998887777","Out of No Where","Java","ahmad@khan");//Here the Values assigned into the Object "inst1" of Class Instructor.
		Instructor inst2 = new Instructor("Shah","Mohammad", 28,"5556668888","Out of No Where","Java","ahmad@khan");//Here the Values assigned into the Object "inst1" of Class Instructor.
		
		System.out.println(inst1+"\n");//Here this is going to print out the information of an Object "inst1".

		ArrayList<Instructor> inst3 = new ArrayList<Instructor>();
			inst3.add(new Instructor("Gul","Wali", 23,"8886669999","Out of No Where","Java","ahmad@khan"));//Here the Values assigned into the Object "inst1" of Class Instructor.

			for(Instructor a: inst3) {
				System.out.println(a);//Here this is going to print out the information of an Object "inst2".
				
		System.out.println(inst2 + "\n");//Here by calling the name of an object "inst2" it will printout all the information
										 //by the help of having "toString" method modified in the "RunnerClass_Instructor".

	}
	}
}
