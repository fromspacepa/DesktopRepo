package arrayExamples;

public class PracticingArrays {

	public static void main(String[] args) {
		
		/*
		 * int[] nums = new int [3]; nums[0] = 10; nums[1] = 20; nums[2] = 30;
		 * System.out.println(nums.length);//This is going to print-out the number of
		 * Elements in this single dimension Array. for (int values: nums) {
		 * System.out.println(values);//This is going to print-out the values of all
		 * Elements in this single dimension Array. }
		 * System.out.println(nums[1]);//This is going to print-out the value of Element number 1 in this single dimension Array.
		 */
		//}
	//{
		System.out.println("Printing a square data table of 2-Dimension Arrays of Integer:");
		int [][] data = new int [7][4];
		data [0][0] = 1;
		data [0][1] = 2;
		data [0][2] = 3;
		data [0][3] = 4;
		data [1][0] = 5;
		data [1][1] = 6;
		data [1][2] = 7;
		data [1][3] = 8;
		data [2][0] = 9;
		data [2][1] = 10;
		data [2][2] = 11;
		data [2][3] = 12;
		data [3][0] = 13;
		data [3][1] = 14;
		data [3][2] = 15;
		data [3][3] = 16;
		data [4][0] = 17;
		data [4][1] = 18;
		data [4][2] = 19;
		data [4][3] = 20;
		data [5][0] = 21;
		data [5][1] = 22;
		data [5][2] = 23;
		data [5][3] = 24;
		data [6][0] = 25;
		data [6][1] = 26;
		data [6][2] = 27;
		data [6][3] = 28;
		
		for (int row = 0; row < data.length; row++){//This is to go through (print-out) the outer loop, printing the rows.
			for (int col = 0; col < data[row].length; col++) {//This is to go through (print-out) the inner loop, printing all cells.
				System.out.print(data[row][col]+ "\t");
			}
			System.out.println();//This code will make every iteration go to the next line.
			
		}System.out.println(data[6][2]);//This is to print-out the value of row 7-seven and col 3-three
		
		
		
		
		
		
		
		
		{}		
}
		
} 

	


 