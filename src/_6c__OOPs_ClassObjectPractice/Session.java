package _6c__OOPs_ClassObjectPractice;

import java.util.ArrayList;

import _6a__OOPs_ClassObjectPractice.Instructor;
import _6b__OOPs_ClassObjectPractice.Student;
import _6d__OOPs_ClassObjectPractice.MobileDevice;

public class Session {
	String sessionName;
	ArrayList<Student> students;
	ArrayList<Instructor> instructors;
	ArrayList<MobileDevice> devices;

	
	public Session() {
		//NOTE: The job of any constructor is to initialize all of the variables of a class and help us to create object(s) of the class.
		sessionName = "";
		students = new ArrayList<Student>();
		instructors = new ArrayList<Instructor>();
		devices = new ArrayList<MobileDevice>();

	}
	
	public Session(String sessionName, ArrayList<Student> students, ArrayList<Instructor> instructors, ArrayList<MobileDevice> devices) {
		this.sessionName = sessionName;
		this.students = students;
		this.instructors = instructors;
		this.devices = devices;

	}
	public void printSessionInfo() {
		System.out.println("\n********************************************************************\n");
		System.out.println("SESSION INFORMATION:\n\nSession Name:\t" + sessionName + "\nList of Students:\t\t" + students + 
            			   "\nList of Instructors:\t" + instructors + "\nList of Devices:\t" + devices);

				
			
		
		
	}

}
