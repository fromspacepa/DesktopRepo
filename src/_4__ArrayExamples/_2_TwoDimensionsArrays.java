package _4__ArrayExamples;

public class _2_TwoDimensionsArrays {

	public static void main(String[] args) {


		System.out.println("Print-out of data stored in 2-Dimension Arrays of Integer:");
		int[][] nums = new int [7][4];
		nums [0][0] = 1; 
		nums [0][1] = 2; 
		nums [0][2] = 3; 
		nums [0][3] = 4; 
		nums [1][0] = 5; 
		nums [1][1] = 6; 
		nums [1][2] = 7; 
		nums [1][3] = 8; 
		nums [2][0] = 9; 
		nums [2][1] = 10; 
		nums [2][2] = 11; 
		nums [2][3] = 12; 
		nums [3][0] = 13; 
		nums [3][1] = 14; 
		nums [3][2] = 15; 
		nums [3][3] = 16; 
		nums [4][0] = 17; 
		nums [4][1] = 18; 
		nums [4][2] = 19; 
		nums [4][3] = 20; 
		nums [5][0] = 21; 
		nums [5][1] = 22; 
		nums [5][2] = 23; 
		nums [5][3] = 24; 
		nums [6][0] = 25; 
		nums [6][1] = 26; 
		nums [6][2] = 27; 
		nums [6][3] = 28; 
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
			System.out.print(nums[i][j] + "\t");
		}
			System.out.println();

		}		

	//Example of "Nested for loop" assigning values to the 2-Dimension Arrays of Integer.
	System.out.println("\nPrint-out of the data stored in 2-Dimension Arrays of Integer, \nusing 'for loop':");
		
		int value = 0;
	for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j <nums[i].length; j++) {
			nums[i][j] = value++;
			System.out.print(value + "\t");
		}
		System.out.println(" ");
	}

}}
