package loopsExamples;

public class _2b_NestedWhileLoop {

	public static void main(String[] args) {

      /*
       *  NESTED-LOOP EXAMPLE:__Nested-Loop means: a while loop inside another while loop.
       *  
       *  It is also possible to place a loop inside another loop. This is called a nested loop.
	   *  The "inner loop" will be executed one time for each iteration of the "outer loop":
       */


		int num1 = 1;
		int num2 = 1;
		while (num1 <= 5) {//Outer (While) Loop
			while (num2 <= 5) {//Inner (While) Loop
				System.out.print("*in ");//Inner Loop Printout
				num2++;
			}
			System.out.println("-out");//Outer Loop Printout
			 num2 = 1;
			num1++;
		}

	}

}
