package javaBasics;

public class FizzBuzzInterviewQuestion {

	public static void main(String[] args) {

		/*
		 * >>>>> FIZZ BUZZ EXMPLES WITH IF STATEMENT:
		 * 
		 * >>> IF THE VARIABLE/NUMBBER IS DIVISIBLE BY DIFFERENT NUMBERS IT IS GOING TO
		 * PRINT ONE OF THE FOLLOWING CODITION: _Print "TEK" if the number is divisible
		 * by 3. _Print "School" if the number is divisible by 5. _Print "TEK School" if
		 * the number is divisible by 3 and 5. _Print the number if is not divisible by
		 * either 3 or 5
		 * 
		 */
		int num = 15;
		if (num % 3 == 0 && num % 5 == 0) {// Here if Variable value is 15, it will print "TEK School"
			System.out.println("TEK School");
		} else if (num % 5 == 0) {// Here if the Variable value is 10, it will print "School"
			System.out.println("School");
		} else if (num % 3 == 0) {// Here if the Variable value is 9, it will print "TEK"
			System.out.println("TEK");
		} else {// Else if the Variable value is 11, it will just print the number (11) which is
				// the value of a Variable.
			System.out.println(num);
		}

		//EXAMPLE OF FizzBuzz:
		int number = 30;
		if (number % 3 == 0 && number % 5 == 0) {// Here if Variable value is 15, it will print "FizzBuzz"
			System.out.println("FizzBuzz");
		} else if (number % 5 == 0) {// Here if the Variable value is 10, it will print "Buzz"
			System.out.println("Buzz");
		} else if (number % 3 == 0) {// Here if the Variable value is 9, it will print "Fizz"
			System.out.println("Fiz");
		} else {// Else if the Variable value is 11, it will just print the number (11) which is
				// the value of a Variable.
			System.out.println(number);
		}
	}

}
