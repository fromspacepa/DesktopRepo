package selectionsExamples;

import java.text.DecimalFormat;

public class VendingMachine {

	public static void main(String[] args) {
		
		/* This is an example of Vending Machine using the selection "if statements":
		 * The scenario is that we have the following items in the vending machine
		 * with different prices and the taxes also applied to each item.
		 * So, the list of items follows as:
		 * 
		 * Coke              Price is $2
		 * Diet Coke         Price is $2
		 * RedBull Regular   Price is $3 
		 * RedBull SugarFree Price is $3
		 * Coffee Regular    Price is $2.50
		 * Coffee DeCafe     Price is $2.50
		 * Water             Price is $1
		 * Tax Rate for any item is   %0.08 
		 * 
		 * And whatever the number of quantity is selected, all the prices would show up in the console
		 * such as: item price, quantity, tax, and the total amount.
		 */
		
		String strCoke = "Coke";
		double cokePrice = 2;
		String strDietCoke = "Diet Coke";
		double dietCokePrice = 2;
		String strRedBullRegular = "RedBull Regular";
		double redBullRegularPrice = 3;
		String strRedBullSugFree = "RedBull SugarFree";
		double redBullSugFreePrice = 3;
		String strCoffeeR = "Coffee Regular";
		double coffeeRPrice = 2.50;
		String strCoffeeD = "Coffee DeCafe";
		double coffeeDPrice = 2.50;
		String strWater = "Water";
		double waterPrice = 1;
		double taxRate = 0.08;
		double total = 0;
		
		String selectItem = "Coke";
		int quantity = 5;

		switch (selectItem) {
		case "Coke":
			System.out.println("Coke Price:\t$" + cokePrice + "\nQuantity:\t" + quantity + "-Pcs" + "\nTax:\t\t$" + 
		    cokePrice * quantity * taxRate  + "\nTotal:\t\t$" + (taxRate + cokePrice * quantity));
			break;
		case "Diet Coke":
			System.out.println("Diet Coke:\t$" + dietCokePrice);
			System.out.println("Quantity:\t" + quantity + "-Pcs");
			taxRate = dietCokePrice * quantity * taxRate;
			System.out.println("Tax:\t\t$" + taxRate);
			System.out.println("Total:\t\t$" + (taxRate + dietCokePrice * quantity));
			break;
		case "RedBull Regular":
			System.out.println("RedBull Regular:\t$" + redBullRegularPrice);
			System.out.println("Quantity:\t\t" + quantity + "-Pcs");
			taxRate = redBullRegularPrice * quantity * taxRate;
			System.out.println("Tax:\t\t\t$" + taxRate);
			System.out.println("Total:\t\t\t$" + (taxRate + redBullRegularPrice * quantity));
			break;
		case "RedBull SugarFree":
			System.out.println("RedBull SugarFree:\t$" + redBullSugFreePrice);
			System.out.println("Quantity:\t\t" + quantity + "-Pcs");
			taxRate = redBullSugFreePrice * quantity * taxRate;
			System.out.println("Tax:\t\t\t$" + taxRate);
			System.out.println("Total:\t\t\t$" + (taxRate + redBullSugFreePrice * quantity));
			break;
		case "Coffee Regular":
			System.out.println("Coffee Regular:\t$" + coffeeRPrice);
			System.out.println("Quantity:\t" + quantity + "-Pcs");
			taxRate = coffeeRPrice * quantity * taxRate;
			System.out.println("Tax:\t\t$" + taxRate);
			System.out.println("Total\t\t$" + (taxRate + coffeeRPrice * quantity));
			break;
		case "Coffee DeCafe":
			System.out.println("Coffee DeCafe:\t$" + coffeeDPrice);
			System.out.println("Quantity:\t" + quantity + "-Pcs");
			taxRate = coffeeDPrice * quantity * taxRate;
			System.out.println("Tax Rate:\t$" + taxRate);
			System.out.println("Total:\t\t$" + (taxRate + coffeeDPrice * quantity));
			break;
		case "Water":
			System.out.println("Water:\t\t$" + waterPrice);
			System.out.println("Quantity:\t" + quantity + "-Pcs");
			taxRate = waterPrice * quantity * taxRate;
			System.out.println("Tax:\t\t$" + taxRate);
			System.out.println("Total:\t\t$" + (taxRate + waterPrice * quantity));
			break;
			default:
				System.out.println("Please try again! You either insert wrong code or not select any item.");
		
			
		}
		

	}

}
