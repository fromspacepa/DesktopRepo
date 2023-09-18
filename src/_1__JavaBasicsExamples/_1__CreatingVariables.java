
		 
	    //Following here is name of the package:
package _1__JavaBasicsExamples;

		//Following here is name of the Class:
public class _1__CreatingVariables {


		// This following is the main method, which is used to run our code in the counsel:
		// For instance: You have written a code and would like to execute the code to see the outcome in the counsel, then you need to have this main method:
	public static void main(String args[]) {
		

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

		// Following this the simple way of creating variable/identifier, and it is the whole syntax of creating variable/identifier:
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
		 * QUESTION: What is Variable/Attribute?
		 * ANSWER: Variable in Java is a data container that saves the data values during Java program execution. 
		 * ________Every variable is assigned a data type that designates the type and quantity of value it can hold. 
		 * ________A variable is a memory location name for the data.
		 * 
		 * >>> General rules for naming variables are:
		 * __Names can contain letters, digits, underscores, and dollar signs
		 * __Names must begin with a letter
		 * __Names should start with a lower-case letter and it cannot contain whitespace
		 * __Names can also begin with "$" dollar sign and "_" underscore
		 * __Names are case sensitive ("myVar" and "myvar" are different variables)
		 * __Names can be camelCase (if a name is more than one word you would use camelCase names, 
		 *   the first letter of a first word starts with lower-case and then
		 *   the first letter of second and third word will start with UpperCase letter.
		 * __Names cannot use Reserved words (like Java keywords, such as int or boolean)
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

		// Following here this code/method which is going to printout our code (the variable "x" and "y" that we created them above) in the counsel:
		System.out.println("The value of X is:" + x + " and the value of Y is:" + y);
		

		/**
		 * >>> Data Types in Java:
		 * 
		 * Question: How many data types do we have in Java?
		 * Answer: We have two data types.
		 * 
		 * ___The two data types that we have are: 1) Primitive data types and 2) Reference (Non-Primitive) data types
		 * QUESTION: Why do we call the primitive data types, Primitive?
		 * ANSWER: Because the primitive data types are size predefined or we can say they have predefined sizes.
		 * QUESTION: How many primitive data types do we have?
		 * ANSWER: We have only 8-primitive data types, which are: "byte, short, int, long, float, double, char, and boolean"
		 * 
		 * NOTE: All 8-primitive data types have different sizes and size can't be changed, because they are all predefined and they all starts with lower-case letter.
		 * 
		 * QUESTION: How many Reference (Non-Primitive) data types do we have?
		 * ANSWER: Reference (Non-Primitive) data types would be any object that we create; for instance: Lets say that we create String,
		 * String is a class so every instance of a String is Reference data type. 
		 * 
		 * NOTE: Lets say we define a class of Student and then we create an object of it, so that every object would be a Reference (Non-Primitive) data type
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
		// Here this printOut method is to print out the variable "f":
		System.out.println("Printing out the value of a Variable 'F': " + f);
		// Here this printOut method is to print out the variable "b2":
		System.out.println("Printing out the value of a Variable 'b2: " + b2);
		// Here this printOut method is to print out the variable "b3":
		System.out.println("Printing out the value of a Variable 'b3': " + b3);

		/**
		 * Here we are explaining more about Reference (Non-Primitive) Data Types: 
		 * When we get to the Reference data types, we have couple of ways to Initialize the Reference data types.
		 * One of the most famous and popular class that we will use a lot, is the String; every instance/copy of a String class will be an object
		 * OR a Reference data type.
		 * 
		 * ___Following here is the example of how to create a String:
		 * "String" is the data type, which is a class.
		 * "text" is the variable name.
		 * "=" is the assignment operator.
		 * ""texting is fun"" is the literal value that is assigned to the variable "text"
		 */ String text = "texting is fun";
		
		// Here in this following example syntax when you say "new String", this structure is basically used to initialize any Reference data type,
		// and this applied to all of the Reference data types.
		String text1 = new String("texting is fun");


		/** 
		 * ___NOTE: In general when you want to create a Reference data type, you would need to make sure that your data type is the name of the class that 
		 * you are trying to create an object of it, and then for a String you have the option to initialize the variable with a literal values and you also
		 * have the option to call the constructor of the class which is the second way, and then you can create the object of that.
		 * 
		 */

		// Here this printout method is print out the variable "text":
		System.out.println(text);
		// Here this printOut method is to print out the variable "text1":
		System.out.println(text1);

	}

}
