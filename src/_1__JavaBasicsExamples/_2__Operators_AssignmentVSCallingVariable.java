package _1__JavaBasicsExamples;

public class _2__Operators_AssignmentVSCallingVariable {

	public static void main(String[] args) {
		
		
	/**
	 * Here we are talking about Assignment Variable VS Calling the Variable:
	 * --> Assigning Variable means that you are assigning value OR changing the value of Variable after first time initialization.
	 * --> Calling Variable means that you are just calling/printing the value of Variable and while calling Variable, the value of variable does not change, it just
	 * prints the outcome in the console below:
	 * 
	 */
	
	// Here in this syntax it is the process of variable declaration and initialization: 
	int x = 10;
	// Here in this printOut method it is basically calling/printing out the Variable "x" with the concatenation of literal/text value:
	System.out.println("Initialization Process:\n"+ x +"____1st time Variable 'X' is declared & initialized.\n");
		
	/**
	 * 	Here this is the process of assignment, Assignment happens after 1st time the variable is declared and initialized:
	 * 	___NOTE: At first the value of variable "x" was "10", but here in the assignment process the values of variable "x" is changed to the value of "15"; So this is 
	 *  basically called "Assignment", which is possible after 1st time declaration and initialization.
	 */
	
	x = 15;

	// Here this printOut method will call/print out the outcome in the console below:
	System.out.println("Assignment/Assignment Process:\n"+ x +"____2nd time Variable 'X' is assigned and changed it's value.\n");
		
	/**
	 * Here following is another example of Assignment Process:
	 * "x" is the previously declared variable.
	 * "+=" is the shortcut of Addition operator.
	 * "5" is the value added to the value "15" previously assigned to the variable "x", with this the value of variable "x" is now "20"
	 */
	x += 5;
	// Here this printOut method will call/print out the outcome in the console below:
	System.out.println("Assignment/Assignment Process:\n"+ x +"____3rd time Variable 'X' is assigned and changed it's value.\n");
				
				
	//Example of Calling Variable:
	System.out.println("Calling Variable:\n"+ x + 5+"____1st time calling Variable, the printOut is '205',"
	                   +"\nbecause it is printing '20' together with addition of '5' with no space in between, it looks like '205'.\n");
	/**
	 * In the above examples the value of Variable is changed few times, which was "20".
	 *at this time calling Variable, the SysOut will print "205" because we used "+ 5" OR add "5" to previous value "20", but
	 *the value of Variable "X" is not changed because it is concatenated, and if you call the variable X alone it will printout the value 20,
	 *as follows in the SysOut:
	 */
	System.out.println("Printing Variable 'X':\n" + x +"____Here this is just the printOut of Variable 'X'.\n");
		
	/**
	 * IMPORTANT NOTE:
	 * One thing you need to realize that what you do with the Assignment(s): 
	 * (x = 5;) OR (x += 5;), is that you are assigning the right side of the equal = to the left side of the equal.
	 * 
	 */

	//Example of Assignment Operators ShortCut:
	x += 10;//ShortCut of Addition Assignment Operator. (The original value of Variable "X" was "20", and I added "10" to it, now the value of X is 30.
	System.out.println("Result of Addition 'x += 10;' ShortCut Assingment Operator:");
	System.out.println(x);//The result is printed in the Console below:
	x = x + 10;//This and the above ^ Assignment Operator do the same job. The value of X was 30 and I added 10, now the value of X is 40.
	System.out.println("\nThis Addition 'x = x + 10' and the above Assignment do the same job:");// 
	System.out.println(x);//The result is printed in the Console below:
	x = 100;//Here the value of X is changed/assigned to 100.
	System.out.println(x);
	x += 5;//Here the value of X is added with 5 more, and the value of X is changed to 105.
	// (x = x + 5;) this is the same as above^, but the above is a shortcut of addition operator. 
	System.out.print(x);
	x *= 5;//Here the value of X is multiplied by 5, now the value of X is changed to 525.
	// (x = x * 5;) this is the same as above^ but the above is a shortcut of multiplication operator.
	System.out.println("\n"+x);
	x /= 5;//Here the value of X is divided by 5, now the value of X is changed to 105.
	// (x = x / 5;) this is the same as above^, but the above is a shortcut of division operator.
	System.out.println(x);
	x -= 7;//Here the value of X is subtracted by 7, now the value of X is changed to 98.
	// (x = x - 7;) this is the same as above^, but the above is a shortcut of subtraction operator.
	System.out.println(x);
	x %= 5;/*Here the value of X is divided in whole number, not in decimal by 5, so the remainder from value X is 3. Now the value of X is changed to 3.
	(x = x % 5;) this is the same as above^, but the above is a shortcut of modulus (modulus means remainder/remaining) operator.
	Note: While using Modulus "%" it basically divides the value in whole number, not in decimal, so in the results you get the remainder value.*/
	System.out.println(x);
	x -= 3;//Here the value of X is subtracted by 3, now the value of X is changed to 0.
	System.out.println(x);
		 
	}

}
