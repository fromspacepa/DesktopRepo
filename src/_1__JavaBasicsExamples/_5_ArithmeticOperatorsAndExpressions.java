package _1__JavaBasicsExamples;

public class _5_ArithmeticOperatorsAndExpressions {

	public static void main(String[] args) {

		/**
		 * Here we are talking about Arithmetic Operators & Expressions:
		 * 
		 * >>> OPERATORS: (1-OF-4):
		 * 
		 * __ " = " <- This is the Assignment Operator.
		 * __ " + " <- This is the Addition Operator.
		 * __ " - " <- This is the Subtraction Operator.
		 * __ " x " <- This is the Multiplication Operator.
		 * __ " / " <- This is the Division Operator.
		 * __ " % " <- This is the Modulus/Remainder Operator.
		 * 
		 * Following are the examples of using all the above Operators:
		 * 
		 */
		System.out.println("Examples of Operators.....................");

		int x = 5;// Here the variable "x" is declared and initialized with the integer data type and assigned the value of "5" to it with 
		          // help of "=" Assignment Operator.
		System.out.println(x);
		x = 6 + 3;// Here the "+" Addition Operator is used, which basically changes the value of a variable from "6" to "9"
		System.out.println(x);
		x = 5 - 2;// Here the "-" Subtraction Operator is used, which basically subtract value "2" from the value of variable and that changes
				  // the value of variable from "5" to "3"
		System.out.println(x);
		x = 2 * 4;// Here the "x" Multiplication Operator is used, which basically multiply the value "2" of a variable by "4", which changes  
				  // the value of variable from "2" to "8"
		System.out.println(x);
		x = 6 / 2;// Here the "/" Division Operator is used, which basically divide the value "6" by "2", which changes the value of varialbe
		          // into "3"
		System.out.println(x);
		x = 5 % 3;// Here the "%" Modulus/Remainder Operator is used, which basically divided the whole number (not decimal numbers) of value "5" 
		          // into/to "3", which changes the value of variable from "5" to "2"
		          // NOTE: Modulus % means Remainder/Remaining. While using Modulus "%" it will divide the number in whole number; For instance:
		          // above here we divided the value "5" in whole number to the value "3", which will give us the remaining value of "2"
		System.out.println(x);

		/**
		 * >>> OPERAND VS OPERATOR (2-OF-4):
		 * 
		 * Operand is any data or value that we assign the operator to it and both Operand and Operator is just the term that we call these
		 * two in Java; Following here it is explained it details:
		 * 
		 */

		System.out.println("Examples of Operand VS Operation...........");

		int radius = 5;// Here int is the data type (primitive data type), radius is the Operand, Equal
		// sign is the Operator, and the value 5 is Operand.
		System.out.println(radius);
		int diameter = radius * 2;// Here int is the data type, diameter is the Operand, Equal sign is the
		// Operator, radius is the Operand, Multiplication sign is the Operator, and the
		// Value of 2 is Operand.
		System.out.println(diameter);

		/**
		 * >>>>> PRECEDENCE OF MATHIMATIC IN JAVA (3-OF-4)
		 * 
		 * Precedence is the idea of which task should be done or you do first while you
		 * have an ARITHMETIC OR MATHEMATIC problem(s) in your code. PRECEDENCE of
		 * MATHEMATIC in Java:
		 * 
		 * () Parenthesis *, /, % Multiplication, Division, Modulus +, - Addition,
		 * Subtraction = Equal/Assignment
		 * 
		 * For example if you have the above mentioned functions in your code, the
		 * precedence need to be done in-order as shown above
		 * 
		 * 1st step you do whatever is inside the () parenthesis. 2nd step you will do
		 * is the * Multiplication, / Division, and % Modulus. 3rd step you do is the +
		 * Addition and - Subtraction 4th step you do is the = Equal Assignment
		 * 
		 * Examples Follows:
		 */

		System.out.println("Example of Arithmatic/Mathematic Precedence...............");

		int num1 = 10;
		int num2 = 5;
		int num3 = 30;
		int num4 = 50;
		int num5 = 3;

		System.out.println(
				"Outcome Results of Precedence:  " + (num1 + num3 / num4 * num1 % num5 + (num4 * num1) - num2));
		System.out.println(200 % 50 - 30 * 3 / 2 + (20 * 10));

		/*
		 * >>>>> EXPRESSIONS (4-OF-4) NOTE: Expression is a term that we use in Java, it
		 * is very basics of Java, but it is good to know all the terms (terminology).
		 * In the following example statements after = (Assignment Operator) is/are the
		 * Expression(s). When you have multiple arithmetic operators in your code it is
		 * called an expression. DataType Identifier = Expression
		 */
		int sum = 5 + 5;
		double difference = 17.3 - 2.1;
		long result = 32238134435L / (42 - 875842 % 232);

		// If you have one Arithmetic/Mathematic operator in your code after =
		// (Assignment Operator) it is called Value.
		// For instance:
		// DataType Identifier = Value
		int num6 = 5;
		double num7 = 10.20;
		long num8 = 32238134435L;

	}

}
