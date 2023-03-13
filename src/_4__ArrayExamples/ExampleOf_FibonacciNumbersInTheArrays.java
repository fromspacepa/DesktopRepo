package _4__ArrayExamples;

public class ExampleOf_FibonacciNumbersInTheArrays {

	public static void main(String[] args) {
		
		/* >>>>> Fibonacci Sequence/Numbers:
		 * Q: What is Fibonacci Sequence/Numbers?
		 * A: In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones (the first two numbers).
		 * Individual numbers in the Fibonacci sequence are know as: Fibonacci Numbers, commonly denoted Fn. The sequence commonly starts from 0 and 1,
		 * although some authors start the sequence from 1 and 1 or sometimes (as did Fobonacci) from 1 and 2, starting from 0 and 1, the first few
		 * values in the sequence are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and on and on etc.....
		 */
		
		//Example of an Interview Question about printing out the Fibonacci Numbers:
		
		int [] fibnums = new int [10];//This is going to declare, initialize the single array of integer with '10' elements inside the array.
		fibnums [0] = 0;//This is going to assign value of '0' zero to 1st element and index '0' zero.
		fibnums [1] = 1;//This is going to assign value of '1' one to 2nd element and the index '1' one.
		
		for (int i = 2; i < fibnums.length; i++) {//This is the 'for loop' syntax which is going to execute the Fibonacci Sequence Numbers.
			fibnums [i] = fibnums[i-1] + fibnums[i-2];
			System.out.println(fibnums[i]);//This is going to printout 1, 2, 3, 5, 8, 13, 21, 34.
		} 

		}
		

	

}
