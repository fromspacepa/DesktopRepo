package oopsPractice;

import java.util.ArrayList;

public class RunnerClass {

	public static void main(String[]args) { 
		
	//Here these following are the Objects of Class Student:
		
	Student st1 = new Student("Halim", "Khan", 23, "345-45-3321", "Java",
			"halimkhan@yahoo.com", "(267) 345-6547", "345 Khan St, Fairfax, VA 3929");//Here the Values assigned into the Object "obj1" of Class Student.
	Student st2 = new Student("Shah", "Wali", 25, "111-22-3333", "Java",
			"halimkhan@yahoo.com", "(267) 323-2423", "543 Shah Wali St, Fairfax, VA 3929");//Here the Values assigned into the Object "obj2" of Class Student.
	Student st3 = new Student("BadShah", "Khan", 30, "444-55-6666", "Java",
			"halimkhan@yahoo.com", "(267) 234-4523", "867 BadShah Khan St, Fairfax, VA 3929");//Here the Values assigned into the Object "obj3" of Class Student.

	st1.printInfo();//This is going to print-out the information of Object "st1" 
	st2.printInfo();//This is going to print-out the information of Object "st2" 
	st3.printInfo();//This is going to print-out the information of Object "st3" 
	
	//**************************************************************************************************************************************************
	
	//Here these following are the Objects of Class Instructor:
	
	Instructor inst1 = new Instructor("Ahmad","Khan", 23,"9998887777","Out of No Where","Java","ahmad@khan");//Here the Values assigned into the Object "inst1" of Class Instructor.
	Instructor inst2 = new Instructor("Ahmad","Khan", 23,"9998887777","Out of No Where","Java","ahmad@khan");//Here the Values assigned into the Object "inst1" of Class Instructor.
	
	System.out.println(inst1+"\n");//Here this is going to print out the information of an Object "inst1".

	ArrayList<Instructor> inst3 = new ArrayList<Instructor>();
		inst3.add(new Instructor("Gul","Wali", 23,"8886669999","Out of No Where","Java","ahmad@khan"));//Here the Values assigned into the Object "inst1" of Class Instructor.

		for(Instructor a: inst3) {
			System.out.println(a);//Here this is going to print out the information of an Object "inst2".
			
	//**************************************************************************************************************************************************		
			
	//Here these following are the Objects of Class MobileDevice:
			
	ArrayList<String> apps = new ArrayList<String>();//This ArrayList is created here to add the list of applications and later on use it in any objects. 
	apps.add("Google");
	apps.add("Yahoo");
	apps.add("FaceBook");
	apps.add("BankOfAmerica");
			
	MobileDevice device1 = new MobileDevice("Jack", "Apple", "iPhone14", 2022, "New", new ArrayList<String>());//Here creating the 1st object of a class "MobileDevice"
	device1.listOfApps.add("FaceBook");//and adding these applications to it's ArrayList.
	device1.listOfApps.add("Messenger");
	device1.listOfApps.add("YouTube");
	MobileDevice device2 = new MobileDevice("Jhon", "Samsung", "GalaxyNote1", 2023, "New in Box", apps);//Here creating the 2nd object of a MobileDevice class.
	                                                                                                    //In the Arguments you see "apps" in yellow that is the
	                                                                                                    //the variable of ArrayList created in above.
	MobileDevice device3 = new MobileDevice("William", "Apple", "iPhone14", 2022, "New", new ArrayList<String>());//Same here creating the 3rd object of a class "MobileDevice".
	device3.listOfApps.add("FaceBook");
	device3.listOfApps.add("Messenger");
	device3.listOfApps.add("YouTube");
	MobileDevice device4 = new MobileDevice("Jackson", "Samsung", "GalaxyNote1", 2023, "New in Box", apps);//Same here creating the 4th object of a class "MobileDevice".
	
	device1.printDeviceInfo();//Here this will print out the information of an object 1 (named as device1) information in the format of format 
	                          //that is provided in the MobileDevice class.
	device2.printDeviceInfo();//Same thing here, this print out the information of an object 2 (named as device2).
	device3.printDeviceInfo();//Same thing here, this print out the information of an object 3 (named as device3).
	device4.printDeviceInfo();//Same thing here, this print out the information of an object 4 (named as device4).
			
	//**************************************************************************************************************************************************		
	
	//Here these following are the Objects of Class Session:

	

			
		}

		
		

}}
