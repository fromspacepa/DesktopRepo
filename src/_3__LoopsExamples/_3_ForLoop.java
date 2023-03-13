package _3__LoopsExamples;

public class _3_ForLoop {

	public static void main(String[] args) {

		
		/*
		 * FOR LOOP:
		 * NOTE:
		 * For Loop is the most commonly used loop, it is the most flexible type of loop that we have in Java.
		 * It is the most customizable loop, we have lots of options to play with it.
		 * Also:
		 * In while loop we initialize variable outside the while loop and then we use that variable inside while loop
		 * to run to a number of times; but in for loop we do no do that. We just initialize our variable inside for loop
		 * argument "( )", it becomes part of loop, we are going to use that variable as a counter (in most cases as a counter),
		 * but we have options to play with it, and use it in different ways.
		 */
		/* Example of For-Loop:
		 for loop structure or Syntax:
		 for (Initialization of Variable/Counter happens at step 1 one and only once;
		 Condition happens at step 2 two; Update the Counter/Variable happens at step4 four){
		 The loop body happens at step 3 three. System.out.println(i);
		 }*/
		
		
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
