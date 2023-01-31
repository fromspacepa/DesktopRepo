package arrayExamples;

public class ExampleOf_FibonacciNumbersInTheArrays {

	public static void main(String[] args) {
		
		//Example of an Interview Question about printing out the Fibonacci Numbers:
		
		int [] fibnums = new int [10];
		fibnums [0] = 0;
		fibnums [1] = 1;
		
		for (int i = 2; i < fibnums.length; i++) {
			fibnums [i] = fibnums[i-1] + fibnums[i-2];
			System.out.println(fibnums[i]);//This is going to printout 1, 2, 3, 5, 8, 13, 21, 34.
		}
		

	}

}
