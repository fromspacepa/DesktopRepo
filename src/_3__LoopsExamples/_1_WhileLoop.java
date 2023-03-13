package _3__LoopsExamples;

public class _1_WhileLoop {

	public static void main(String[] args) {
		
		System.out.println("-------------");

		// >>>>> WHILE LOOP EXAMPLES:
		
		/*
		 * NOTE:
		 * When you get to Looping, you have couple of options which are:
		 * 1) while loop
		 * 2) do while loop
		 * 3) for loop
		 * 4) for each OR enhanced for loop
		 * These above are all used to iterate/iterating or looping.
		 * 
		 * Basically, same as Selection (if/else/else if), depending on what you are trying to do is that makes sense
		 * to use it for looping/iterating.
		 * While loops in general are good, when we are creating event controlled, or whenever you are creating the loop
		 * based on a boolean condition.  
		 * 
		 * The idea of while loop is that we check the condition 1st, 2nd we then execute the loop body, 
		 * we then check the condition again, and again execute the loop body, and this looping goes through again and again
		 * until the condition is/gets false.
		 */
		int x = 10;
		while (x >= 0) {
			System.out.println(x--);
		}
		System.out.println("-------------");
		
		int y = 3;
		while (y <= 11) {
			System.out.println(y);
			// y++; y++;
			y += 2;

		}

	}
}
