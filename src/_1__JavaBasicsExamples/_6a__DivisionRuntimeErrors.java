package _1__JavaBasicsExamples;

public class _6a__DivisionRuntimeErrors {

	public static void main(String[] args) {
		
		/*
		 * >>> Division Arithmetic Exceptions: 1-OF-3
		 * -> Division with integer and double
		 * 
		 * While having Arithmetic statements/executions in your Java code, you may face exceptions/errors, especially in division during runtime
		 * 
		 * QUESTION: Why is this important to know?
		 * ANSWER: It is important because you maybe working with a peace of code that is going to calculate something you need to know that
		 *         what can you expect from such code statements that is demonstrated below:
		 * 
		 * Following are some of the Arithmetic examples, using Quotient, Remainder, Division:
		 * -> Quotient (Quotient is the term for the result of a division problem; It means how many times one of the value is divided to another value)
		 */

	
		int x = 16, y = 5; // As of now, you now that this is the process of variable declaration and initialization.
		
		// Example of Quotient: 
		int quotient = x / y; // This quotient problem will give you the result of "2"
		System.out.println("Result of Quotient: " + quotient);
		
		// Example of Remainder:
		int remainder = x % y; // This remainder problem will give you the result of "3"
		System.out.println("Result of Remaider: " + remainder);
		
		/*
		 * >>> Division Arithmetic Exceptions: 2-OF-3
		 * -> Division of Integer by Zero: 
		 * -> Division of Integer by Zero will give you Exception/Error
		 * 
		 * NOTE: While integer value is divided by zero, it will give you an Exception/Error during execution/runtime, but while you are coding,
		 * everything will look good/normal and will not indicate any errors during coding. But once the exception occurs, Java will not continue 
		 * to executing rest of the code. In case of same thing happens during program/application running, Java will terminate and exit the program. 
		 * 
		 * Following are the examples of Division of Integer by Zero: 
		 */
		
		/*
		 * int zeroDivision = 9 / 0; // This division by zero problem will give you an
		 * Arithmetic Exception/Error: System.out.println("Result of Division By Zero: "
		 * + zeroDivision); int a = 10, b = 0;
		 * System.out.println("Result of Integer division by zero: " + a/b);//This will give you Exception, but here there is no indication of error/exception:
		 *System.out.println("Result of Integer zero division by zero: " + b/b);//This will also give you Exception, but here there is no indication of error/exception:
		 */
		
		/*
		 * >>> Division Arithmetic Exceptions: 3-OF-3
		 * -> Division of Double by Zero AND Division of Double Zero by Double Zero value:
		 * -> Division of Double value by Zero will give you "Infinity" 
		 * -> Division of Double zero value by Double zero value will give you "NaN"
		 * 
		 * NOTE: While double value is divided by zero, it will give you the result of "Infinity" during execution/runtime, 
		 * And while double zero value is divided by zero, it will give you the result of "NaN" during execution/runtime,
		 * but while you are coding everything will look good/normal and will not indicate any errors during coding.
		 * 
		 * ALSO, While double value is divided by double value, it will not give you any exceptions/errors, it will give 
		 * you the result of double value with decimals.
		 * 
		 * Following are the examples of Division Double value by Zero value:
		 */
		double c = 10.0, d = 0.0;
		System.out.println(c/d);// This will give you infinity.
		System.out.println(d/d);// This will give you NaN.
		double z = 3.0 / 0.0;
		System.out.println("Result of Double Division by Floating-Point: "+ z);//This will give you: Infinity
		double z1 = 0.0 / 0.0;
		System.out.println("Result of Double Divsion by Zero Floating-Point: " + z1);//This will give you: NaN

		// Following are the examples of Division Double value by Double value:
		double e = 10.0, f = 2.2;
		double q = e / f;
		System.out.println("Result of Quotient/Division By Floating-Point: " + q);//This will give you: 4.545454545454545
		double r = e % f;
		System.out.println("Result of Remainder by Floating-Point: " + r);//This will give you: 1.1999999999999993
		

	

 
		

	}

}
