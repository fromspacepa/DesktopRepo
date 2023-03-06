package oopsPractice;

import java.util.ArrayList;

public class Session {
	
	
	ArrayList<Student> students;
	ArrayList<Instructor> instructors;
	ArrayList<MobileDevice> mobileDevice;
	String sessionName;
	
	public Session() {
		
		students = new ArrayList<Student>();
		instructors = new ArrayList<Instructor>();
		mobileDevice = new ArrayList<MobileDevice>();
		sessionName = "";
		
	}
	
	public Session(ArrayList<Student> students, ArrayList<Instructor> instructors, 
			ArrayList<MobileDevice> mobileDevice, String sessionName) {
		this.students = students;
		this.instructors = instructors;
		this.mobileDevice = mobileDevice;
		this.sessionName = sessionName;
		
	}
	
	public void printSessionInfo() {
		System.out.println("*****************************************************");
		System.out.println("Session Name:\n" + sessionName + "Students List:\n" + students +
				"Instructors List:\n" + instructors + "Device List:\n" + mobileDevice);
		System.out.println("*****************************************************");
		
	}

}
