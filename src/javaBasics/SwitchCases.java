package javaBasics;

public class SwitchCases {

	public static void main(String[] args) {

		/*
		 * >>>>> SWITCH CASE (Alternative Form of Selection Statements<<<<< Switch case
		 * is another example of "If Statement" Below here is the the example
		 * "Switch Case" which is giving you exactly the same idea of "If Statement"
		 * 
		 * NOTE: __Generally the idea of Selection in Java is that you define a
		 * condition, based on that condition you will ask the computer to do something.
		 * __In reality all of the Selection statements are based on one operator that
		 * is called Condition (Ternary) Operator, which is also known as a short-hand
		 * if statement, then "If statements" and "switch cases" are the alternative
		 * selection forms. __Technically "If statements" and "switch cases" have the
		 * same idea of "Conditional (Ternary) Operator", but it is "If statements" and
		 * "switch cases" has different Syntaxes, kind of sugar coded Syntax, you will
		 * use "If statements" and " switch cases" in different cases.
		 * 
		 * >>> THIS IS HOW THE SWITCH CASES WORKS: __The "switch (keyword)" is evaluated
		 * once. __The Value of the (expression/condition) is compared with the Values
		 * of each case. __If there is a match, the associated block of code is
		 * executed. __The "break" and "default" keywords are optional.
		 * 
		 * >>> THE BREAK KEYWORD: __When Java reaches a "break" keyword, it breaks out
		 * the switch block. The block will stop the execution/testing of more code
		 * inside the block. When a match is found, and the job is done, it is time for
		 * a break. There is no need for more testing. A "break" keyword can save a lot
		 * of execution time because it ignores the execution of all the rest of the
		 * code in the switch block.
		 * 
		 * >>> THE DEFAULT KEYWORD: __The "default" Keyword specifies some code to run
		 * if there is no case matched.
		 * 
		 * EXAMPLE OF SWITCH CASE:
		 */

		/*
		 * >>>>> SCENARION ONE: We have 3-Types of accounts: Checking , Saving , and
		 * Credit. If Checking and amount is not more than 500, print
		 * "Transaction Okay". If Saving with any amount, print
		 * "You can not directly withdraw from Saving". If Credit and amount is less
		 * than 1000, print "Transaction Okay". Also, If amount is grater than 500,
		 * print "Confirmation message sent!".
		 * 
		 * NOTE: Below in the code you will see some modification, which is done by me
		 * after the above scenario was written.
		 */

		String type = "Yo Yo";
		double amount = 501;

		switch (type) {
		case "Checking":
			System.out.println(
					amount < 500 && amount >= 0 ? "Transaction Okay" : "Transaction more then 500 not allowed");
			break;
		case "Saving":
			System.out.println("You can not directly withdraw from Saving");
			break;
		case "Credit":
			default:
			System.out.println("Habibi Haya Haya");
			
			//Example of "Fall Through"
			//Fall Through is when there is no "break" key word in the switch statements and all the cases get executed:
		String greatings = "Hello";
		switch (greatings){
		case "Hello":
			System.out.println("good morning");
		case "John":
			System.out.println("John is here");
		case "Mike":
			System.out.println("Mike is also here");
			
		}
			// System.out.println(amount < 1000 || amount > 500 ? "Transaction Okay on
			// Credit" : "Confirmation message sent!");
			// System.out.println(amount < 1000 && amount > 500 ? "Transaction Okay on
			// Credit" : "Confirmation message sent!");
			// System.out.println(amount < 1000 ^ amount > 500 ? "Transaction Okay on
			// Credit" : "Confirmation message sent!");

			if (amount < 1000) {
				System.out.println("Transaction Okay on Credit!");
			}
			if (amount > 500) {

				System.out.println("Confirmation message sent!");
			}

			break;
		}
		//Example of School Test Status:
		
		System.out.println("\n--- Printing School Test Status ---\n");
		
		String status = "NotRecognize";
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

		
	}

}
