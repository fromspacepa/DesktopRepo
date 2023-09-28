package _1__JavaBasicsExamples;

public class _3a__ShortcutOf_IncrementAndDecrement {
	
	public static void main(String[] args) {
		
		
		/** 
		 * >>> INCREMENT & DECREMENT Prefix:
		 * -> Increment means increasing value of a variable by '1' one.
		 * -> Decrement means decreasing value of a variable by '1' one.
		 * 
		 * ___Prefix Increment (PreIncrement) "++x": means that the value of a variable is increased, before calling it.
		 * ___Prefix Decrement (PreDecrement) "--x": means that the value of a variable is decreased, before calling it.
		 * 
		 * Following here are the examples of using PreIncrement and PreDecrement:
		 * 
		 */
		
		System.out.println("\n...Calling the PreIncrement & PreDecrement Shortcuts:\n");
		
		int numA = 10;
		int numB = 20;
		Double numC = 30.25;
		++numA; 
		int z = ++numA / 11;//Just a different example
		System.out.println("Variable Initially Declared & Initialized:\t"+"numA:"+ numA +"\tnumB:"+ numB +"\tnumC:"+ numC);
		System.out.println("Variable during PrefixIncrement Applied:\t"+"numA:"+ ++numA +"\tnumB:"+ ++numB +"\tnumC:"+ ++numC);
		System.out.println("Variable after PrefixIncrement Applied:\t\t" +"numA:"+ numA +"\tnumB:"+ numB +"\tnumC:"+ numC);
		System.out.println("Variable during PrefixDecrement Applied:\t"+"numA:"+ --numA +"\tnumB:"+ --numB +"\tnumC:"+ --numC);
		System.out.println("Variable after PrefixDecrement Applied:\t\t" +"numA:"+ numA +"\tnumB:"+ numB +"\tnumC:"+ numC);
		
		
		/** 
		 * >>> INCREMENT & DECREMENT Postfix:
		 * -> Increment means increasing value of a variable by '1' one.
		 * -> Decrement means decreasing value of a variable by '1' one.
		 * 
		 * ___Postfix Increment (PostIncrement) "x++": means that the value of a variable is increased, after calling it.
		 * ___Postfix Decrement (PostDecrement) "x--": means that the value of a variable is decreased, after calling it.
		 * 
		 * Following here are the examples of using PreIncrement and PreDecrement:
		 * 
		 */
		
		System.out.println("\n...Calling the PostIncrement & PostDecrement Shortcuts:\n");
		
		int numD = 10;
		int numE = 20;
		Double numF = 30.25;
		System.out.println("Variable Initially Declared & Initialized:\t"+"numD:"+ numD +" numE:"+ numE +" numF:"+ numF);
		System.out.println("Variable during PostfixIncrement Applied:\t"+"numD:"+ numD++ +" numE:"+ numE++ +" numF:"+ numF++);
		System.out.println("Variable after PostfixIncrement Applied:\t" +"numD:"+ numD +" numE:"+ numE +" numF:"+ numF);
		System.out.println("Variable during PostfixDecrement Applied:\t"+"numD:"+ numD-- +" numE:"+ numE-- +" numF:"+ numF--);
		System.out.println("Variable after PostfixDecrement Applied:\t" +"numD:"+ numD +" numE:"+ numE +" numF:"+ numF);
		
		
		//>>> You figure out the out come of the following code work:
		System.out.println("\nYou could find out where these coming from:");
		int a = 5;
		int b = 6;
		int c;
		int d;
		c = ++a - b++ + a++;
		System.out.println(a);
		d = a * b % a + b++ - b + ++b - 7;
		System.out.println(c);
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);

	}

}
