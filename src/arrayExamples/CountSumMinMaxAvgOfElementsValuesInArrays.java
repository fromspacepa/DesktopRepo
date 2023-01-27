package arrayExamples;

public class CountSumMinMaxAvgOfElementsValuesInArrays {

	public static void main(String[] args) {


		int[] numbers = {12, 34, 23, 21, 10, 50, 65, 67, 86};
		
		int count = numbers.length;//This is going to give us the length of Arrays (Elements in Arrays).
		System.out.println(numbers.length);
		System.out.println("-------------------------------");
		int sum = 0;
		int min = numbers[0];
		//System.out.println(numbers[0]);
		int max = numbers[0];
		double ave = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			//To find sum:
			//sum = sum + numbers[i];
			// OR
			sum += numbers[i];
			System.out.println(sum);
			//System.out.println(numbers[i]);
		}
		System.out.println(sum);
		{
			for (int i: numbers) {
				System.out.println(i);
		}

	}

}}
