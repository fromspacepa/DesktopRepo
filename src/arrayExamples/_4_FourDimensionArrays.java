package arrayExamples;

public class _4_FourDimensionArrays {

	public static void main(String[] args) {


		int[][][][] nums = new int [2][3][2][2];
		
		nums [0][0][0][0] = 5;
		nums [0][0][0][1] = 10;
		nums [0][0][1][0] = 15;
		nums [0][0][1][1] = 20;
		nums [0][1][0][0] = 25;
		nums [0][1][0][1] = 30;
		nums [0][1][1][0] = 35;
		nums [0][1][1][1] = 40;
		nums [0][2][0][0] = 45;
		nums [0][2][0][1] = 50;
		nums [0][2][1][0] = 55;
		nums [0][2][1][1] = 60;
		nums [1][0][0][0] = 65;
		nums [1][0][0][1] = 70;
		nums [1][0][1][0] = 75;
		nums [1][0][1][1] = 80;
		nums [1][1][0][0] = 85;
		nums [1][1][0][1] = 90;
		nums [1][1][1][0] = 95;
		nums [1][1][1][1] = 100;
		nums [1][2][0][0] = 105;
		nums [1][2][0][1] = 110;
		nums [1][2][1][0] = 115;
		nums [1][2][1][1] = 120;

				System.out.println(nums[1][2][1][1]);//This will print out the result of 2nd Row, 3rd Column, 2nd Column, and then 2nd Column.
				
				for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i].length);
					
				}
				


		

	}

}
