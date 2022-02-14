package javaBasics;

public class SelectiosAndExamples4 {

	public static void main(String[] args) {
		
//Selection Examples with Unary Operators:
		int x = 10;//Here the Variable 'x' is declared & initialized with the Initialization Process with Assigning value of '10' to 'x'.
		int y = 15;//Here the Variable 'y' is declared & initialized with the Initialization Process with Assigning value of '15' to 'y'.
System.out.println("Selection Example with Unary Operator; Using boolean:");
		boolean z = x > y? true : false;//Here the boolean will execute true OR false depending on the condition provided.
		System.out.println(z);//This will print 'false' depending on the condition provided above^.
		
System.out.println("Selection Example with Unary Operatpr; Using String:");
		String result = x > y? "X is bigger" : "It's not!";//Here the String will execute "X is bigger" OR "It's not!" depending on the condition provided.
		System.out.println(result);//This will print "It's not!" depending on the condition provided above^.
		
		

	}

}
