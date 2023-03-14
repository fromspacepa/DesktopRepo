package _6c__OOPsPractice_Class_Session;

import java.util.ArrayList;

import _6a__OOPsPractice_Class_Instructor.Instructor;
import _6b__OOPsPractice_Class_Student.Student;
import _6d__OOPsPractice_Class_MobileDevice.MobileDevice;

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
