package _2__SelectionsExamples;

import java.util.ArrayList;

public class PracticingSelectionsExamples {

	public static void main(String[] args) {


		int myValue = 20;
		
		if (myValue % 2 == 0) {
			System.out.println("Even");
		} else if (myValue % 3 == 0) {
			System.out.println("Odd");
		}
		
		String myResults = myValue % 3 == 0 ? "Even" : "Odd";
		System.out.println(myResults);

		}

}
