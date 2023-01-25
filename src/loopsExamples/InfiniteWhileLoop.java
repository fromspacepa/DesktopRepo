package loopsExamples;

public class InfiniteWhileLoop {

	public static void main(String[] args) {


		//Example of Infinite Loop:
		//Infinite loop is when the condition in while loop never become false, and the loop body (code in the loop body) will be executed infinite times.
		//means the execution of loop body never stops until you define the condition in the loop body.
		System.out.println("-------------");
		int z = 20;
		while (z > 0) {
			System.out.println("Hello!\t" + z);
			z++;//If you remove this part from the loop/code body, this whole while loop will be executed as infinite loop.
			    //and the result of infinite loop will be:
			    //Hello! 0
				//Hello! 0
				//Hello! 0
				//Hello! 0  ---> and the infinite loop goes on and on with no ending of printing "Hello! 0".
		}
		System.out.println("-------------");
		//This Syntax of While-Loop is infinite loop:
		int w = 20;
		while (w > 0) {
			System.out.println("Hello!\t" + w);
			w++;//with or without this increment operator, the execution of this while loop is infinite, until you define the condition.
		}

	}

}
