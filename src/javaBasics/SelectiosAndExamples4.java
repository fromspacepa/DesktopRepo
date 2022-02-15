package javaBasics;

public class SelectiosAndExamples4 {

	public static void main(String[] args) {
		
//Selection Examples with Unary Operators:
//>>>The Unary Operator is short and it's sample, it can take up to one line coding; If you have one condition and you need to check it,
//and you don't have too many things to execute, depending on the condition. You could use Unary Operator.
//>>>But if you have multiple conditions, depending on that if one of them is "true" OR "false", you are going to execute lots of steps
//you would go with using of "if else statement".
		
		int x = 10;//Here the Variable 'x' is declared & initialized with the Initialization Process with Assigning value of '10' to 'x'.
		int y = 15;//Here the Variable 'y' is declared & initialized with the Initialization Process with Assigning value of '15' to 'y'.
System.out.println("Selection Example with using Unary Operator; Using boolean:");
		boolean z = x > y? true : false;//Here the boolean will execute true OR false depending on the condition provided.
		System.out.println(z);//This will print 'false' depending on the condition provided above^.
		
System.out.println("Selection Example with using Unary Operatpr; Using String:");
		String result = x > y? "X is bigger" : "It's not!";//Here the String will execute "X is bigger" OR "It's not!" depending on the condition provided.
		System.out.println(result);//This will print "It's not!" depending on the condition provided above^.

//Selections example with one if Statement and one true block:
//You can use the one if statement and one true block when you have or looking for true OR false condition.
//Syntax of one if statement with one true block:
				// if (conditions){
				//     "true block"
				// }
System.out.println("Selection Example with using if statements, Printing texted result:");
		if (x > y) {
			System.out.println("'X' is bigger");
		}else {
			System.out.println("'Y' is bigger");
		}

System.out.println("Selection Example with using 'if statements', Printing boolean:");
		if (x > y) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

System.out.println("Selection Example with using 'if else statement' and using many steps to get one 'True' OR 'False' result:");
//Below here is the "if else statement". There are many conditions provided, but only one of them will be True OR False.
//The if else statement will run the code from Top to Bottom, it will run till it get the True OR False condition.
//If the True OR False condition is found in the first condition the code will stop running because of the result is found.
//OR if the True OR False condition is found in the middle condition the code will stop running because of the result is found.
//Basically the code will be running till it finds the True OR False condition.

//SCENARIO OF SCHOOL REPORT CARD GRADES:
		// 90 - 100		= A
		// 80 - 89		= B 
		// 70 - 79		= C
		// 60 - 69		= D
		// < 60			= F

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
		
//Following is the Example of Selection with one true condition to be run:
		//
		int w = 130;
		int h = 100;
		
		if (w > h)
			System.out.println("Habibi Haya Haya");
	}
	

}
