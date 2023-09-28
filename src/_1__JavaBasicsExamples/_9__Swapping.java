package _1__JavaBasicsExamples;

public class _9__Swapping {

	public static void main(String[] args) {

		/**
		 * >>> Swapping two numbers/values:
		 * 
		 * In the interview you may get asked to swap two numbers or values.
		 * Following are the two different ways of swapping two numbers or values.
		 * 
		 * 1) First example of swapping two numbers is with the help of 3rd variable/attribute.
		 * 2) Second example of swapping two numbers is without the help of 3rd variable/attribute.
		 *
		 */
		
		// 1st you would declare and initialize two attributes, such as follows:
		int a = 10, b = 20;
		System.out.println("\n1ST) Example of Swapping WITH 3rd Attribute/Variable:\n_____Values of Attribute 'a' and 'b' before Swapping:");
		System.out.println("Attribute 'a':\t" + a);//This will printout: 10
		System.out.println("Attribute 'b':\t" + b);//This will printout: 20
		
		// Following here is the example of swapping two different numbers with the help of 3rd attribute:
		int c; // <- This is to declare one more or 3rd attribute with no value.
		c = a; // <- Here I am assigning the attribute "a" to this 3rd attribute "c".
		a = b; // <- Here I am swapping the value of attribute "b" to attribute "a"; by doing this, the value of "a" will change from 10 to 20.
		b = c; // <- Here by the help of 3rd attribute "c" I am swapping the value of attribute "a" to attribute "b"; 
		       // by doing this, the value of "b" will change from 20 to 10.
		// Following here you could try to print out the attribute "a" and "b":
		System.out.println("\n_____Values of Attribute 'a' and 'b' after Swapping:");
		System.out.println("Attribute 'a':\t" + a);// This will now printout: 20 after swapping.
		System.out.println("Attribute 'b':\t" + b);// This will now printout: 10 after swapping.
		
		/**
		 *  Following here is the example of swapping two different numbers without the help of 3rd attribute:
		 *  
		 *  NOTE:
		 *  Below here 1st the attribute "d" is declared and initialized with value of "50";
		 *  2nd the attribute "e" is declared and initialized with value of "100"; such as follows:
		 *  int d = 50; and int e = 100;
		 *  Now, when you want to swap the value of both above attributes without the help of 3rd attribute, you must first swap the value of 2nd attribute "e"
		 *  and then swap the value of attribute "d"; such as follows:
		 *  e = e - d; <- this will swap the value of attribute "e" from "100" to "50", then you must swap the value of 1st attribute "d", such as follows:
		 *  d = d + e; <- this will swap the value of attribute "d" from "50" to "100". That's it you are all good to go.......
		 *  
		 */
		System.out.println("\n2ND) Example of Swapping WITHOUT 3rd Attribute/Variable:\n_____Values of Attribute 'd' and 'e' before Swapping:");
		int d = 50; int e = 100;
		System.out.println("Attribute 'd':\t" + d);
		System.out.println("Attribute 'e':\t" + e);
		e = e - d; // This will swap the value of attribute "e"
		d = d + e; // This will swap the value of attribute "d"
		System.out.println("\n_____Values of Attribute 'd' and 'e' after Swapping:");
		System.out.println("Attribute 'd':\t" + d);
		System.out.println("Attribute 'e':\t" + e);

	}

}
