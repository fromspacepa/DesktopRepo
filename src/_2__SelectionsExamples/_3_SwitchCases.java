package _2__SelectionsExamples;

import java.text.DecimalFormat;

public class _3_SwitchCases {

	public static void main(String[] args) {

		/*
		 * >>> SWITCH CASE:
		 * Switch Case is the alternative form of Selection Statements, basically "switch case" is another example of "if" statement.
		 * Below here are the examples of "switch case" which is going to give you exactly the same idea of "if" statement.
		 * 
		 * NOTE: 
		 * Generally the idea of Selection in Java is that you define a condition, and based on that condition you will ask the computer 
		 * to do something. In reality all of the Selection statements are based on one operator that is called Condition (Ternary) Operator, 
		 * which is also known as a short-hand "if" statement, then "if" statements and "switch cases" are the alternative selection forms. 
		 * Technically "if" statements and "switch cases" have the same idea of "Conditional (Ternary) Operator", but "if" statements and
		 * "switch cases" has different Syntaxes, kind of sugar coded Syntax, you will  use "If statements" and " switch cases" in different cases.
		 * 
		 * >>> This is how the "switch case" works:
		 * The "switch" keyword is evaluated once. The Value of the (expression/condition) is compared with the values of each case.
		 * If there is a match, the associated case block of code is executed. 
		 * 
		 * NOTE: The "break" and "default" keywords are optional to use in "switch case"
		 * 
		 * >>> "break" keyword: 
		 * When Java reaches a "break" keyword, it breaks out the switch block. The break will stop the execution of more code inside the block,
		 * and when a match is found, and the job is done, it is time for a break. There is no need for more testing. A "break" keyword can save a lot
		 * of execution time because it ignores the execution of rest of the code in the switch block.
		 * 
		 * >>> "default" keyword: 
		 * The "default" Keyword specifies some code to run if there is no case matched such as "else" in the "if else" statement.
		 * 
		 * >>> Example of "switch case":
		 * 
		 * Scenario one: 
		 * We have 3-Types of accounts: Checking , Saving , and Credit: If Checking and amount is not more than 500, print "Transaction Okay". 
		 * If Saving with any amount, print "You can not directly withdraw from Saving". If Credit and amount is less than 1000, print "Transaction Okay". 
		 * Also, If amount is grater than 500, print "Confirmation message sent!".
		 * 
		 * NOTE: 
		 * Below in the code you will see some modification, which is done by me after the above scenario was written.
		 * 
		 */
		// Example of "switch case" with "break" and "default" keywords:
		System.out.println("Example of \"switch case\" with \"break\" and \"default\" keywords:");
		String accounTypes = "Saving";
		double amount = 0;

		switch (accounTypes) {
		case "Checking":
			System.out.println(amount < 500 && amount >= 150 ? "Transaction Okay" : "Transaction less then \"150\" and more then \"500\" not allowed");
			break;
		case "Saving":
			System.out.println("You can not directly withdraw from Saving");
			break;
		case "Credit":
			default:
			System.out.println("You don't have this option on \"Credit card accout\"");
			//break;
			
		}
		
		//Example of "Fall Through"
		//Fall Through is when there is no "break" keyword in the switch statements and all the cases get executed:
		System.out.println("\nExample of 'fall through' of switch case:");
		String greatings = "Hello";
		switch (greatings){
		case "Hello":
			System.out.println("good morning");
		case "John":
			System.out.println("John is here");
		case "Mike":
			System.out.println("Mike is also here");
			break;
	
		}
			//System.out.println(amount < 1000 || amount > 500 ? "Transaction Okay on Credit" : "Confirmation message sent!");
			//System.out.println(amount < 1000 && amount > 500 ? "Transaction Okay on Credit" : "Confirmation message sent!");
			//System.out.println(amount < 1000 ^ amount > 500 ? "Transaction Okay on Credit" : "Confirmation message sent!");
		    //Example of "if" statement with "break" keyword:
			//System.out.println("\nExample of 'if' statement with 'break' keyword:");
		if (amount < 1000) {
			System.out.println("Transaction Okay on Credit!");
			}
		if (amount > 500) {
			System.out.println("Confirmation message sent!");
			
			}
			
			
		//Example of School Test Status:
		
		System.out.println("\n--- Printing School Test Status ---\n");
		
		String status = "Pending";
		double grade = 0;
		
		switch (status) {
		case "Passed":
			System.out.println("You passed!");
			if (grade > 95) {
				System.out.println("You passed with good grades!");
			}
			break;
		case "Failed":
			System.out.println("You failed this time, try again");
			break;
		case "Pending":
			if (grade <= 0) {
				System.out.println("Your results are pending");
			}
			for (int test = 1;  test <= 2; test++) {
				System.out.println(status + " " + test);
			}
			break;
			default:
				System.out.println("You do not belong here!");
				
		}

		//Example of Vending Machine:
		System.out.println("\nExample of Vending Machine:");
		int price = 0;
		String drink = "PepsiCola";
		int quantity = 10;
		double taxRate = 0.08;
		double total = 0;
	
		DecimalFormat myDecimal = new DecimalFormat ("#0.00");//This is to import the decimal format and apply it to the decimal value in your code.
		switch (drink) {
		case "PepsiCola":
			price = 5;
		    taxRate = price * quantity * taxRate ;
		    total = taxRate + price * quantity;
		    System.out.println("You got PepsiCola" + "\nThe price is:\t\t$" + price
			+ "\nThe quantity is:\t" + quantity +"-pcs" + "\nThe tax is:\t\t$" + myDecimal.format(taxRate) + 
			"\nThe Total is:\t\t$" + myDecimal.format(total));
				break;
		case "Coke":
			price = 3;
	        taxRate = price * quantity * taxRate ;
	        total = taxRate + price * quantity;
			System.out.println("You got Coke" + "\nThe price is:\t\t$" + price
			+ "\nThe quantity is:\t" + quantity +"-pcs" + "\nThe tax is:\t\t$" + myDecimal.format(taxRate) + 
			"\nThe Total is:\t\t$" + myDecimal.format(total));
				break;
		case "Diet Coke":
			price = 3;
	        taxRate = price * quantity * taxRate ;
	        total = taxRate + price * quantity;
			System.out.println("You got Diet Coke" + "\nThe price is:\t\t$" + price
			+ "\nThe quantity is:\t" + quantity +"-pcs" + "\nThe tax is:\t\t$" + myDecimal.format(taxRate) + 
			"\nThe Total is:\t\t$" + myDecimal.format(total));
				break;
				default:
					System.out.println("You have not selected the item!\n Please try again!");
					
					
					
	
		
	}
	
		
		}

	}
	


