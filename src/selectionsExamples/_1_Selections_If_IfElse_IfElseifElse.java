package selectionsExamples;

public class _1_Selections_If_IfElse_IfElseifElse {

	public static void main(String[] args) {

		/**
		 * >>>>> SELECTIONS: __Selection is basically the idea of having
		 * condition/logic; based on the condition/logic something will happen (the code
		 * will be executed). __Selection statements in Java are used to control the
		 * flow of the program.
		 * 
		 * __NOTE: We know that the flow of execution in Java is sequential (starts from
		 * top to bottom); basically, Java will start from the top of the code and will
		 * go towards the bottom of the code; when it reaches that selection
		 * (condition/logic) it will check the condition in the selection, if the
		 * condition is true, it will execute the true block, and if the condition is
		 * false, it will continue to the next code statement OR to the rest of the code
		 * to reach true block; if there's no true block it will execute the last block
		 * of else statement if available.
		 * 
		 * __IMPORTANT NOTE: In the if statements the first if condition is
		 * important/must; rest of the "if blocks/else if/else/nested if blocks" are
		 * optional, depending on the condition. __We usually avoid having "nested if
		 * blocks" because it creates confusion and it is hard to read the code. But we
		 * use it in most cases. The more important thing in "if statements" is to
		 * understand the flow of execution of your code.
		 * 
		 * __FOLLOWING ARE THE TYPES OF SELECTION IN JAVA:
		 * 
		 * >>> 1) if statement: __Following is the example of "if" statement: if
		 * (condition){ System.out.println("Hello World");//this is going to be the
		 * statement block. } __NOTE: In the above "if" statement the minimum execution
		 * is "0" zero and maximum "1" one; Depending on the condition we provide
		 * (either the block of statement(s) will execute or not).
		 * 
		 * >>> 2) if/else statement: __Following is the example of "if/else" statement:
		 * if (condition){ System.out.println("Afghanistan");//this is going to be the
		 * "if" statement block. }else{ System.out.println("Afghan");//this is going to
		 * be the "else" statement block. } __NOTE: In the above "if/else" statement the
		 * minimum execution is "1" one and same the maximum is "1" one. Depending on
		 * the condition we provide; if the "if" statement block is true, it will be
		 * executed OR if the "if" statement is false, the "else" statement block will
		 * be definitely executed, it does not matter if the "else" statement is true OR
		 * false.
		 * 
		 * >>> 3) if/else if/: __Following is the example of "if/else if" statement: if
		 * (condition){ System.out.println("Afghan Watan!");//this is going to be the
		 * "else" statement block. }else if{ System.out.println("Afghani Rupees");//this
		 * is going to be the "else if" statement block. } __NOTE: In the above "if/else
		 * if" statement the minimum execution is "0" zero, and same the maximum
		 * execution is "0" zero. Depending on the condition we provide; if the "if"
		 * statement block is true, it will be executed OR if the "if" statement is
		 * false, Java program will go towards bottom and check the "else if" statement,
		 * if it is true it will be executed; And if both "if" and "else if" statement
		 * blocks are false, none of the blocks will get executed.
		 * 
		 * 
		 * >>>> MORE DETAILS ABOUT "if/if, else/if, else if, else/ & Nested if blocks"
		 * STATEMENTS:
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
		 *
		 * >>>>> SELECTION EXAMPLES WITH TERNARY OR CONDITIONAL OPERATORS: Using Unary OR
		 * Conditional Operator in Selection Statement is short and it's sample; it can
		 * take up to one line coding. If you have one condition and you need to check
		 * it and you don't have too many things to execute, depending on the condition.
		 * You could use Unary OR Conditional Operators. But if you have multiple
		 * conditions, depending on that if one of them is "true" OR "false" you are
		 * going to execute lots of steps; So, you would go with using of "if/else
		 * if/else" statements.
		 * 
		 */

		/**
		 * Example of Selection with Unary Operator using 'boolean' the primitive data
		 * type:
		 */
		int x = 10;// Here the Variable 'x' is declared & initialized with the Initialization
					// Process of Assigning value of '10' to 'x'.
		int y = 15;// Here the Variable 'y' is declared & initialized with the Initialization
					// Process of Assigning value of '15' to 'y'.
		boolean z = x > y ? true : false;//Example of Ternary Operator using boolean.
		// Here the boolean will execute true OR false depending  on the condition provided.
		System.out.println(z);// This will print 'false' depending on the condition provided above^.

		// Example of Selection with Unary Operator using 'String' the Non-primitive
		// data type:
		int nums = x > y ? 10 : 15;//Example of Ternary Operator using integer.
		System.out.println("If true, the value of X is: " + nums);
		char myChar = y > x ? 'A' : 'B';//Example of Ternary Operator using char.
		System.out.println("The value of my char is: " + myChar);
		String result = x > y ? "X is bigger" : "It's not!";// Here the String will execute "X is bigger" OR "It's not!"
															// depending on the condition provided.
		String value = x < y ? "Y is bigger" : "It's not!";//Example of Ternary Operator using String.
		System.out.println(result);// This will print "It's not!" depending on the condition provided above^.
		System.out.println(value);

		/*
		 * Selections example with one "if/else": You can use the one "if" statement and
		 * one true block (else statement) when you have OR looking for one true OR
		 * false condition. Syntax of one if statement with one 'true' OR 'false' block
		 * (else block): if (conditions){ "true block" }
		 */

		// Examples of "if/else" statement with one 'true' OR 'false' condition,
		// depending on the condition provided:
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
		if (w > h)
			System.out.println("Habibi Haya Haya");

		/*
		 * Example of "if/else if/else if/else if/else" statements with the condition of
		 * one 'true' block: Scenario of the school report card scores: 90 - 100 = A 80
		 * - 89 = B 70 - 79 = C 60 - 69 = D 59 & Below = F
		 */

		double grade = 90;// This Variable "grade" is equal to any value provided from the list below.

		if (grade >= 90) {// This means if the grade is equal OR more than 90, print "A".
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
		 * Another Example of Selection with "if/else if/ else" statements: Scenario of
		 * the vehicle dealer ship selling different models, applying on following items
		 * on each selling car: taxes, dealer ship fee, discount, interest Rate, and
		 * installments of 48, 60, and 72 months.
		 */
		System.out.println("\n>>>>>>>>>>Car Dealer Ship Receipt<<<<<<<<<<<<<\n");
		double camry = 0;
		double _4Runner = 0;
		double corola = 0;
		double toyotaSupra = 56000;
		double cityTax = 0;
		double dealerFee = 0;
		double studentDiscount = 0;
		double armyDiscount = 0;
		double monthlyInstallment = 0;
		double interestRate = 0;
		double total = 0;

		if (camry >= 25000 && camry < 30000) {
			cityTax = camry * 0.08;
			dealerFee = 450;
			studentDiscount = 500;
			total = camry + cityTax + dealerFee - studentDiscount;
			monthlyInstallment = total / 48;
			System.out.println("Camry Price:\t\t\t\t" + camry);
			System.out.println("City Tax:\t\t\t\t" + cityTax);
			System.out.println("Dealer Fee:\t\t\t\t" + dealerFee);
			System.out.println("Student Discount:\t\t\t" + studentDiscount);
			System.out.println("Total Payment:\t\t\t\t" + total);
			System.out.println("48 Months Installment, Per month:\t" + monthlyInstallment);

		} else if (_4Runner >= 45000 && _4Runner < 55000.0) {
			cityTax = _4Runner * 0.08;
			dealerFee = 450;
			armyDiscount = 1000;
			total = _4Runner + cityTax + dealerFee - armyDiscount;
			monthlyInstallment = total / 60;
			System.out.println("4Runner Price:\t\t\t\t" + _4Runner);
			System.out.println("City Tax:\t\t\t\t" + cityTax);
			System.out.println("Dealer Fee:\t\t\t\t" + dealerFee);
			System.out.println("Army Discount:\t\t\t\t" + armyDiscount);
			System.out.println("Total Payment:\t\t\t\t" + total);
			System.out.println("60 Months Installment, Per month:\t" + monthlyInstallment);
		} else if (corola >= 20000 && corola < 30000) {
			cityTax = corola * 0.08;
			dealerFee = 450;
			armyDiscount = 0;
			total = corola + cityTax + dealerFee;
			monthlyInstallment = total / 60;
			System.out.println("Corola Price:\t\t\t\t" + corola);
			System.out.println("City Tax:\t\t\t\t" + cityTax);
			System.out.println("Dealer Fee:\t\t\t\t" + dealerFee);
			System.out.println("Student Discount:\t\t\t" + armyDiscount);
			System.out.println("Total Payment:\t\t\t\t" + total);
			System.out.println("60 Months Installment, Per month:\t" + monthlyInstallment);

		} else {
			cityTax = toyotaSupra * 0.08;
			dealerFee = 450;
			studentDiscount = 1000;
			interestRate = toyotaSupra * 0.04;
			total = toyotaSupra + cityTax + dealerFee + interestRate - studentDiscount;
			monthlyInstallment = total / 60;
			System.out.println("Toyot Supra Price:\t\t\t" + toyotaSupra);
			System.out.println("City Tax:\t\t\t\t" + cityTax);
			System.out.println("Interest Rate:\t\t\t\t" + interestRate);
			System.out.println("Dealer Fee:\t\t\t\t" + dealerFee);
			System.out.println("Army Discount:\t\t\t\t" + studentDiscount);
			System.out.println("Total Payment:\t\t\t\t" + total);
			System.out.println("60 Months Installment, Per month:\t" + monthlyInstallment);

			/*
			 * EXAMPLE OF NESTED IF BLOCKS: Here in the "nested if blocks" the execution of
			 * blocks will be minimum of '0' zero and maximum of '3' three; depending on the
			 * conditions we provide in the blocks.
			 */
		}
		System.out.println("\n^^^^^^^^^^^^^^Car Dealer Ship Receipt^^^^^^^^^^^^^^^\n");

		int num1 = 5;
		if (num1 > 3) {
			System.out.println("your first 'if statement' might be true block");
		}
		if (num1 < 10) {
			System.out.println("read your code again!");
		}
		if (num1 < 50) {
			System.out.println("'num1' must be between 10 - 50");

			int a = 10;
			double b = 20.12;
			int c = (int) b;
			System.out.println(c);
			double d = b;
			System.out.println(d);

			{
			}

		}
	}

}
