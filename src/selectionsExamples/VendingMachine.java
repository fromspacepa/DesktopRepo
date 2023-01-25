package selectionsExamples;

public class VendingMachine {

	public static void main(String[] args) {
		
		/* This is an example of Vending Machine using the selection "if statements":
		 * The scenario is that we have the following items in the vending machince
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
		 *
		 * Tax Rate for any item is   %0.08 
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
		
		String selectItem = "Coke";
		
		switch (selectItem) {
		case "Coke":
			strCoke + cokePrice;
			
		}
		

	}

}
