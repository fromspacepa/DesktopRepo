package javaBasics;

public class OperatorsII5 {

	public static void main(String[] args) {


//Equality Operators:
		// "==" >>> Stands for "Equal Operator"
		// "!=" >>> Stands for "Not Equal Operator"
		
//Difference between Equal/Equality Operators used with Primitive Data Types & Non-Primitive/Reference Data Types:
		//In general Equal/Equality Operators will be used with Primitive Data Types; Basically while using Equal/Equality Operators with Primitive Data Types,
		//they check the values of the Primitive Data Types in the Stack; to see the difference value between two Primitive Data Types.
		//But while using Equal OR Equality Operators with Non-Primitive/Reference Data Types, they basically will check if both the Non-Primitive/Reference Data Types
		//are saved in the same location in the Memory.
		
		int x = 25;
		int y = 15;
		
		System.out.println(x == y);
		System.out.println(x != y);

	}

}
