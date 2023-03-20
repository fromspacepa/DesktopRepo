package _7__OOPsPractice_BeanClassStructur_EncapsulatedClass;

import java.util.ArrayList;

public class MobileDevice {
	
	/*
	 * Bean Class Structure:
	 * We usually create a "Bean Class Structure" when we are working with data sets and when working with Object Oriented Programming fashion in Java
	 * OR let's say when we are encapsulating a class that is called the Bean Class Structure.
	 * ___ Step by Step Instruction:
	 * --> Declare variables and make them private by using the access modifier "private".
	 * --> Create a default constructor.
	 * --> Initialize all the declared variables in the body of your default constructor.
	 * --> Create a parameterized constructor.
	 * --> Assign all the variables inside the body of your parameterized constructor to the initially declared and initialized variables.
	 * --> Create/have your getters method(s) and define them per the requirement or as needed.
	 * --> Create/have your setters method(s) and define them per the requirement or as needed.
	 * --> Create/have your special method(s) such as: toString, equal, and etc and define them per the requirement or as needed.
	 * 
	 * >>>>> Why Encapsulation?
	 * Better control of class attributes and methods
	 * Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
	 * Flexible: the programmer can change one part of the code without affecting other parts
	 * Increased security of data
	 */
		
	private String owner;
	private String make;
	private String model;
	private int yearBuilt;
	private String condition;
	private ArrayList<String> apps;
	
	public MobileDevice() {
		owner = "";
		make = "";
		yearBuilt = 0;
		condition = "";
		apps = new ArrayList<String>();
		
		}
	
	public MobileDevice(String owner, String make, String model, int yearBuilt, String condition, ArrayList<String> apps) {
		this.owner = owner;
		this.make = make;
		this.model = model;
		this.yearBuilt = yearBuilt;
		this.condition = condition;
		this.apps = apps;
		
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public ArrayList<String> getApps() {
		return apps;
	}
	public void setApps(ArrayList<String> apps) {
		this.apps = apps;
	}
}
