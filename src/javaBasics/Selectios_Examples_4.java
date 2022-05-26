package javaBasics;

public class Selectios_Examples_4 {

	public static void main(String[] args) {
		
/* Selection Statements in Java:
  In Java, Selection Statements are used to control the flow of the program.
  These are the types of Selection Statements in Java:
		 1): if statement
		 2): if-else statement
	     3): switch statement
  
  if statement:
		In Java, "if" is a conditional statement. It will provide execution of one of two statements (or blocks), depending on the condition:
		Syntax:
		 if (condition) {
		 statements;
		 
		
		}	*/
				
/* Selection Examples with Unary Operator OR Conditional Operator:
  >>>Using the Unary Operator OR Conditional Operator in Selection Statement is short and it's sample, it can take up to one line coding; If you have one condition and you need to check it,
  and you don't have too many things to execute, depending on the condition. You could use Unary Operator.
  >>>But if you have multiple conditions, depending on that if one of them is "true" OR "false", you are going to execute lots of steps
  you would go with using of "if else statement".    */

		//Example of Selection with Unary Operator, using boolean keyword (Primitive Data Type):
		int x = 10;//Here the Variable 'x' is declared & initialized with the Initialization Process with Assigning value of '10' to 'x'.
		int y = 15;//Here the Variable 'y' is declared & initialized with the Initialization Process with Assigning value of '15' to 'y'.

		boolean z = x > y? true : false;//Here the boolean will execute true OR false depending on the condition provided.
		System.out.println(z);//This will print 'false' depending on the condition provided above^.
		
		//Example of Selection with Unary Operator using the String Keyword (Non-Primitive Date Type):
		String result = x > y? "X is bigger" : "It's not!";//Here the String will execute "X is bigger" OR "It's not!" depending on the condition provided.
		String value = x < y? "Y is bigger" : "It's not!";
		System.out.println(result);//This will print "It's not!" depending on the condition provided above^.
		System.out.println(value);
		
/* Selections example with one if Statement and one true block:
  You can use the one if statement and one true block when you have or looking for one true OR false condition.
  Syntax of one if statement with one true block:
			if (conditions){
		     "true block"
		 	}   */
		
		//Examples of if statement with one true OR false condition, depending on the condition provided:
		if (x > y) {
			System.out.println("'X' is bigger");
		}else {
			System.out.println("'Y' is bigger");
		}

		//Similar example of if statement as above^:
		if (x > y) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

/* Following is the Example of Selection of if statement with one true statement to be run, without opening OR need of true block.
  In this Syntax the condition is going to be true, and the true statement will be the only statement to printed, and that is the only condition.
  Syntax of if statement with out true/code block:
		if (condition)
	 	true statement   */
		
		//Example of if statement with only true statement:
		int w = 130;
		int h = 100;				
		if (w > h)
		System.out.println("Habibi Haya Haya");

/*Below here is the "if else statement". There are many conditions provided, but only one of them will be True OR False.
The if else statement will run the code from Top to Bottom, it will run till it get the True OR False condition.
If the True OR False condition is found in the first condition the code will stop running because of the result is found.
OR if the True OR False condition is found in the middle condition the code will stop running because of the result is found.
Basically the code will be running till it finds the True OR False condition. */

		/*SCENARIO OF SCHOOL REPORT CARD GRADES:
		90 - 100		= A
		80 - 89		= B 
		70 - 79		= C
		60 - 69		= D
		< 60			= F */

		double grade = 83;//This means that the Variable "grade" is equal to any value provided from the list below.
		
		if (grade >= 90) {//This means if the grade is equal OR more than 90, print "A".
			System.out.println("A");
		} else if (grade >= 80) {//This means if the grade is equal OR more than 80, then print "B".
			System.out.println("B");
		} else if (grade >= 70) {//This means if the grade is equal OR more than 70, then print "C".
			System.out.println("C");
		} else if (grade >= 60) {//This means if the grade is equal OR more than 60, then print "D".
			System.out.println("D");
		} else {//This means if the grade is less than 60, then print "F".
			System.out.println("F");
		}
		
		
		int q = 100;
		int o = 200;
		
		String a = "Hello";
		String b = "World";
		
		if (a!=b){
			System.out.println(a);
		}else 
			System.out.println(b);
		
	}
}
