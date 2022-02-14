package javaBasics;

public class SelectiosAndExamples4 {

	public static void main(String[] args) {
		
//Selection Examples with Unary Operators:
//>>>The Unary Operator is short and it's sample, it can take up to one line coding; If you have one condition and you need to check it,
//and you don't have too many things to execute, depending on the condition. You could use Unary Operator.
//>>>But if you have multiple conditions, depending on that if one of them is "true" OR "false", you are going to execute lots of steps
//you would go with the using of "if statement".
		
		int x = 10;//Here the Variable 'x' is declared & initialized with the Initialization Process with Assigning value of '10' to 'x'.
		int y = 15;//Here the Variable 'y' is declared & initialized with the Initialization Process with Assigning value of '15' to 'y'.
System.out.println("Selection Example with using Unary Operator; Using boolean:");
		boolean z = x > y? true : false;//Here the boolean will execute true OR false depending on the condition provided.
		System.out.println(z);//This will print 'false' depending on the condition provided above^.
		
System.out.println("Selection Example with using Unary Operatpr; Using String:");
		String result = x > y? "X is bigger" : "It's not!";//Here the String will execute "X is bigger" OR "It's not!" depending on the condition provided.
		System.out.println(result);//This will print "It's not!" depending on the condition provided above^.
		
System.out.println("Selection Example with using if statements, Printing texted result:");
		if (x > y) {
			System.out.println("'X' is bigger");
		}else {
			System.out.println("'Y' is bigger");
		}

System.out.println("Selection Example with using if statements, Printing boolean:");
		if (x > y) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
