 package _1__JavaBasicsExamples;

public class _5_ArithmeticOperatorsAndExpressions {

	public static void main(String[] args) {

		/*
		 * >>>>> ARITHMETIC OPERATORS & EXPRESSIONS:
		 * 
		 * >>>>> OPERATORS: (1-OF-4)
		 * 
		 * = (Assignment) int x = 5; <<<Here the variable X is declared and initialized
		 * with the integer data type and assigned the value of 5 to it. + (Addition) x
		 * = 6 + 3; <<<Here the Addition is operator is used, which basically assigns
		 * the value of 9 to variable x. - (Subtraction) x = 5 - 2; <<<Here the
		 * Subtraction operator is used, which basically assigned the value of 3 to
		 * variable x. * (Multiplication) x = 2 * 4; <<<Here the Multiplication operator
		 * is used, which basically assigned the value of 8 to variable x. / (Division)
		 * x = 6 / 2; <<<Here the Division operator is used, which basically assigned
		 * the value of 3 to variable x % (Modulus/Remainder) x = 5 % 3; <<<Here the
		 * Modulus operator is used, which basically divided the whole number (not
		 * decimal numbers) of value 5 into/to 3 and assigned the remainder value of 2
		 * from value 5 to variable x. Note: Modulus % means Remainder/Remaining. While
		 * using Modulus % the result in your console that you will get will be the
		 * remainder of the value on the left side of the Modulus sign.
		 * 
		 * Following are the examples:
		 */
		System.out.println("Examples of Operators.....................");

		int x = 5;
		System.out.println(x);
		//x = 6 + 3;
		System.out.println(x);
		x = 5 - 2;
		System.out.println(x);
		x = 2 * 4;
		System.out.println(x);
		x = 6 / 2;
		System.out.println(x);
		//x = 5 % 3;
		System.out.println(x);

		/*
		 * >>>>> OPERAND VS OPERATOR (2-OF-4)
		 * 
		 * Operand is any data/value that we assign the operator to it; as examples
		 * Note: Both Operand and Operator is just a term that we call these two in Java
		 * shown below:
		 */

		System.out.println("Examples of Operand VS Operation...........");

		int radius = 5;// Here int is the data type (primitive data type), radius is the Operand, Equal
		// sign is the Operator, and the value 5 is Operand.
		System.out.println(radius);
		int diameter = radius * 2;// Here int is the data type, diameter is the Operand, Equal sign is the
	    // Operator, radius is the Operand, Multiplication sign is the Operator, and the Value of 2 is Operand.
		System.out.println(diameter); 
		
		/** >>>>> PRECEDENCE OF MATHIMATIC IN JAVA (3-OF-4)
		 * 
		 * Precedence is the idea of which task should be done or you do first 
		 * while you have an ARITHMETIC OR MATHEMATIC problem(s) in your code. 
		 * PRECEDENCE of MATHEMATIC in Java:
		 * 
		 * () Parenthesis
		 * *, /, % Multiplication, Division, Modulus
		 * +, - Addition, Subtraction
		 * = Equal/Assignment
		 * 
		 * For example if you have the above mentioned functions in your code, 
		 * the precedence need to be done in-order as shown above
		 * 
		 * 1st step you do whatever is inside the () parenthesis. 2nd step you will do is the * Multiplication, 
		 * / Division, and % Modulus. 3rd step you do is the + Addition and - Subtraction
		 * 4th step you do is the = Equal Assignment 
		 * 
		 * Examples Follows: 
		 */
		
		System.out.println("Example of Arithmatic/Mathematic Precedence...............");
		
		int num1 = 10;
		int num2 = 5;
		int num3 = 30;
		int num4 = 50;
		int num5 = 3;
		
		
		System.out.println("Outcome Results of Precedence:  " +  (num1 + num3 / num4 * num1 % num5 + (num4 * num1) - num2));
		System.out.println(200 % 50 - 30 * 3 / 2 + (20 * 10));
		
		/* >>>>> EXPRESSIONS (4-OF-4)
		NOTE: Expression is a term that we use in Java, it is very basics of Java, but it is good to know all the terms (terminology).
	    In the following example statements after = (Assignment Operator) is/are the Expression(s).
	    When you have multiple arithmetic operators in your code it is called an expression. 
	       DataType  Identifier  =    Expression           */
		     int        sum      =     5 + 5;               
		     double  difference  =    17.3 - 2.1;
		     long      result    =    32238134435L / (42 - 875842 % 232);
		
		// If you have one Arithmetic/Mathematic operator in your code after = (Assignment Operator) it is called Value.
		// For instance:                                  
		// DataType  Identifier  = Value
		     int        num6       = 5;
		     double     num7       = 10.20;
		     long       num8       = 32238134435L;
		 
	 

	}

}
