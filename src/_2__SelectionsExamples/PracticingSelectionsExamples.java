package _2__SelectionsExamples;

import java.util.ArrayList;

public class PracticingSelectionsExamples {

	public static void main(String[] args) {
		
		
		int findingEvenOdd = 21;
		
		String findingEvenOdd1 = findingEvenOdd % 2 == 0? "Even" : "Odd";
		System.out.println(findingEvenOdd1);
		
		if (findingEvenOdd % 2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		int findingEvenOdds = 22;
		
		String findingEvenOdds1 = findingEvenOdds % 2 == 0? "\"Even\"" : "\"Odd\"";
		System.out.println(findingEvenOdds1);
		
		if (findingEvenOdds % 2 == 0) {
			System.out.println("\"Even\"");
		} else {
			System.out.println("\"Odd\"");
		}
		
		
		//Finding FizzBuzz in your selection statements:
		
		int myNum = 21;
		
		if (myNum % 3 == 0 && myNum % 5 == 0) { 
			System.out.println("\"Fizz\"");
		} else if (myNum % 3 == 0) {
			System.out.println("\"FizzBuzz\"");
		} else if  (myNum % 7 == 0) { 
			System.out.println("\"Buzz\"");
		} else {
			System.out.println("\"Try Again!\"");
		}
		

		
		}

}
