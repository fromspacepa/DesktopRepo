package javaBasics;

public class ForLoop {

	public static void main(String[] args) {

		// Example of For-Loop:
		// for loop structure or Syntax:
		// for (Initialization of Variable/Counter happens at step 1 one and only once;
		// Condition happens at step 2 two; Update the Counter/Variable happens at step4 four){
		// The loop body happens at step 3 three. System.out.println(i);
		// }
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);// (3) Loop body.//
		}
		System.out.println("----------------------");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
	    }
		System.out.println("--- Print 7 to 8 ---");
		for (int i = 7; i <= 18; i++) {
			System.out.println(i);
		}
		System.out.println("--- Print 9 to 15 ---");
		for (int i = 9; i <= 15; i++) {
			System.out.println(i);
	    }
		System.out.println("--- Print 5 to -5 ---");
		for (int i = 5; i >= -5; i--) {
			System.out.println(i);
		}
		System.out.println("--- Print -10 to 0 ---");
		for (int i = -10; i <= 0; i++) {
			System.out.println(i);
		}
		System.out.println("--- Print a to d ---");
		for (char myChar = 'a'; myChar <= 'd'; myChar++) {
			System.out.println(myChar);
		}
		
		
	}
}
