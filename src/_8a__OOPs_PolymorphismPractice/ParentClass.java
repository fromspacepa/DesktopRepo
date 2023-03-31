package _8a__OOPs_PolymorphismPractice;

import java.io.PrintStream;

public class ParentClass {
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String nationality;

	public ParentClass() {
		super();
		firstName = "";
		lastName = "";
		dateOfBirth = "";
		nationality = "";
		
	}
	public ParentClass(String firstName, String lastName, String dateOfBirth, String nationality) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
				
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	public String toString() {
		String sep = "\n***********************************";
		String title = "Parent Class:";
		String formatDOB = dateOfBirth.substring(0, 2) + "/" + dateOfBirth.substring(2, 4) + "/" + dateOfBirth.substring(4, 8);
		return title + sep + "\nFirst Name:\t" + firstName + "\nLast Name:\t"+ lastName + "\nDate of Birth:\t" + formatDOB + "\nNationality:\t" + nationality;
	}

		
	

}
