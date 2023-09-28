package _1__JavaBasicsExamples;

public class _6__EqualityAndRelationalOperators {

	public static void main(String[] args) {

		/**
 		* >>> OPERATORS:
 		* Operators constitute the basic building block to any programming language. Java also provides many types of Operators which can be used according
 		* to the need to perform various calculations and functions such as: Logical, Arithmetic, Relational, Equality, and etc... They are classified based
 		* on the functionality they provide.
 		* 
 		* ___Here in the class we are covering/talking about two types of operators: 
 		* 1) Equality Operators and 2) Relational Operators:
 		* 
 		* >>> EQUALITY OPERATORS:
 		* --> "==" stands for "Equal Operator"
 		* --> "!=" stands for "Not Equal Operator"
 		* 
 		* >>> Difference between Equal/Equality Operators used with Primitive data types and Non-Primitive data types:
 		* In general Equal/Equality Operators will be used with Primitive data types, basically while using Equal/Equality Operators with Primitive data types
 		* they will check/compare the values of the Primitive data types in Stack, to see if the values are Equal/Same OR not Equal/Same, but while using Equal/
 		* Equality Operators with Non-Primitive data types, they will basically check if both the Non-Primitive/Reference data types are stored OR not stored
 		* in the same location in the Memory.
 		* 
 		* NOTE: Never use Equality Operators to compare Non-Primitive/Reference data types, because it will never give you the correct response.
 		* 
 		*/

		int x = 25;// As you know this is the process of declaration and initialization; Value "25" is assigned to variable "x", which is changeable any time
		int y = 15;// As above same here.
		
		/**
		 * >>> Example of using Equality Operators:
		 * These following printOut methods will print out the boolean (true) result in the console, if the "x" is equal to "y", if not equal it will print (false)
		 *
		 */
		System.out.println("Example of Equality Operator with Primitive data types:\t\t" + (x == y));
		System.out.println("Example of Not Equal Operator with Primitive data types:\t" + (x != y));

		/**
		 * >>> Examples of using Equality Operators with Non-Primitive/Reference data types:
		 * Following here "str1" and "str2" the new objects of a class String is created in the Memory, and the value "Test" is assigned to both objects "str1" 
		 * and "str2". So, as you see the value of both String objects are the same, you will still not be able to get the correct response by using the Equality
		 * Operators, because they are both stored in different locations in the Memory.
		 * 
		 * NOTE: While creating a String, it will be saved as an object in Array of Character in different locations in the Memory, not as same value.
		 * If you want to compare both Strings, you need to use the method ".equal();"
		 */
		String str1 = new String("Test");// This is to create an object of a String
		String str2 = new String("Test");// This is to create an object of a String too
		System.out.println("Example of using Equality Operator with Reference data types:\t" + (str1 == str2));// This will printout false, though the Value "test" 
		                                                                                                       // of both Strings are the same.
		str1.equals(str2);// Example of using method: ".equal();"
		System.out.println("Example of using \".equal()\" method for comparing two Strings:\t" + str1.equals(str2));// This will printout true, because the Value 
		                                                                                                            // of both Strings are 4 Characters (letters).
		/**
		 * >>> RELATIONAL OPERATORS:
		 * 
		 * --> "<" stands for "Less than"
		 * --> "<=" stands for "Less than and Equal to"
		 * --> ">" stands for "More than"
		 * --> ">=" stands for "More than and Equal to"
		 * 
		 * NOTE: Using of the Relational Operators will give the boolean (true/false) result, depending on the condition provided in your code.
		 * Example of using Relational Operators:
		 * 
		 */

		int a = 20;// As of you know that here the value "20" is assigned to the variable "a"
		int b = 30;// Same here the value "30" is assigned to the variable "b"
		System.out.println("\nExamples of using the Relational Operators:");
		System.out.println(a > b);// This will results into "false"
		System.out.println(a < b);// This will results into "true"
		System.out.println(a >= b);// This will results into "false"
		System.out.println(a <= b);// This will results into "true"

	}

}