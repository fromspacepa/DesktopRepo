package _2__SelectionsExamples;

public class _1_Selections_If_IfElse_IfElseifElse {

	public static void main(String[] args) {

	/**
	 * Here we will cover "Control Statements", in Control Statements we have "Selections", Iteration/Looping, and Jump Statements.
	 * 
	 * >>> CONTROL STATEMENTS:
	 * ___ 1) SELECTIONS (if, else if, else statements): 
	 * 
	 * QUESTION: What is Selection?
	 * ANSWER: Selection is basically the idea of having condition/logic; based on the condition/logic something will happen
	 *         (the code will be executed). Selection statements in Java are used to control the flow of the program.
	 *  
	 * NOTE: 
	 * We know that the flow of execution in Java is sequential (starts from top to bottom and right to left); basically, Java will start 
	 * from the top of the code and will go towards the bottom of the code; when it reaches that selection (condition/logic) 
	 * it will check the condition in the selection, if the condition is true, it will execute the true block, and 
	 * if the condition is false, it will continue to the next code statement OR to the rest of the code to reach true block; 
	 * if there's no true block it will execute the last block of else statement if available.
	 * 
	 * IMPORTANT NOTE: 
	 * In the if statements the first if condition is important/must; rest of the "if blocks/else if/else/nested if blocks" are optional, 
	 * depending on the condition. We usually avoid having "nested if blocks" because it creates confusion and it is hard to read the code. 
	 * But we use it in most cases. The more important thing in "if statements" is to understand the flow of execution of your code.
	 * 
	 * FOLLOWING ARE THE TYPES OF SELECTION IN JAVA:
	 * 
	 * 1) if statement (following is the example of "if" statement): 
	 * 
	 * if (condition) { 
	 * 
	 * System.out.println("Hello World");//this is going to be the statement block. 
	 * 
	 * }
	 *  
	 * NOTE: 
	* In the above "if" statement the minimum execution is zero and maximum one; depending on the condition we provide 
	 * (either the statement(s) block will get execute or not).
	 * 
	 * 2) if/else statement (following is the example of "if/else" statement):
	 * 
	 * if (condition) { 
	 * System.out.println("Afghanistan");//this is the "if" statement block. 
	 * } else { 
	 * System.out.println("Afghan");//this is "else" statement block. 
	 * } 
	 * 
	 * NOTE: 
	 * In the above "if/else" statement the minimum is one and same the maximum is one; depending on the condition we provide.
	 * If the "if" statement block is true, it will be executed OR if the "if" statement is false, the "else" statement block will
	 * be definitely executed, it does not matter if the "else" statement is true OR false.
	 * 
	 * 3) if/else if/ (following is the example of "if/else if" statement): 
	 *  
	 * if (condition) { 
	 * System.out.println("Afghan Watan!");//this is the "if" statement block. 
	 * } else if { 
	 * System.out.println("Afghani Rupees");//this is the "else if" statement block.
	 * } 
	 * 
	 * NOTE: 
	 * In the above "if/else if" statement the minimum execution is zero, and same the maximum execution is zero; depending on the 
	 * condition we provide; if the "if" statement block is true, it will be executed OR if the "if" statement is false, Java program 
	 * will go towards bottom and check the "else if" statement, if it is true it will be executed; And if both "if" and "else if" statement
	 * blocks are false, none of the blocks will get executed.
	 * 
	 * 
	 * MORE EXAMPLES OF "if, if/else, if/else if/else if, if/else if/else if/else, & Nested if blocks (3 if blocks in 1 if block)" STATEMENTS:
	 *
	 * ____if (condition) { ------At most one of the blocks will be executed------ 
	 * //code block.....
	 * }
	 *
	 * ____if (condition) {
	 * //code block.....
	 * } else { ------Exactly one of the blocks will be execute------ 
	 * //code block.....
	 * }
	 *
	 * ____if (condition) {
	 * //code block.....
	 * } else if (condition) {
	 * //code block.....
	 * } else if (condition) { ------At most one of the blocks will be executed------ 
	 * //code block.....
	 * }
	 *
	 * ____if (condition) {
	 * //code block.....      
	 * } else if (condition) {
	 * //code block.....
	 * } else if{
	 * //code block.....
	 * } else { ------Exactly one of the blocks will be execute------ 
	 * //code block.....
	 * }
	 *
	 * ____if (condition) {
	 * //code block.....
	 * } _______if (condition) {
	 * //code block.....
	 * } __________if (condition) {
	 * //code block.....
	 * } _____________if (condition){ ------At most 4 of the blocks will be executed and minimum '0' zero------ 
	 * //code block.....
	 * }
	 *
	 * >>> CONTROL STATEMENTS: 
	 * ___ 2) CONDITIONAL (TERNARY) OPERATOR: 
	 * The conditional (ternary) operator is the only JavaScript operator that takes three operands: 
	 * A condition followed by a question mark (?), then an expression to execute if the condition is truthy followed by a colon (:), 
	 * and finally the expression to execute if the condition is falsy. This operator is frequently used as an alternative to an if...else statement.
	 * Using Conditional (Ternary) Operator in Selection Statement is short and it's sample; it can take up to one line coding. 
	 * If you have one condition and you need to check it and you don't have too many things to execute, depending on the condition.
	 * You could use Conditional (Ternary) Operators, but if you have multiple conditions, depending on that if one of them is "true" 
	 * OR "false" you are going to execute lots of steps; So, you would go with using of "if/else if/else" statements.
	 * 
	 */

	 // Examples of Conditional (Ternary) Operator, using boolean data type:
	 int x = 20, y = 15;
	 boolean ternaryCondition = x > y ? true : false;
	 System.out.println("Outcome of Conditional \"Ternary Operator\": " + ternaryCondition);// This will print 'false' depending on the condition provided.
		
	 // Example of Condition (Ternary) Operator, using integer data type:
	 int myInt = x > y ? 20 : 15;
	 System.out.println("If true, the value of X is: " + myInt);
	 
	 // Example of Conditional (Ternary) Operator, using char data type:
	 char myChar = y > x ? 'A' : 'B';
	 System.out.println("The value of my char is: " + myChar);
	 
	 // Example of Conditional (Ternary) Operator, using String data type:
	 String result = x > y ? "X is bigger" : "It's not!";
	 System.out.println(result);
	 String value = x < y ? "Y is bigger" : "It's not!";
	 System.out.println(value);

	 /**
	  * Selections example with one "if/else" statements: 
	  * You can use the one "if" statement and one true block (else statement) when you have OR looking for one true OR false condition.
	  * 
	  * Examples of "if/else" statement with one 'true' OR 'false' condition, depending on the condition provided:
	  */
	 if (x > y) {
 	 System.out.println("'X' is bigger");
	 } else {
	 System.out.println("'Y' is bigger");
	 }

	 // Similar example of "if/else" statement as above^:
	 if (x > y) {
 	 System.out.println(true);
	 } else {
	 System.out.println(false);
	 }

	 // Example of "if" statement with only true statement:
	 int w = 130;
	 int h = 100;
	 if (w > h)// NOTE: In case, if the condition here is false, the following statement won't print: 
	 System.out.println("Habibi Haya Haya");

	 /*
	  * Example of "if, else if, else if, else if, else" statements with the condition of one 'true' block: 
	  * Scenario of the school report card scores:
	  * 90 - 100 = A (grade A)
	  * 80 - 89 = B (grade B)
	  * 70 - 79 = C (grade C)
	  * 60 - 69 = D (grade D)
	  * 59 & Below = F (grade F)
	  */

	 double grade = 20;

	 if (grade >= 100) {// This means if the grade is equal OR more than 90, print "A".
	 System.out.println("A+");
	 } else if (grade >= 90) { 
     System.out.println("A");
	 } else if (grade >= 80) {// This means if the grade is equal OR more than 80, then print "B".
	 System.out.println("B");
	 } else if (grade >= 70) {// This means if the grade is equal OR more than 70, then print "C".
	 System.out.println("C");
	 } else if (grade >= 60) {// This means if the grade is equal OR more than 60, then print "D".
	 System.out.println("D");
	 } else {// This means if the grade is less than 60, then print "F".
	 System.out.println("F");
     }
	 /**
	  * Another example of Selection with "Nested If" statements: 
	  * Scenario of the vehicle dealer-ship selling different models of cars
	  * Following are the line items that applies to each selling car, such as: 
	  * taxes, dealer ship fee, discount, interest Rate, and installments of 48, 60, and 72 months.
	  * It depend on the conditions if all blocks are true, all the blocks will get executed if not, any block that is true will get executed.
	  */
	 System.out.println("\n****** Vehicle Estimated Prices used the Nested If Blocks ******");
	 double camry = 29000;
	 double _4Runner = 43000;
	 double corola = 23000;
	 double supra = 65000;
	 double cityTax = 0;
	 double dealerFee = 0;
	 double studentDiscount = 0;
	 double armyDiscount = 0;
	 double monthlyInstallment = 0;
	 double interestRate = 0;
	 double total = 0;

	 System.out.println("\n1)___ESTIMATED PRICE OF \"Camry\":");
	 if (camry >= 25000 && camry < 30000) {
		cityTax = camry * 0.08;
		dealerFee = 450;
		studentDiscount = 500;
		total = camry + cityTax + dealerFee - studentDiscount;
		monthlyInstallment = total / 48;
	System.out.println("Camry Price:\t\t\t\t$" + camry);
	System.out.println("City Tax:\t\t\t\t$" + cityTax);
	System.out.println("Dealer Fee:\t\t\t\t$" + dealerFee);
	System.out.println("Student Discount:\t\t\t$" + studentDiscount);
	System.out.println("Total Payment:\t\t\t\t$" + total);
	System.out.println("48 Months Installment, Per month:\t$" + monthlyInstallment);
		
		System.out.println("\n2)___ESTIMATED PRICE OF \"4Runner\":");
	 		if (_4Runner >= 43000 && _4Runner < 55000.0) 
	 			cityTax = _4Runner * 0.08;
	 			dealerFee = 450;
	 			armyDiscount = 1000;
	 			total = _4Runner + cityTax + dealerFee - armyDiscount;
	 			monthlyInstallment = total / 60;
		System.out.println("4Runner Price:\t\t\t\t$" + _4Runner);
		System.out.println("City Tax:\t\t\t\t$" + cityTax);
		System.out.println("Dealer Fee:\t\t\t\t$" + dealerFee);
		System.out.println("Army Discount:\t\t\t\t$" + armyDiscount);
		System.out.println("Total Payment:\t\t\t\t$" + total);
		System.out.println("60 Months Installment, Per month:\t$" + monthlyInstallment);
		
			System.out.println("\n3)___ESTIMATED PRICE OF \"Corola\":");
				if (corola >= 21000 && corola < 30000) 
					cityTax = corola * 0.08;
					dealerFee = 450;
					armyDiscount = 0;
					total = corola + cityTax + dealerFee;
					monthlyInstallment = total / 60;
			System.out.println("Corola Price:\t\t\t\t$" + corola);
		    System.out.println("City Tax:\t\t\t\t$" + cityTax);
		    System.out.println("Dealer Fee:\t\t\t\t$" + dealerFee);
		    System.out.println("Student Discount:\t\t\t$" + armyDiscount);
		    System.out.println("Total Payment:\t\t\t\t$" + total);
		    System.out.println("60 Months Installment, Per month:\t$" + monthlyInstallment);

		    	System.out.println("\n4)___ESTIMATED PRICE OF \"Supra\":");
		    		if (supra >= 50000 && supra < 70000) 
		    			cityTax = supra * 0.08;
		    			dealerFee = 450;
		    			studentDiscount = 1000;
		    			interestRate = supra * 0.04;
		    			total = supra + cityTax + dealerFee + interestRate - studentDiscount;
		    			monthlyInstallment = total / 60;
		    	System.out.println("Toyot Supra Price:\t\t\t$" + supra);
		    	System.out.println("City Tax:\t\t\t\t$" + cityTax);
		    	System.out.println("Interest Rate:\t\t\t\t$" + interestRate);
		    	System.out.println("Dealer Fee:\t\t\t\t$" + dealerFee);
		    	System.out.println("Army Discount:\t\t\t\t$" + studentDiscount);
		    	System.out.println("Total Payment:\t\t\t\t$" + total);
		    	System.out.println("60 Months Installment, Per month:\t$" + monthlyInstallment);
	}

	/**
	 * EXAMPLE OF NESTED IF BLOCKS: 
	 * Here in the "nested if" blocks, the minimum execution of blocks will be zero and maximum of three; 
	 * depending on the conditions we provide in the blocks.
	 */
	int num1 = 5;
	if (num1 < 3) {
		System.out.println("\n\nYour first 'if statement' might be true block");
	}
	if (num1 > 10) {
		System.out.println("read your code again!");
	}
	if (num1 > 50) {
		System.out.println("'num1' must be between 10 - 50");
	{
	}

	}
	}

}
