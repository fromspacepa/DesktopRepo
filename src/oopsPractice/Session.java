package oopsPractice;

import java.util.ArrayList;

public class Session {
	String sessionName;
	ArrayList<Student> students;
	ArrayList<Instructor> instructors;
	ArrayList<MobileDevice> devices;

	
	public Session() {
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
