package oopsPractice;

import java.util.ArrayList;

public class MobileDevice {
	
	String owner;
	String make;
	String model;
	int yearBuilt;
	String condition;
	ArrayList<String> listOfApps;
	
	public MobileDevice() {
		owner = "";
		make = "";
		model = "";
		yearBuilt = 0;
		condition = "";
		listOfApps = new ArrayList<String>();
		
	}
	
	public MobileDevice(String owner, String make, String model, int yearBuilt, String condition, ArrayList<String> listOfApps) {
		this.owner = owner;
		this.make = make;
		this.model = model;
		this.yearBuilt =yearBuilt;
		this.condition = condition;
		this.listOfApps = listOfApps;
	
	}
	
	public void printDeviceInfo() {
		System.out.println("\n********************************************************************\n");
		System.out.println("MOBILE DEVICE INFORMATION:\n\nOwner Name:\t" + owner + "\nMake:\t\t" + make + "\nModel:\t\t" + model +
				"\nYear Built:\t" + yearBuilt + "\nCondition:\t" + condition + "\n\nList of Applications:");
		for(String i: listOfApps) {
			System.out.println(i);
			
		}

	}
	
	
	
	
	
	
	
	

}
