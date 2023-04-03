package _6e__OOPs_ScannerExamples;

import java.util.Scanner;

public class NumberGame {

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
	 *
	 * SCENARIO:
	 * Create a program with condition and using if/else/while loop that you have an integer value
	 * The target number/value to be entered in the program is: 13
	 * if the value entered by the user in the console is the matched with a targeted value, 
	 * you would receive a message saying: The number you entered is correct!
	 * else if the value entered by the user is more than the targeted value, you would receive a first message saying: Try again! 
	 * In the second try, if the entered value is more than the targeted value, you would receive a message saying: Go down! Try again!
	 * and on the next try if the value entered is less than the targeted value, you would receive a message saying: Go up! Try again!
	 * and will keep asking you till you enter the correct value. Once the correct value is entered you would receive a message saying:
	 * The number you guessed is correct!.
	 */
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the number you guessed: ");
	int goalNum = 13;
	int numEntered;
	
	numEntered = input.nextInt();
	
	if(numEntered == goalNum) {
		System.out.println("The number you guessed is correct!");
	}else {
		while (numEntered != goalNum) { 
			System.out.println("Try again!");
			numEntered = input.nextInt();
		  if(numEntered == goalNum) {
			System.out.println("The number you guessed is correct; Congradulations!!!");
			break;
		  }else { 
     		 if(numEntered > goalNum) {
				System.out.println("Go down!");
			}else {
			System.out.println("Go up!");
		}
	}}}

		
	/* NOTE:
	 * You have all these following methods:
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
