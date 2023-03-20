package _6d__OOPs_ClassObjectPractice;

import java.util.ArrayList;

public class RunnerClass_MobileDevice {//This is a RunnerClass which is only going to test-out the codes of class: MobileDevice

	public static void main(String[] args) {


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

	}

}
