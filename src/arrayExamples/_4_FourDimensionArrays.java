package arrayExamples;

public class _4_FourDimensionArrays {

	public static void main(String[] args) {

		/*
		 * Following is the example of 4-Dimension Arrays of Integer: In this example by
		 * using the 'nested for loop', the value is assigned to variable. In this
		 * example the task is to print-out the value from 9 to 50.
		 */
		System.out.println(
				"Following is the example of executing numbers from 9 - 50\nin 4-Dimension Arrays of Integer:");
		int myNum = 0;
		int[][][][] values = new int[6][2][2][2];

		for (int out1 = 0; out1 < 6; out1++) {
			for (int out2 = 0; out2 < values[out1].length; out2++) {
				for (int out3 = 0; out3 < values[out1][out2].length; out3++) {
					for (int innerLoop = 0; innerLoop < values[out1][out2][out3].length; innerLoop++) {

						
						values[out1][out2][out3][innerLoop] = myNum++;
						System.out.print(myNum + "\t");
					}
					System.out.println();
				}
			}
			{
			}
		}
		System.out.println("\nThe following execution is the same as above,\nbut with different syntax:");
		int myData = 8;
		int[][][][] nums = new int[4][4][4][4];

		for (int out1A = 0; out1A < nums.length; out1A++) {
			for (int out2A = 0; out2A < nums[out1A].length; out2A++) {
				for (int out3A = 0; out3A < nums[out1A][out2A].length; out3A++) {
					for (int innerLoopA = 0; innerLoopA < nums[out1A][out2A][out3A].length; innerLoopA++) {
						if (myData == 50) {
							break;
						}
						nums[out1A][out2A][out3A][innerLoopA] = myData++;
						System.out.print(myData + "\t");
					}
					System.out.println();

				}
			
	}

			
		}}}