package _6d__OOPsPractice_Class_MobileDevice;

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
		//NOTE: The job of any constructor is to initialize all of the variables of a class and help us to create object(s) of the class. 
		//FYI: Here we learn how to create a constructor, but in the real job world you don't need to create any of these constructor,
		//Java will help you generate any of these constructor, you will save a lot of times.
		owner = "";
		make = "";
		model = "";
		yearBuilt = 0;
		condition = "";
		listOfApps = new ArrayList<String>();
		
	}
	// Here following is the Parameterized Constructor, all the variables you see in the argument are called temporary variables. 
	// NOTE: All the original variables are declared in the class and initialized in the default constructor above.
	// and while use keyword "this" you will be to use similar variables names in the argument of your Parameterized Constructor. such as owner as owner;
	// in case of not using keyword "this" then you won't be able to use similar names, you will then need to use different names, such as newOwner to make a difference with the
	// initially declared and initialized variable name: owner.
	// But, using keyword "this" is always recommended in order to demonstrate your code more formal and professional.
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
								   //NOTE: That this method is for the beginners; instead it will be great and professional to use the method: toString(){   }.
		System.out.println("\n********************************************************************\n");
		System.out.println("MOBILE DEVICE INFORMATION:\n\nOwner Name:\t" + owner + "\nMake:\t\t" + make + "\nModel:\t\t" + model +
				"\nYear Built:\t" + yearBuilt + "\nCondition:\t" + condition + "\n\nList of Applications:");
		for(String i: listOfApps) {
			System.out.println(i);
			
		}

	}
	
	
	
	
	
	
	
	

}
