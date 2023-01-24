package javaBasics;

public class Swapping {

	public static void main(String[] args) {

		//This is how to Swapping will be done.
		int a = 20;//First declare and initialize two variables with any value as this one 'a' and below 'b'.
		int b = 40;//
		
		System.out.println("Value of 'a' before swapping:" + a);//This will printout: 20
		System.out.println("Value of 'b' before swapping:" + b);//This will printout: 40
		int c;//Then declare one more or third variable with no value assignment.
		c = a;//Here I am assigning the variable 'a' to this third variable 'c'.
		
		a = b;//Here I am swapping the value of variable 'b' to variable 'a'; and the value of 'a' will change from 20 to 40.
		b = c;//Here I am swapping the value of variable 'a' to variable 'b' by the help of new variable 'c' and the value of 'b' will change from 40 to 20.
		
	
		System.out.println("Value of 'a' after swapping:" + a);//This will printout: 40 after swapping.
		System.out.println("Value of 'b' after  swapping:" + b);//This will printout: 20 after swapping.

	}

}
