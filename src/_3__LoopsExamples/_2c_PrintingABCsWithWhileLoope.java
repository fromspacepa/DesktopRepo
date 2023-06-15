package _3__LoopsExamples;

public class _2c_PrintingABCsWithWhileLoope {

	public static void main(String[] args) {
	
		/*
		 * Below here are the examples of printing English Alphabetic Letters by using while, do while, for, and for each loop:
		 */
		
		
		char char1 = 'a';
		char char2 = 'A';
		System.out.println("while loop Printing Alphabetic Letters in LowerCase:");
		while (char1 <='z' ) {
			System.out.print(char1 + " ");
			char1++;
		}
		
		System.out.println("\n\nwhile loop Printing Alphabetic Letters in UpperCase:");
		while (char2 <= 'Z') {
			System.out.print(char2 + " ");
			char2++;
		}
		
		System.out.println("\n\nfor loop Printing Alphabetic Letters in LowerCase:");
		for (char myChar = 'a'; myChar <= 'z'; myChar++) {
			System.out.print(myChar + " ");
		}
	
		System.out.println("\n\ndo wihle loop Printing Alphabetic Letters in LowerCase:");
		char myChar = 'a';
			do {
			System.out.print(myChar++ + " ");
		}while (myChar <= 'z' );
			
			
		}
		{	
			
		}
	}
				
