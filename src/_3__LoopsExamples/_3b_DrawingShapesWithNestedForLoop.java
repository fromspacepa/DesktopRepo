package _3__LoopsExamples;

public class _3b_DrawingShapesWithNestedForLoop {

	public static void main(String[] args) {
		
		System.out.println("__________Square Pattern__________\n");
		for (int i = 1; i <= 5; i++) {//This is called "OuterLoop". We start with OuterLoop and this holds the Row numbers, which starts with 1.
			for (int y = 1; y <= 5; y++) {//This is called "InnerLoop". Then we enter or start with InnerLoop and this holds the Column numbers,
				                                      // which starts with 1 and runs till 5, printing all the Columns.
				                                      // Once InnerLoop is finished, 
			System.out.print("* ");
		}
			System.out.println();//it executes this "Println" statement to go to the next Row. Where then the Loop control goes back to the OuterLoop,
			                     //then OuterLoop increments by 1. Again the Loop control goes to the InnerLoop, and the InnerLoop prints all 5 columns
			                     //printing from 1 - 5; Then the println statement is printed and same way the Loop Control goes back to the OuterLoop,
			                     //this repeats for all five times till the Variable i reaches the value 5 and then the Loop Control exits from the Looping
			                     //because the condition becomes false.

		}	
		System.out.println("_________Square Parallel Bar Pattern__________\n");
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (b == 1 || b == 5)
				System.out.print("| ");
				else 
					System.out.print(" * ");
		}
			System.out.println();
		
	
	}	
	System.out.println("_________Square Plus Pattern__________\n");
	for (int a = 1; a <= 5; a++) {
		for (int b = 1; b <= 5; b++) {
			if (a == 5 /2+1 || b == 5 /2+1)
			System.out.print("*  ");
			else 
				System.out.print(" - ");
	}
		System.out.println();
		}
		
	System.out.println("_________Cross Pattern________\n");
	for (int a = 1; a <= 5; a++) {
		for (int b = 1; b <= 5; b++) {
			if (a == b || a + b == 5 + 1)
			System.out.print("x  ");
			else 
				System.out.print("   ");
	}
		System.out.println();
	}
		
	System.out.println("_________Hollow Square Pattern___________\n");
	for (int a = 1; a <= 5; a++) {
		for (int b = 1; b <= 5; b++) {
			if (a == 1 || b == 1 || a == 5 || b == 5)
			System.out.print("*  ");
			else 
				System.out.print("   ");
	}
		System.out.println();
	}
	
	System.out.println("_________Hollow Increasing Triangle Pattern___________\n");
	for (int a = 1; a <= 5; a++) {
		for (int b = 1; b <= 5; b++) {
			if (a == 5 || b == 1 || a == b )
			System.out.print("* ");
			else 
				System.out.print("   ");
	}
		System.out.println();
	}
	System.out.println("_________Hollow Decreasing Triangle Pattern___________\n");
	for (int a = 1; a <= 5; a++) {
		for (int b = a; b <= 5; b++) {
			if (a == 1 || b == a || b == 5 )
			System.out.print("*  ");
			else 
				System.out.print("   ");
	}
		System.out.println();
	}
	System.out.println("_________Hollow Hil Pattern___________\n");
	int n = 5;
	for (int i = 0; i <= n; i++) {
		for (int j = i; j <= n; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j <= i; j++) {
			if (i == n || j == 0)
			System.out.print("* ");
			else
				System.out.print(" ");
	}
	for (int j = 0; j <= i; j++)
		if (i == n || j == i)
		System.out.println("* ");
		else
			System.out.print("  ");
	}
	System.out.println();
	
	
	
	
	}}









