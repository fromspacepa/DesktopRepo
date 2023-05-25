package _1__JavaBasicsExamples;

public class _5__ArithmeticOperatorsAndExpressions {

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
		x = 6 / 6;// Here the "/" Division Operator is used, which basically divide the value "6" by "2", which changes the value of varialbe
		          // into "3"
		System.out.println(x);
		x = 5 % 3;// Here the "%" Modulus/Remainder Operator is used, which basically divided the whole number (not decimal numbers) of value "5" 
		          // into/to "3", which changes the value of variable from "5" to "2"
		          // NOTE: Modulus % means Remainder/Remaining. While using Modulus "%" it will divide the number in whole number; For instance:
		          // above here we divided the value "5" in whole number to the value "3", which will give us the remaining value of "2"
		System.out.println(x);
		

		/**
		 * >>> OPERAND VS OPERATOR (2-OF-4):
		 * QUESTION: What is Operand?
		 * ANSWER: Operand is any data or value that we assign the operator to it and both Operand and Operator is just the term that we call these two in Java.
		 * 
		 * Below here in the following examples will explain you more about Operand VS Operator:
		 * 
		 */
		System.out.println("Examples of Operand VS Operation...........");
		int radius = 5;// In this syntax "int" is the Primitive data type; "radius" which is the variable, is the Operand; "=" equal sign which is the assignment
		               // operator is the Operator; and "5" which is the value, is the Operand.

		int diameter = radius * 2;// Same here "int" is the Primitive data type, "diameter" which is the variable, is the Operand; "=" equal sign which is the
		                          // assignment operator, is the Operator; "radius" which is the variable, is the Operand; "*" multiplication sign which is the 
		                          // arithmetic operator, is the Operator; and "2" which is the value, is the Operand 
		                          // and the value "2" is the Operand
		
		System.out.println(radius);// This will print out the outcome of variable "radius" in the console
		System.out.println(diameter);// Same here, this will print out the outcome of variable "diameter" in the console
		
		/**
		 * >>> PRECEDENCE OF MATHIMATIC IN JAVA (3-OF-4)
		 * QUESTION: What is Precedence in Java?
		 * ANSWER: Precedence is the idea of which task should be done or you do first while you have an Arithmetics OR Mathematics problems in your code.
		 * Precedence of Mathematics in Java explained following:
		 * 
		 * When you are trying to solve the Arithmetics OR Mathematics problems in your java code, you would need to do the following steps:
		 * 
		 * Step one: 	-> () Parenthesis
		 * Step two: 	-> * Multiplication
		 * 			 	-> / Division
		 * 			 	-> % Modulus
		 * Step three:	-> + Addition
		 * 				-> - Subtraction
		 * Step four:	-> = Equal Assignment OR Assignment Operator
		 * 
		 * For instance: If you have the above mentioned functions in your code, the precedence needs to be done in the order as shown above.
		 * Such as: 
		 * 1st you would do whatever is inside the (xxxx) parenthesis 
		 * 2nd you would do the * Multiplication, / Division, OR % Modulus,
		 * 3rd you would do the + Addition, and OR - Subtraction
		 * 4th you would do the = Equal Assignment
		 * 
		 * Examples Follows:
		 */
		System.out.println("Example of Arithmatic/Mathematic Precedence...............");
		int num1 = 10;
		int num2 = 5;
		int num3 = 30;
		int num4 = 50;
		int num5 = 3;
		System.out.println("Outcome Results of Precedence:  " + (num1 + num3 / num4 * num1 % num5 + (num4 * num1) - num2));
		System.out.println(200 % 50 - 30 * 3 / 2 + (20 * 10));

		/**
		 * >>> EXPRESSIONS (4-OF-4) 
		 * QUESTION: What is an Expression?
		 * ANSWER: Expression is a term that we use in Java, it is very basics of Java, but it is good to know all the terms (terminology)
		 * 
		 * In the following example statements after "=" Assignment Operator, is/are the Expression(s). 
		 * When you have multiple Arithmetic Operators in your code, that is called an Expression
		 * 
		 */
		int sum = 5 + 5;// Here "int" is the data type; "sum" is the variable/identifier; "=" equal sign is the assignment operator; 
		                // "5 + 5" is more then one OR multiple arithmetic operators, so that is called an Expression. 
		double difference = 17.3 - 2.1;// Same here, after "=" assignment operator is called an Expression.
		long result = 32238134435L / (42 - 875842 % 232);// Same her, after "=" assignment operator is called an Expression.

		/**
		 * NOTE: When you have one ARITHMETIC OR MATHEMATIC Operator in your code, after the "=" equal sign/assignment operator, then that is called Value.
		 * Examples are provided below: 
		 *
		 */

		int num6 = 5;
		double num7 = 10.20;
		long num8 = 32238134435L;

	}

}
