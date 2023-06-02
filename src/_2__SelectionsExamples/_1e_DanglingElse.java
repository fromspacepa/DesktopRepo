package _2__SelectionsExamples;

public class _1e_DanglingElse {

	public static void main(String[] args) {

		/** 
		 * DANGLING ELSE......Below is the example of Dangling Else block.
		 * 
		 * NOTE: 
		 * Dangling "else" is when you have an extra "else" block in your "if else" statement. and while having Dangling "else"
		 * in your "if else" statement, you will get a Compiler Error and the code will not get run.
		 * 
		 * NOTE: 
		 * The flow of control for "if else" statement is that you can have only 1 one "if" block, as many "else if" blocks as you want,
		 * and only 1 one "else" block; If you have 2 two "else" blocks that 2nd "else" block is called "Dangling Else Block" which creates 
		 * Compiler Error. 
		 * 
		 * Following is the example, if you run it, it will not get run and you will get the Exception message in the Counsel,
		 * providing you the information that there is DanglingElse and will instruct you that where the DanglingElse occurred in your code.
		 * 
		 */
		
		
		  int num1 = 10; int num2 = 20;
		  
		  if (num1 == 20 || num1 < num2) { 
			  System.out.println("Goodmorning!"); 
		  } else if (num1 > num2 && num2 < num1) { 
			  System.out.println("Hello!"); 
		  } else if (num1 == num2) { 
			  System.out.println("I love you!"); 
		  } else {
			  System.out.println("How are you?"); 
		  //} else {//<<<This is "Dangling Else" >>> To see if "else" block is "Dangling else" 
			  		//please remove the slashes before "else" in this line and execute the code.
			  System.out.println("I am fine!");
		}
		
		
		int num3 = num1 > num2 ? 1000 : 500;
		System.out.println(num3);

			
		  int number = 1;
		  
			while (number <= 5) {
			System.out.print(number + " ");
			number++;
		 
		
		}

	
		
		
	}
	
		
		
}
		
	


