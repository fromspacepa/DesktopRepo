package _4__ArrayExamples;

import java.text.DecimalFormat;

public class _1a_CountSumMinMaxAvgOfElementsValuesInArrays {

	public static void main(String[] args) {


		int[] numbers = {12, 34, 23, 21, 3, 50, 65, 67, 86};
		
		int count = numbers.length;//This is going to give us the length of Arrays (Elements in Arrays).
		int sum = 0;
		int min = numbers[0];
		int max = numbers[0];
		double avg = 0;
		DecimalFormat numberFormat = new DecimalFormat ("#0.00");//This is going to print-out the decimal of 2-digit numbers.
		
			
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];//To find the sum (total) of numbers in the Array.
			if (numbers[i] < min) {
				min = numbers[i];
			}else if (numbers[i] > max) {
				max = numbers[i];
					}
		}
		avg = sum / count;
		System.out.println("-------------------------------");
		System.out.println("The Number of Elements in Arrays:\t" + count);
		System.out.println("The Sum of Arrays:\t\t\t" + sum);
		System.out.println("The Minimum of Arrays:\t\t\t" + min);
		System.out.println("The Maximum of Arrays:\t\t\t" + (max));
		System.out.println("The Average of Arrays:\t\t\t" + numberFormat.format(avg));
		
		

		//System.out.println(numbers[0]);
		


		}
	

}
