
		/**
		 * From this package and this class we are going to start learn about Core-Java Object Oriented Programming (OOPs).
		 * 
		 * QUESTION: What is Java? 
		 * ANSWER: Java is one of the popular and high-level programming language which was created in 1995, 
		 * It is used for:
		 * Mobile applications (specially for Android applications)
		 * Desktop applications
		 * Web applications
		 * Web servers and application servers
		 * Games
		 * Database connection
		 * And much, much more.
		 * 
		 * QUESTION: Why use Java?
		 * ANSWER:
		 * 
		 * Following here the 1st thing will be the package which is named as: _1__JavaBasicsExamples and 2nd is the Class, which is named as: _1_CreatingVariables
		 * NOTE:
		 * When creating java Class in Java/Eclipse, the package name in java always starts lower-case letters and underscores, and camelCase if the name is a combination 
		 * of two or more words. Also, the Class name in java always starts with Upper-case letters and underscores, and camelCase if the name is a combination of two or
		 * more words.
         * 
		 */
		 
	// This is the package.
package _1__JavaBasicsExamples;

	//This here is the Class.
public class _1_CreatingVariables {


		// This following is the main method, which is used to run our code in the counsel:
		// For instance: You have written a code and would like to execute the code to see the outcome in the counsel, then you need to have this main method:
	public static void main(String args[]) {

		// Following this the sample way of creating variable/identifier, and it is the whole syntax of creating variable/identifier:
		int x = 20; 
		
		/** 
		 * >>> Explanation of the above syntax of creating variable:
		 * "int" is a one of Primitives Data Type (Below you'll learn more about data types)
		 * "x" is Variable 
		 * "=" is the Assignment Operator
		 * "20" is the value assigned to variable "x"
		 * portion "int x" of the syntax is called Declaration 
		 * The portion "=" of the syntax is called Assignment Operator  
		 * The portion "20" of the syntax is called Initialization.  
		 * "= 30;" <-This syntax is called the process of assignment.
		 * 
		 * NOTE:
		 * After the first time of variable/identifier declaration and initialization and then 
		 * changing the value of a variable is called the process of Assignment.
		 * 
		 */
	
		// Here following is the process of assignment:
		x = 30; 
        // Just to refresh your memories, here following is the process of declaration and initialization of a variable:
		int y = 15;

		// Following here this code/method is going to printout our code (the variable "x" and "y" that we created them above) in the counsel:
		System.out.println("The value of X is:" + x + " and the value of Y is:" + y);
		

		/**
		 * ____Data Types in Java:
		 * Question: How many data types do we have in Java?
		 * Answer: We have two data types.
		 * 
		 * ___The two data types that we have are: 1) Primitive data types and 2) Reference (Non-Primitive) data types
		 * QUESTION: Why do we call the primitive data types, Primitive?
		 * ANSWER: Because the primitive data types are size predefined or we can say they have predefined sizes.
		 * QUESTION: How many primitive data types do we have?
		 * ANSWER: We have only 8-primitive data types, which are: "byte, short, int, long, float, double, char, and boolean"
		 * >>>NOTE: All 8-primitive data types have different sizes and size can't be changed, because they are all predefined and they all starts with lower-case letter.
		 * 
		 * QUESTION: How many Reference (Non-Primitive) data types do we have?
		 * ANSWER: Reference (Non-Primitive) data types would be any object that we create; for instance: Lets say that we create String,
		 * String is a class so every instance of a String is Reference data type. 
		 * >>>NOTE: Lets say we define a class of Student and then we create an object of it, so that every object would be a Reference (Non-Primitive) data type
		 * In conclusion: We have 8-Primitive data types and we have thousand and thousands of Reference (Non-Primitive) data types.
		 * 
		 */
		
        // Following here are the 8 eight Primitive data types with all details:

		//  Type ------- SizeInBytes ------- Range
		//  byte         1-byte              -128 to 127
		byte b1 = 127;
		//  short        2-bytes             -32,768 to 32,767
		short s1 = 15;
		//  int          4-bytes             -2,147,483,648 to 2,147,483,647
		int i = 4568;
		//  long         8-bytes             -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long l1 = 1354;
		//  float        4-bytes             approximately 3.40282347E+38F (6-7 significant decimal digits) Java implements IEEE 754 standard
		float f = 120.21f;
		//  double       8-bytes             approximately 1.797693134862315 70E +308 (15 significant decimal digits)
		double d = 12.12;
		//  char         1-byte              0 to 65,536
		char c = 'a';
		//  boolean      not precisely       true or false
		//               defined *
		boolean b = true;
		boolean b2 = false;
		boolean b3 = b1 > i;
		b2 = b;
		System.out.println(f);
		System.out.println(b2);
		System.out.println(b3);

		/*
		 * Here we are explaining the Reference OR Non-Primitive Data Types: When we get
		 * to the Reference Data Types, we have couple of ways to Initialize the
		 * Reference Data Types. One of the most Famous and popular class that we will
		 * use a lot, is a String. Every instance of String Class will be an object Or a
		 * Reference Data Type.
		 */

		// Following is the example of how we create a String:
		String text = "texting is fun";// Here is one way of creating a String and it's a special way that's only
										// available to a String Class

		/*
		 * You'll not be able to do the same way with other Reference Data Types. Note:
		 * The text inside two double code is called Literal Value. //The other way that
		 * you can create a String is going to be as follows:
		 */
		String text1 = new String("texting is fun");// Here in this syntax when you say "new String", this structure is
													// basically used to initialized any Reference Data Type 
		                                            // and this applied to all of the Reference Data Types.

		/*
		 * Note: In general when you want to create a Reference Data Type, you need to
		 * make sure that your Data Type //is the name of the class that you are trying
		 * to create an object of. //And then for a String you have the option to
		 * initialize the Variable with a Literal Values and you also have the option to
		 * call the //Constructor of the Class which is the second way, and then you can
		 * create the object of that.
		 */

		System.out.println(text);
		System.out.println(text1);

	}

}
