package arrayExamples;

public class ExampleOf_FibonacciNumbersInTheArrays {

	public static void main(String[] args) {
		
		//Example of an Interview Question about printing out the Fibonacci Numbers:
		
		int [] fibnums = new int [10];//This is going to declare, initialize the single array of integer with '10' elements inside the array.
		fibnums [0] = 0;//This is going to assign value of '0' zero to 1st element and index '0' zero.
		fibnums [1] = 1;//This is going to assign value of '1' one to 2nd element and the index '1' one.
		
		for (int i = 2; i < fibnums.length; i++) {//This is the 'for loop' syntax which is going to execute the Fibonacci Sequence Numbers.
			fibnums [i] = fibnums[i-1] + fibnums[i-2];
			System.out.println(fibnums[i]);//This is going to printout 1, 2, 3, 5, 8, 13, 21, 34.
		} 
		System.out.println("\n");
		int value = 0;
		int [][] nums = new int [7][4];
		for(int outerLoop = 0; outerLoop < nums.length; outerLoop++) {
			for (int innerLoop = 0; innerLoop < nums[outerLoop].length; innerLoop++) {
				nums[outerLoop][innerLoop] = value++;
				System.out.print(value + "\t");
			}
			System.out.println("\n");
		}
		

	}

}
