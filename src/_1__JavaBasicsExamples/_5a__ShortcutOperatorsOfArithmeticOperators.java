package _1__JavaBasicsExamples;

public class _5a__ShortcutOperatorsOfArithmeticOperators {

	public static void main(String[] args) {


		/** >>>>> SHORTCUT OF ARITHMETIC OPERATORS:
		 *  
		 * >>>Shortcut Arithmetic Operators:  (1-OF-3)
		 * ___Operators_______Usage__________Equivalent
		 * ___+=______________x += 3;________x = x + 3; //Addition
		 * ___*=______________x *= 5;________x = x * 5; //Multiplication
		 * ___/=______________x /= 2;________x = x / 2; //Division
		 * ___-=______________x -= 3;________x = x - 3; //Subtraction
		 * ___%=______________x %= 5;________x = x % 5; //Modulus/Remainder
		 * 
		 * Note: Above the very right sides are Shortcut Operator, in the middle is the sample of Usage,
		 * and the last left sides are the regular syntax of Operators. Below here are the practice of 
		 * both Shortcut Operator and Regular Syntaxes: */
		
		System.out.println("\n...Calling the Shortcuts of Arithmetic Operators:\n");
		
		int num1 = 30; 
		int num2 = 40;
		int num3 = 5;
		int num4 = 15;
		double num5 = 20;
		double num6 = 25;
		num1 += num2;//Shortcut Syntax of Addition Operator.
		num1 = num1 + num2;//Regular/Basic Syntax of Addition Operator.
		System.out.println("Calling the Addition Shortcut Operator:\t\t\t" + num1);
		System.out.println("Calling the regular AdditionOperator:\t\t\t" + num1);
		num3 *= num2;//Shortcut Syntax of Multiplication Operator.
		num3 = num3 * num2;//Regular/Basic Syntax of Multiplication Operator.
		System.out.println("Calling the Multiplication Shortcut Operator:\t\t" + num3);
		System.out.println("Calling the regular MultiplicationOperator:\t\t" + num3);
		num2 /= num3;//Shortcut Syntax of Division Operator.
		num2 = num2 / num3;//Regular/Basic Syntax of Division Operator.
		System.out.println("Calling the Division Shortcut Operator:\t\t\t" + num2);
		System.out.println("Calling the regular DivisionOperator:\t\t\t" + num2);
		num6 -= num5;//Shortcut Syntax of Subtraction Operator.
		num6 = num6 - num5;//Regular/Basic Syntax of Subtraction Operator.
		System.out.println("Calling the Subtraction Shortcut Operator:\t\t" + num6);
		System.out.println("Calling the regular SubtractionOperator:\t\t" + num6);
		num4 %= num3;//Shortcut Syntax of Modulus/Remainder Operator.
		num4 = num4 % num3;//Regular/Basic Syntax of Modulus/Remainder Operator.
		System.out.println("Calling the Modulus/Remainder Shortcut Operator:\t" + num4);
		System.out.println("Calling the regular Modulus/RemainderOperator:\t\t" + num4);
		
		
		/** >>>>> SHORTCUT OF ARITHMETIC OPERATORS:
		 * 
		 * ___Increment & Decrement Prefix:  (2-OF-3)
		 * Increment means increasing of variable by '1' one.
		 * Decrement means decreasing of variable by '1' one.
		 * 
		 * ___Prefix Increment (PreIncrement) OR Prefix Decrement (PreDecrement):
		 * Prefix means that the variable is increased/decreased by '1' one already before calling the variable.
		 * Following are some of the simple examples:
		 */
		
		System.out.println("\n...Calling the Prefix of Increment & Decrement Shortcuts:\n");
		
		int numA = 10;
		int numB = 20;
		Double numC = 30.25;
		++numA; 
		int z = ++numA / 11;//Just a different example
		System.out.println("Variable Initially Declared & Initialized:\t"+"numA"+ numA +" numB:"+ numB +" numC:"+ numC);
		System.out.println("Variable during PrefixIncrement Applied:\t"+"numA:"+ ++numA +" numB:"+ ++numB +" numC:"+ ++numC);
		System.out.println("Variable after PrefixIncrement Applied:\t\t" +"numA:"+ numA +" numB:"+ numB +" numC:"+ numC);
		System.out.println("Variable during PrefixDecrement Applied:\t"+"numA:"+ --numA +" numB:"+ --numB +" numC:"+ --numC);
		System.out.println("Variable after PrefixDecrement Applied:\t\t" +"numA:"+ numA +" numB:"+ numB +" numC:"+ numC);
		
		
		/** >>>>> SHORTCUT OF ARITHMETIC OPERATORS:
		 * 
		 * ___Increment & Decrement Postfix:  (3-OF-3)
		 * Increment means increasing of variable by '1' one.
		 * Decrement means decreasing of variable by '1' one.
		 * 
		 * ___Postfix Increment (PostIncrement) OR Postfix Decremenet (PostDecrement):
		 * Postfix means that the variable is increasing/decreasing by '1' one later the variable is called at first time.
		 * Following are some of the simple examples:
		 */
		
		System.out.println("\n...Calling the Postfix of Increment & Decrement Shortcuts:\n");
		
		int numD = 10;
		int numE = 20;
		Double numF = 30.25;
		System.out.println("Variable Initially Declared & Initialized:\t"+"numD"+ numD +" numE:"+ numE +" numF:"+ numF);
		System.out.println("Variable during PostfixIncrement Applied:\t"+"numD:"+ numD++ +" numE:"+ numE++ +" numF:"+ numF++);
		System.out.println("Variable after PostfixIncrement Applied:\t" +"numD:"+ numD +" numE:"+ numE +" numF:"+ numF);
		System.out.println("Variable during PostfixDecrement Applied:\t"+"numD:"+ numD-- +" numE:"+ numE-- +" numF:"+ numF--);
		System.out.println("Variable after PostfixDecrement Applied:\t" +"numD:"+ numD +" numE:"+ numE +" numF:"+ numF);
		
		
		//>>>>> What is the outcome of following question?
		
		int a;
		int b;
		int c;
		int d;
		a = 5;
		b = 6;
		c = ++a - b++ + a++;
		System.out.println(a);
		d = a * b % a + b++ - b + ++b - 7;
		System.out.println(c);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);

				

		 
		

	}

}
