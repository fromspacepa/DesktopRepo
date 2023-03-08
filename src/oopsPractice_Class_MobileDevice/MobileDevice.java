package oopsPractice_Class_MobileDevice;

import java.util.ArrayList;

public class MobileDevice {//This is a Class and named MobileDevice.
	//Here following variables are declared:
	String owner;
	String make;
	String model;
	int yearBuilt;
	String condition;
	ArrayList<String> listOfApps;
	
	public MobileDevice() {//This is a default constructor.
		//Here following variables are initialized with default values:
		owner = "";
		make = "";
		model = "";
		yearBuilt = 0;
		condition = "";
		listOfApps = new ArrayList<String>();
		
	}
	
	public MobileDevice(String owner, String make, String model, int yearBuilt, String condition, ArrayList<String> listOfApps) {//This is a parameterized constructor.
		//Here following we are using a keyword "this":
		//A keyword "this" will refer to the variables out of the current scope or in other words, will refer to the variables in the body of the class.
		this.owner = owner;
		this.make = make;
		this.model = model;
		this.yearBuilt =yearBuilt;
		this.condition = condition;
		this.listOfApps = listOfApps;
	
	}
	
	public void printDeviceInfo() {//We create this method which will print-out the content/data of an object of the above class in the following format just by calling 
		                           //the method "printDeviceInfo();" in the object. 
		System.out.println("\n********************************************************************\n");
		System.out.println("MOBILE DEVICE INFORMATION:\n\nOwner Name:\t" + owner + "\nMake:\t\t" + make + "\nModel:\t\t" + model +
				"\nYear Built:\t" + yearBuilt + "\nCondition:\t" + condition + "\n\nList of Applications:");
		for(String i: listOfApps) {
			System.out.println(i);
			
		}

	}
	
	
	
	
	
	
	
	

}
