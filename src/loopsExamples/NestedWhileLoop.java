package loopsExamples;

public class NestedWhileLoop {

	public static void main(String[] args) {

      // NESTED-LOOP EXAMPLE:__Nested-Loop means: a while loop inside while loop.
		
		int num1 = 1;
		int num2 = 1;
		while (num1 <= 5) {//Outer (While) Loop
			while (num2 <= 5) {//Inner (While) Loop
				System.out.print(num2);//Inner Loop Printout
				num2++;
			}
			System.out.println();//Outer Loop Printout
			 num2 = 1;
			num1++;
		}

	}

}
