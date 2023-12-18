package _2__SelectionsExamples;

public class _2_ShortHand_if_else_Statment_OR_TernaryOperator {

	public static void main(String[] args) {

		/**
		 * In this class we are talking about Shorthand "if else" statement:
		 *
		 * >>> Shorthand "if else" statement also known as "Ternary Operator":
		 * A shorthand "if else" statement which is known as the "Ternary Operator" because it is consists of three Operands, 
		 * it can be used to replace multiple lines of codes with a single line and is most often used to replace simple "if else" statement.
		 * 
		 * >>> "SHORT-HAND IF ELSE" || "TERNARY OPERATOR" SYNTAX:
		 * DataType Variable = (Condition) ? ExpressionTrue : ExpressionFalse, such as:
		 * boolean  myValue  = (10 > 20) ? "No 10 is less than 20" : "No 10 is more than 20"; 
		 * 
		 * >>> Step by step explanation of the Shorthand" if else" statement
		 * :
		 * ->1st you complete the process of declaration and initialization the Variable as: 
		 * "int time1 = 20;" 
		 * ->2nd you write your data type as: "String/boolean/int/double", ->then space, ->then Variable as: "result", 
		 * ->then Assignment Operator as: "=", ->then write your (condition) as: "(time1 > 18)", ->then space,
		 * ->then question mark as: "?", ->then space, ->the write ExpressionTrue as: "Good day!", 
		 * ->then space, ->then colon as: ":", ->then space, ->then write ExpressionFalse as: "Good evening!", and
		 * ->then Semicolon as: ";". That is all about the StepByStep Instructions for "Short-hand if else Statement" OR "Ternary Operator".
		 * 
		 * NOTE:
		 * In Shorthand "if else" statement OR "Ternary Operator" the "ExpressionTrue" OR "TrueBlock" is always written 1st, 
		 * and the "ExpressionFalse" OR "FalseBlock" is written 2nd. Also, the minimum and maximum condition that will execute in the 
		 * Shorthand "if else" statement will be "1" one.
		 * 
		 */ 
		
		// Instead of writing regular "if else" statement: such as follows:
		int time = 20;
		if (time < 18) {
			System.out.println("Good day!");
		} else {
			System.out.println("Good evening!");
		}
		// You can simply write Shorthand "if else" statement: such as follows:
		int time1 = 20;
		String result = time1 > 18 ? "Good day!" : "Good evening!";
		System.out.println(result);
		boolean greatings = time1 < 18 ? true : false;
		System.out.println(greatings);
		
		
		// Example of Selection with Ternary Operator using 'boolean' the primitive data type:
		int x = 10;
		int y = 15;
		boolean z = x > y ? true : false;
		System.out.println(z);

		// Example of Selection with Ternary Operator using 'String' reference data type:
		String result1 = x > y ? "X is bigger!" : "Y is bigger!";
		System.out.println(result1);
		String value = x < y ? "X is bigger!" : "Y is bigger!";
		System.out.println(value);
		
		// More examples of Ternary Operator:
		int num1 = 40;
		int num2 = 50;
		String myString = num1 == num2 ? "Hello" : num1 > num2 ? "Good Bye" : num1 < num2 ? "Hava a good day" : "Warka Dang";
		System.out.println(myString);
		boolean myBoolean = num1 > num2 ? true : false;
		System.out.println(myBoolean);
		boolean myBoolean1 = num1 < num2 ? true : num2 > num1 ? false : num1 == num2 ? true : false;
		System.out.println(myBoolean1);
		char myChar = (num1 > num2) ? 'A' : (num2 == num1) ? 'B': 'C';
		System.out.println(myChar);
		


	}

}
