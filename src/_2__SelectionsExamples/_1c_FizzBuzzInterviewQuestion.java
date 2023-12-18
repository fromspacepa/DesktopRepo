package _2__SelectionsExamples;

public class _1c_FizzBuzzInterviewQuestion {

	public static void main(String[] args) {

		/*
		 * Interview Question: (FIZZ BUZZ Examples with if statement)
		 * 
		 * In here this is just an interview question that how to find out "FIZZ", "BUZZ, or "FIZZBUZZ" 
		 * if the variable in your code is divisible by different numbers.
		 * 
		 * Scenario: 
		 * If the attribute/variable/value is divisible by different numbers, 
		 * it is going to print out one of the following condition:
		 * Print "TEK" if the number is divisible  by 3. 
		 * Print "School" if the number is divisible by 5. 
		 * Print "TEK School" if the number is divisible by 3 and 5. 
		 * Print the number if is not divisible by either 3 or 5
		 * 
		 */
		int num = 15;
		if (num % 3 == 0 && num % 5 == 0) {// Here if Variable value is 15, it will print "TEK School"
			System.out.println("TEK-School\n");
		} else if (num % 5 == 0) {// Here if the Variable value is 10, it will print "School"
			System.out.println("School");
		} else if (num % 3 == 0) {// Here if the Variable value is 9, it will print "TEK"
			System.out.println("TEK");
		} else {// Else if the Variable value is 11, it will just print the number (11) which is the value of a Variable.
			System.out.println(num);
		}

		//EXAMPLE OF FizzBuzz:
		int number = 15;
		if (number % 3 == 0 && number % 5 == 0) {// Here if Variable value is 15, it will print "FizzBuzz"
			System.out.println("FizzBuzz\n");
		} else if (number % 5 == 0) {// Here if the Variable value is 10, it will print "Buzz"
			System.out.println("Buzz");
		} else if (number % 3 == 0) {// Here if the Variable value is 9, it will print "Fizz"
			System.out.println("Fizz");
		} else {// Else if the Variable value is 11, it will just print the number (11) which is the value of a Variable.
			System.out.println(number);
		}
		
		int myValue = 27;
		
		if (myValue % 6 == 0 && myValue % 10 == 0) {// Here if Variable value is 30, it will print "FizzBuzz"
			System.out.println("FizzBuzz");
		} else if (myValue % 10 == 0) {// Here if Variable value is 20, it will print "Buzz"
			System.out.println("Buzz");
		} else if (myValue % 3 == 0) {// Here if Variable value is 27, it will print "Fizz"
			System.out.println("Fizz");
		} else {// Else if the Variable value is not divisible to all above three conditions, it will print the value of a Variable.
			System.out.println(myValue);
		}
	}

}
