package _1__JavaBasicsExamples;

public class _5a__ShortcutOperatorsOfArithmeticOperators {

	public static void main(String[] args) {


		/** 
		 * >>> SHORTCUT OF ARITHMETIC OPERATORS:
		 *  
		 * Shortcut Arithmetic Operators:  (1-OF-3)
		 * ___Operators_______Usage__________Equivalent
		 * ___+=______________x += 3;________x = x + 3; <- Addition
		 * ___*=______________x *= 5;________x = x * 5; <- Multiplication
		 * ___/=______________x /= 2;________x = x / 2; <- Division
		 * ___-=______________x -= 3;________x = x - 3; <- Subtraction
		 * ___%=______________x %= 5;________x = x % 5; <- Modulus/Remainder
		 * 
		 * NOTE: 
		 * - Above at the very first right side are the Shortcut Operator; 
		 * - In the middle they are syntaxes and the example usages of the Shortcut of Arithmetic Operators;
		 * - And the at last, the left side are the syntaxes are the example of usages of the Regular Arithmetic Operators;
		 * 
		 * Following here is the practice of both Shortcut of Arithmetic Operators and Regular Arithmetic Operators:
		 * 
		 */
		
		System.out.println("\n...Calling the Shortcuts of Arithmetic Operators:\n");
		
		int num1 = 30; 
		int num2 = 40;
		int num3 = 5;
		int num4 = 15;
		double num5 = 20;
		double num6 = 25;
		
		num1 += num2;// Shortcut Syntax of Addition Operator.
		System.out.println("Calling the Addition Shortcut Operator:\t\t\t" + num1);
		num1 = num1 + num2;// Regular/Basic Syntax of Addition Operator.
		System.out.println("Calling the regular AdditionOperator:\t\t\t" + num1);
		num3 *= num2;// Shortcut Syntax of Multiplication Operator.
		System.out.println("Calling the Multiplication Shortcut Operator:\t\t" + num3);
		num3 = num3 * num2;// Regular/Basic Syntax of Multiplication Operator.
		System.out.println("Calling the regular MultiplicationOperator:\t\t" + num3);
		num2 /= num3;// Shortcut Syntax of Division Operator.
		System.out.println("Calling the Division Shortcut Operator:\t\t\t" + num2);
		num2 = num2 / num3;// Regular/Basic Syntax of Division Operator.
		System.out.println("Calling the regular DivisionOperator:\t\t\t" + num2);
		num6 -= num5;// Shortcut Syntax of Subtraction Operator.
		System.out.println("Calling the Subtraction Shortcut Operator:\t\t" + num6);
		num6 = num6 - num5;// Regular/Basic Syntax of Subtraction Operator.
		System.out.println("Calling the regular SubtractionOperator:\t\t" + num6);
		num4 %= num3;// Shortcut Syntax of Modulus/Remainder Operator.
		System.out.println("Calling the Modulus/Remainder Shortcut Operator:\t" + num4);
		num4 = num4 % num3;// Regular/Basic Syntax of Modulus/Remainder Operator.
		System.out.println("Calling the regular Modulus/RemainderOperator:\t\t" + num4);
		
		

				

		 
		

	}

}
