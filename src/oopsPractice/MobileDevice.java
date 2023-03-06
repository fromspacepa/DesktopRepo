package oopsPractice;

import java.util.ArrayList;

public class MobileDevice {
	
	String ownerName;
	int yearBuilt;
	String condition;
	String model;
	ArrayList<String> listOfApps;
	
	public MobileDevice() {
		
		ownerName = "";
		yearBuilt = 0;
		condition = "";
		model = "";
		listOfApps = new ArrayList<String>();
		
	}
	
	public MobileDevice(String ownerName, int yearBuilt, String condition, String model, ArrayList<String> listOfApps) {
		this.ownerName = ownerName;
		this.yearBuilt =yearBuilt;
		this.condition = condition;
		this.model = model;
		this.listOfApps = listOfApps;
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
