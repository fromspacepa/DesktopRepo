package loopsExamples;

import java.util.Iterator;

import javax.lang.model.element.Name;

public class _4_ForEachOrEnhanceForLoop {

	public static void main(String[] args) {

		/*
		 * >>> for each (enhanced for loop):
		 * 
		 * "for-each/enhance for loop" is used exclusively to loop through all the elements in an array (data table):
		 * Basically, "for-each/enhanced for loop" is designed to loop through the entire elements that are stored in the array(s).
		 * 
		 * Difference between "for loop" and "for-each/enhanced for loop":
		 * "for-each/enhanced loop" is used to loop through the entire elements in an array, while "for loop" is used to loop through
		 * very customized elements in an array. such as:
		 * When you know exactly how many times you want to loop through a block of code, use the "for loop".
		 * But in "for-each/enhanced for loop" you do not have that option of to loop through certain elements in an array or data table.
		 * 
		 * Understanding of every component of for each (enhance for loop) Syntax:
		 *  --> "for" is the keyword it used to create the for each or enhanced for loop.
		 *  --> "(" bracket open.
		 *  --> "String/int/char" or any kind of data type that you stored in an array.
		 *  --> "myString/myInt/myChar" A variable, Pointer, or name of the Pointer.
		 *  --> ":" A colon which means at.
		 *  --> "names/nums/values" A name of the collection or name of the array or data table that you want to go through.
		 *  --> ")" bracket closed.
		 *  --> "{" curly bracket open, where the code or loop body starts.
		 *  --> "System.out.println(myString);" code body to print out the list of myString that is already stored in an Array.
		 *  --> "}" curly bracket closed.
		 *  
		 *  NOTE: Initially you would have stored the data in Array(s).
		 */
		
		System.out.println("\nUsing 'for-each loop' to loop through all String data type stored in single Array:");
		//Example of storing String data type in single array:
		String[] names = new String [3];
		names[0] = "Ahmad";
		names[1] = "Jamal";
		names[2] = "Akbar";
		//Example of "for-each/enhanced for loop" calling out OR loop through all of the String Elements that are stored in the above Array:
		for (String myString: names) {
			System.out.println(myString);
		}
		//Example of storying integer data type in single array:
		int[] nums = new int [3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println("\nUsing 'for-each loop' to loop through all integer data type stored in single Array:");
		//Example of "for-each/enhanced for loop" calling out OR looping through all of the integer data types that are stored in the above Array:
		for(int myNums: nums) {
			System.out.println(myNums);
		}
	}

}
