package javaBasics;

public class _5_Operators_Equality_5 {

	public static void main(String[] args) {

//OPERATORS:
		// Operators constitute the basic building block to any programming language.
		// Java too provides many types of operators which can be used according to the
		// need to perform various calculations and functions, be it Logical,
		// Arithmetic, Relational, etc. They are classified based on the functionality
		// they provide.
//1:__EQUALITY OPERATORS:
		// "==" >>> Stands for "Equal Operator"
		// "!=" >>> Stands for "Not Equal Operator"

//>>>Difference between Equal/Equality Operators used with Primitive Data Types & Non-Primitive/Reference Data Types:
		// In general Equal/Equality Operators will be used with Primitive Data Types;
		// Basically while using Equal/Equality Operators with Primitive Data Types,
		// they will check/compare the values of the Primitive Data Types in Stack; to
		// see if the values are Equal/Same OR Not Equal/Same.
		// But while using Equal/Equality Operators with Non-Primitive/Reference Data
		// Types, they basically will check if both the Non-Primitive/Reference Data Types 
		//are stored/saved OR not stored/saved in the same location in the Memory.

		// Here the Variable is initialized:
		int x = 25;// Here Variable "X" is Initialized and the Value "25" is assigned to it; Which
					// is changeable at any time.
		int y = 15;// Here Variable "Y" is Initialized and the Value "15" is assigned to it; Which
					// is changeable at any time.
		// Example of using Equality Operators:
		System.out.println(x == y);// This will printout the boolean result (if "X" is equal to "Y" it will print
									// "true", if not it will print "false").
		System.out.println(x != y);// This will printout the boolean result (if "X" is not equal to "Y" it will
									// print "true", if not it will print "false").

//>>>NOTE: Never use Equality Operators to compare Non-Primitive/Reference Data Types. Because it will never give you the correct response.
		// Here the String is created:
		String str1 = new String("test");// Here the String "str1" OR new Object is created in the Memory, and the Value
											// "test" is assigned to it.
		String str2 = new String("test");// Here the String "str2" OR new Object is created in the Memory, and the same
											// above^ Value "test" is assigned to it.
		// So, as you see the Value of both Strings are the same. You will be still not
		// able to get the correct response by using the Equality Operators
		// because, there are both stored/saved in the different locations in the
		// Memory.
		// Example of using Equality Operators with String:
		System.out.println(str1 == str2);// This will printout false, though the Value "test" of both Strings are the
											// same.
		// Because, while creating String, it will be saved as an Object in Array of
		// Character in different locations in Memory; not as same Value.
		// If you want to compare both Strings, you need to use ".equals" method:
		str1.equals(str2);
		System.out.println(str1.equals(str2));// This will printout true, because the Value of both Strings are 4
												// Characters (letters).

//2:__RELATIONAL OPERATORS:
		// "<" >>> Stands for "Less than"
		// "<=" >>> Stands for "Less than and Equal to"
		// ">" >>> Stands for "More than"
		// ">=" >>> Stands for "More than and Equal to"

//>>>Any time using the Relational Operators 
		// Example of Relational Operators:
		int a = 20;// Here the Integer Variable "a" is Initialized and assigned the Value of "20"
					// to it.
		int b = 30;// Here the Integer Variable "b" is Initialized and assigned the Value of "30"
					// to it.
		System.out.println(a > b);// This will basically printout the boolean result (true OR false), depending on
									// the condition provided.
		System.out.println(a < b);// This will basically printout the boolean result (true OR false), depending on
									// the condition provided.
		System.out.println(a >= b);// This will the same printout the boolean result (true OR false), depending on
									// the condition provided.
		System.out.println(a <= b);// This will the same printout the boolean result (true OR false), depending on
									// the condition provided.

	}

}