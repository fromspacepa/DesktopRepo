package javaBasics;

public class ShortHand_if_else_Statment_OR_TernaryOperator {

	public static void main(String[] args) {

		/**
		 * >>>>> SHORT-HAND "IF ELSE STATEMENT" ALSO KNOWN AS "TERNARY OPERATOR":
		 * 
		 * ___A Short-hand "if else" which is known as the "Ternary Operator" because it
		 * is consists of three Operands. It can be used to replace multiple lines of
		 * code with a single line, and is most often used to replace simple "if else"
		 * statements:
		 * >>> "SHORT-HAND IF ELSE" || "TERNARY OPERATOR" SYNTAX:
		 * DataType Variable = (Condition) ? ExpressionTrue : ExpressionFalse;
		 * 
		 * >>> Step By Step Explanation of the "Short-Hand if else statement" OR "Ternary Operator":
		 * ->1st you complete the process of declaration and initialization the Variable as: "int time1 = 20;"
		 * by Declaring the Data Type and Variable then Initialize and Assign the value to a Variable for the first time.
		 * ->2nd you write your DataType as: "String OR boolean", ->then space, ->then Variable as: "result", 
		 * ->then Assignment Operator as: "=", ->then write your (condition) as: "(time1 > 18)", ->then space,
		 * ->then question mark as: "?", ->then space, ->the write ExpressionTrue as: "Good day!", 
		 * ->then space, ->then colon as: ":", ->then space, ->then write ExpressionFalse as: "Good evening!", and
		 * ->then Semicolon as: ";". That is all about the StepByStep Instructions for "Short-hand if else Statement"
		 * OR "Ternary Operator".
		 * 
		 * ___NOTE:
		 * In the "Short-hand if else Statement" OR "Ternary Operator" the "ExpressionTrue" OR "TrueBlock"
		 * is always written 1st, and the "ExpressionFalse" OR "FalseBlock" is written 2nd OR at the end.
		 * ___ALSO NOTE:
		 * The minimum and maximum condition that will execute in the "Short-hand if else Statement"
		 * OR "Ternary Operator" will be "1" one.
		 * ___KEEP IN MIND:
		 * You can not use block of codes in the "Short-hand if else Statement".
		 * 
		 */ 
		
		// INSTEAD OF WRITING REGULAR "IF ELSE STATEMENT":
		int time = 20;
		if (time < 18) {
			System.out.println("Good day!");
		} else {
			System.out.println("Good evening!");
		}
		// YOU CAN SIMPLE WRITE "SHORT-HAND IF ELSE" STATEMENT:
		int time1 = 20;
		String result = time1 > 18 ? "Good day!" : "Good evening!";//Short-hand if else statement with String data type.
		System.out.println(result);
		boolean greatings = time1 < 18 ? true : false;//Short-hand if else statement with boolean data type.
		System.out.println(greatings);
		
		
		// Example of Selection with Unary Operator using 'boolean' the primitive data type:
		 
		int x = 10;// Here the Variable 'x' is declared & initialized with the Initialization
					// Process of Assigning value of '10' to 'x'.
		int y = 15;// Here the Variable 'y' is declared & initialized with the Initialization
					// Process of Assigning value of '15' to 'y'.
		boolean z = x > y ? true : false;// Here the boolean will execute true OR false depending
											// on the condition provided.
		System.out.println(z);// This will print 'false' depending on the condition provided above^.

		// Example of Selection with Unary Operator using 'String' the Non-primitive
		// data type:
		String result1 = x > y ? "X is bigger" : "It's not!";// Here the String will execute "X is bigger" OR "It's not!"
															// depending on the condition provided.
		String value = x < y ? "Y is bigger" : "It's not!";
		System.out.println(result1);// This will print "It's not!" depending on the condition provided above^.
		System.out.println(value);
		
		// More Example of "Short-hand if else Statements":
		int num1 = 40;
		int num2 = 50;
		String myString = (num1 == num2) ? "Hello" : (num1 > num2) ? "Good Bye" : "Hava a good day";//Example with String.
		System.out.println(myString);
		boolean myBoolean = num1 > num2 ? true : false;//Example with boolean.
		System.out.println(myBoolean);
		boolean myBoolean1 = num1 < num2 ? true : num2 > num1 ? false : num1 == num2 ? true : false;//Example with boolean and with three conditions.
		System.out.println(myBoolean1);
		char myChar = (num1 > num2) ? 'A' : (num2 == num1) ? 'B': 'C';//Example with char with 3 outputs.
		System.out.println(myChar);
		


	}

}
