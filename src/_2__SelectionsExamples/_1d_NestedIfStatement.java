package _2__SelectionsExamples;

public class _1d_NestedIfStatement {

	public static void main(String[] args) {

		/**
		 * Nested if Statements:
		 * 
		 * NOTE:
		 * Nested "if" statements means that when you have one or more than one "if" statements inside one "if" statement.
		 * 
		 * 
		 * 
		 */

		int grade = 59;
		
		if (grade >= 90) {
			System.out.print("You got grade A");
		}if (grade >= 92 && grade <=97) { 
			System.out.println("-");
		}if (grade >= 98 && grade >=100) {
			System.out.println("+");
		}if (grade >= 80 && grade <= 89) {
			System.out.println("B");
		}if (grade >= 70 && grade <= 79) {
			System.out.println("C");
		}if (grade >= 60 && grade <= 69) {
			System.out.println("D");
		}if (grade >= 50 && grade <= 59) {
			System.out.println("F \nInorder to achieve graduate, you have to enroll in the credit recovery program.");
			

		}else {
			System.out.println("\n You did it!");
		}
	}

}
