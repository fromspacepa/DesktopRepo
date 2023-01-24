package javaBasics;

public class SelectionStatement {

	public static void main(String[] args) {
		

	double carPrice = 35000.00;
	double fee = 0;
	double tax = 0;
	double interest = 0;
	double discount = 0;
	double shipment = 0;
	boolean expeditedShipment = false;
	double total = 0;
	double installments = 0;

	
	if (carPrice >= 42000.00 && carPrice < 50000.00) {
		fee = 450;
		tax = carPrice * 0.08;
		interest = carPrice * 0.05;
		discount = carPrice * 0.01;
		shipment = carPrice * 0.02;
		total = carPrice + tax + fee + interest - discount;
		installments = total / 60;
	} else if (carPrice >= 50000.00 && carPrice < 6000.00) {
		fee = 450;
		tax = carPrice * 0.08;
		interest = carPrice * 0.01;
		discount = carPrice * 0.02;
		shipment = carPrice * 0.01;
		total = carPrice + tax + fee + interest - discount;
		installments = total / 60;
		
	} else if (carPrice >= 60000.00 && carPrice < 75000.00) {
		fee = 450;
		tax = carPrice * 0.08;
		interest = carPrice * 0.0;
		discount = carPrice * 0.03;
		expeditedShipment = true;
		total = carPrice + tax + fee + interest;
		installments = total / 60;
	}  else  {
		fee = 450;
		tax = carPrice * 0.08;
		interest = carPrice * 0.04;
		discount = carPrice * 0.00;
		expeditedShipment = true;
		total = carPrice + tax + fee + interest;
		installments = total / 60;
		
	}
	
	System.out.println("Car price:\t\t" + carPrice);
	System.out.println("Dealership fee:\t\t" + fee);
	System.out.println("Tax: \t\t\t" + tax);
	System.out.println("Interest Rate:\t\t" + interest);
	System.out.println("Discount:\t\t" + discount);
	System.out.println("Total amount:\t\t" + total);
	System.out.println("Monthly installment:\t" + installments);
	if (expeditedShipment == true) {
	System.out.println("\nYou are eligible for Expedited Shipment!");
	} else {
		System.out.println("Normal Shipment Applied!");


}}}
