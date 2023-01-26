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
		
		DecimalFormat numberFormat = new DecimalFormat ("#0.00");//Applying the Variable "numberFormat" to any number it will print out the last two decimal numbers.
		
		//In the example of this program coded for Vending Machine is coded with several samples of coding, you'll see everything in detail if you go through it:
		
		String selectItem = "Coffee DeCafe";
		int quantity = 5;

		switch (selectItem) {
		case "Coke":
			taxRate = cokePrice * quantity * taxRate;
			System.out.println("Coke:\t\t$" + cokePrice + "\nQuantity:\t" + quantity + "-Pcs" + "\nTax:\t\t$" + 
		    numberFormat.format(taxRate)  + "\nTotal:\t\t$" + (taxRate + cokePrice * quantity));
			break;
		case "Diet Coke":
			taxRate = dietCokePrice * quantity * taxRate;
			total = taxRate + dietCokePrice * quantity;
			System.out.println("Diet Coke:\t$" + dietCokePrice + "\nQuantity:\t" + quantity + "-Pcs" + 
			"\nTax:\t\t$" + numberFormat.format(taxRate) + "\nTotal:\t\t$" + numberFormat.format(total));
			break;
		case "RedBull Regular":
			taxRate = redBullRegularPrice * quantity * taxRate;
			total = taxRate + redBullRegularPrice * quantity;
			System.out.println("RedBull Regular:\t$" + redBullRegularPrice + "\nQuantity:\t\t" + quantity + "-Pcs" +
			"\nTax:\t\t\t$" + numberFormat.format(taxRate) + "\nTotal:\t\t\t$" + numberFormat.format(total));
			break;
		case "RedBull SugarFree":
			taxRate = redBullSugFreePrice * quantity * taxRate;
			total = taxRate + redBullSugFreePrice * quantity;
			System.out.println("RedBull SugarFree:\t$" + redBullSugFreePrice + "\nQuantity:\t\t" + quantity + "-Pcs" +
			"\nTax:\t\t\t$" + numberFormat.format(taxRate) + "\nTotal:\t\t\t$" + numberFormat.format(total));
			break;
		case "Coffee Regular":
			System.out.println("Coffee Regular:\t$" + numberFormat.format(coffeeRPrice));
			System.out.println("Quantity:\t" + quantity + "-Pcs");
			taxRate = coffeeRPrice * quantity * taxRate;
			System.out.println("Tax:\t\t$" + numberFormat.format(taxRate));
			total = taxRate + coffeeRPrice * quantity;
			System.out.println("Total\t\t$" + numberFormat.format(total));
			break;
		case "Coffee DeCafe":
			System.out.println("Coffee DeCafe:\t$" + numberFormat.format(coffeeDPrice));
			System.out.println("Quantity:\t" + quantity + "-Pcs");
			taxRate = coffeeDPrice * quantity * taxRate;
			System.out.println("Tax Rate:\t$" + numberFormat.format(taxRate));//With this it will printout the decimal numbers.
			total = taxRate + coffeeDPrice * quantity;
			System.out.println("Total:\t\t$" + numberFormat.format(total));
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
