package _2__SelectionsExamples;

public class _1b_FindingEvenAndOddExample {

	public static void main(String[] args) {

		/**
		 * Interview Question: (How to find the Even OR Odd numbers)
		 * 
		 * In here we are talking about how to find the "Even" OR "Odd" numbers: 
		 * This is just to see if the value is either "Even" OR "Odd" values. It is just an interview question.
		 * 
		 */
		int x = 7;// This is to declare and initialize an integer data type attribute "x" and assign the value of seven "7" to it.
				
		/**
		 * Here in this Selection statement "if, else" condition the attribute "x" is divided by "2" 
		 * and if after the division the attribute equals to zero "0", the first block of "if" statement will printout
		 * and if after the division the attribute not equals to zero "0", the second block of "else" statement will printout.
		 * 
		 */
		
		// Example of finding "Even" or "Odd" using "if else" statement:
		 if (x % 2 == 0) {
			 System.out.println("EVEN");
		 } else {
			 System.out.println("ODD");
		 }
		 // Example of finding "Even" or "Odd" using "Ternary Operator":
		 String myValue = x % 2 == 0 ? "myVaule is Even" : "myValue is Odd";
		 System.out.println(myValue);
		
		 // Example of finding "Even" or "Odd" using "if else" statement: 
		 int y = 101;
		 if (y % 2 == 0) {
			 System.out.println("Y is EVEN numeric character");
		 }else {
			 System.out.println("Y is ODD numeric character");
					 
		 }

		 // Example of finding "Even" or "Odd" using "Ternary Operator":
		 String myVal = y % 2 == 0 ? "myVal is Even" : "myVal is Odd";
		 System.out.println(myVal);


	}

}
