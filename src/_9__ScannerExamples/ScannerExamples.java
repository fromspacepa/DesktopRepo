package _9__ScannerExamples;

import java.util.Scanner;


public class ScannerExamples {
	
	public static void main(String[] args) {

		/* Brief introduction of a Scanner class:
		 * Scanner by itself is a class which comes with Java.util package.
		 * The Scanner class is used to get user's input, to use the Scanner class, you need to create/instantiate an object of the Scanner class
		 * and use any of the available methods found in the Scanner class documentation. In our example below, we will use the "nextLine() method, which reads Strings.
		 * A parameter "System.in" which is in the argument of constructor is going to be the input that you input in the console,
		 * you would need to modify it based on what you want to do that what is your input would be.
		 * Basically, in the example below, by typing something in the console a respond to your respond will be printed in the console.
		 *
		 * NOTE:
		 * If you enter wrong input (for example instead of integer value you enter String value), you will get an exception/error message (like "InputMismatchException").
		 * Also, when you create the Scanner constructor, you would see the red underline under Scanner, that is then you need to import it from java.util by hovering your mouse. 
		 */
		
	Scanner input = new Scanner(System.in);// This is a constructor to instantiate the object of a class scanner. 
	System.out.println("What is your name? ");// In this example when you run this code, you will see this text (a question) in the console and you would 
	                                          // need to type your respond (input) in the console; based on your respond you will see the results in the console.
	System.out.println("Your name is: " + input.nextLine());// Here the text "Your name is: " will be concatenated with whatever Strings you type in the console.

	/* You have all these following methods:
	 * next();__Reads a String value (only a single String value with out any spaces in between) from the user in the console.
	 * nextBoolean();__Reads a boolean value from the user in the console.
	 * nextByte();__Reads a byte value from the user in the console.
	 * nextDouble();__Reads a double value from the user in the console.
	 * nextFloat();__Reads a float value from the user in the console.
	 * nextInt();__Reads an integer value from the user in the console.
	 * nextLine();__Reads the Strings value (words, sentences, paragraphs with all spaces occurs at beginning/between/end) from the user in the console.
	 * nextLong();__Reads a long value from the user in the console.
	 * nextShort();__Reads a short value from the user in the console.
	 */

	
	
	}
}
