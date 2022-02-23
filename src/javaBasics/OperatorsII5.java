package javaBasics;

public class OperatorsII5 {

	public static void main(String[] args) {


//Equality Operators:
		// "==" >>> Stands for "Equal Operator"
		// "!=" >>> Stands for "Not Equal Operator"
		
//Difference between Equal/Equality Operators used with Primitive Data Types & Non-Primitive/Reference Data Types:
		//In general Equal/Equality Operators will be used with Primitive Data Types; Basically while using Equal/Equality Operators with Primitive Data Types,
		//they will check the values of the Primitive Data Types in the Stack; to see if the values are Equal/Same OR Not Equal/Same.
		//But while using Equal/Equality Operators with Non-Primitive/Reference Data Types, they basically will check if both the Non-Primitive/Reference Data Types
		//are stored/saved OR not stored/saved in the same location in the Memory.
		
		int x = 25;//Here the Value of "25" is Initialized and assigned to Variable "X"; Which is changeable at any time.
		int y = 15;//Here the Value of "15" is Initialized and assigned to Variable "Y"; Which is changeable at any time.
		
		System.out.println(x == y);//This will printout the boolean result (if "X" is equal to "Y" it will print "true", if not it will print "false").
		System.out.println(x != y);//This will printout the boolean result (if "X" is not equal to "Y" it will print "true", if not it will print "false").
		

	}

}
