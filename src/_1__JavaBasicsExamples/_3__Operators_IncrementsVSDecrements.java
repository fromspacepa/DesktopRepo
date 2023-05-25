package _1__JavaBasicsExamples;

public class _3__Operators_IncrementsVSDecrements {

	public static void main(String[] args) {

		/**
		 * >>> INCREMENT VS DECREMENT:
		 * -> Increment will be "++" (plus plus); this means increase/add the value of a variable by "1" one.
		 * -> Decrement will be "--" (minus minus); this means decrease/subtract the value of a variable by "1" one.
		 * While talking about Increment and Decrement, we have PreIncrement & PostIncrement same we have PreDecrement & PostDecrement
		 * -> PreIncrement means increase/add the value of a variable by "1" one, before calling the variable.
		 * -> PostIncrement means increase/add the value of a variable by "1" one, after calling the variable.
		 * -> PreDecrement means decrease/subtract the value of a variable by "1" one, before calling the variable.
		 * -> PostDecrement means decrease/subtract the value of a variable by "1" one, after calling the variable.
		 * 
		 */

		// Examples of PreIncrement: 
		System.out.println("The flow execution of Pre-Increment:");
		int x = 1;// Here the Variable 'x' is declared and initialized with the assignment of value '1'
		System.out.println(x);// This is going to print: 1
		System.out.println(++x);// This is PreIncrement, it will print the value of 'x' as '2' because of the flow execution of PreIncrement.
		System.out.println(x);// This will still print the value of 'x' as '2' because of changes happened above^ by the flow execution of PreIncrement.
	
		// Example of PostIncrement:
		System.out.println("The flow execution of Post-Increment:");
		int y = 2;// Here the Variable 'y' is declared and initialized with the assignment of value '2'
		System.out.println(y);// This is going to print: 2
		System.out.println(y++);// This is Post-Increment, it will still print the value of 'y' as '2' because of the flow execution of Post-Increment.
		System.out.println(y);// This will print the value of 'y' as '3' because of changes happened above^ by the flow execution of Post-Increment.
		
		// Examples of PreDecrement:
		System.out.println("The flow execution of Pre-Decrement:");
		int a = 3;// Here the Variable 'a' is declared and initialized with the assignment of value '3'
		System.out.println(a);// This is going to print: 3
		System.out.println(--a);// This is PreDecrement, it will print the value of 'a' as '2' because of flow execution of PreDecrement.
		System.out.println(a);// This will still print the value of 'a' as '2' because of changes happened above^ by the flow execution of PreDecrement.
	
		// Examples of PostDecrement:
		System.out.println("The flow execution of Post-Decrement:");
		int b = 4;// Here the Variable 'b' is declared and initialized with the assignment of value '4'
		System.out.println(b);// This is going to print: 4
		System.out.println(b--);// This is PostDecrement, it will still print the value of 'b' as '4' because of the flow execution of PostDecrement.
		System.out.println(b);// This will print the value of 'b' as '3' because of changes happened above^ by the flow execution of PostDecrement.
		

		
	}

}
