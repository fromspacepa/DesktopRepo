package javaBasics;

public class DoWhileLoop {

	public static void main(String[] args) {

		
		//Example of While loop just as a Reference:

		int x = 10;//Here the Variable 'x' is declared, initialized, and assigned the value of 10 to it.
		while (x > 10 && x <= 20) {//This is the condition.
			System.out.println(x++);//This is the loop body.
			}
		/*
		 * Comparison between while and do while loop:
		 * >>>The idea of "while" loop:
		 * In while loop 1st we check the condition, (2nd) then we execute the loop body;
		 * we then check the condition again, and then execute the loop body again,
		 * and this looping goes through again and again until the condition becomes/is false.
		 * >>>The idea of "do while" loop:
		 * In do-while loop 1st we execute the loop body, (2nd) then we check the condition,
		 * we then execute the loop body again, and then check the condition again,
		 * and this looping goes through again and again until the condition is false.
		 * So, that is the only difference between "while" and "do-while" loop; which is order of execution. 
		 */
		
		
		//Example of Do-while loop:
		
		/*
		 * As mentioned above that the only difference between "while" loop and "do-while" loop is the order of execution.
		 * In "do-while" loop, the loop body is executed first, then the condition. Depending on the loop body,
		 * If the logic is true, the loop body will get executed first, then check the condition, this way the looping
		 * continues until the condition is/becomes false. and then the Java will continue to rest of the program.
		 * but, even if the condition is false, the loop body will still be executed once, and then the Java will continue 
		 * to rest of the program.
		 */
		System.out.println("Example of 'do-while' loop with true condition:");
		//In this "do-while" loop the looping will occur 6 times and after that the Java will continue to rest of the program.
		int y = 5;//Here the Variable 'y' is declared, initialized and assigned the value of 5 to it.
		do {
			System.out.println(y++);//This is the loop body.
		} while (y > 5 && y <= 10);//This is the condition.
		
		System.out.println("Example of 'do-while' loop with false condition:");
		//In this "do-while" loop the looping will occur only 1 time and after that the Java will continue to rest of the program.
		//because the condition is false, but the loop body will still be executed once.
		int y1 = 5;//Here the Variable 'y' is declared, initialized and assigned the value of 5 to it.
		do {
			System.out.println(y1--);//This is the loop body.
		} while (y1 > 5 && y <= 10);//This is the condition.
		
		
	}
		
		
		

	

}
