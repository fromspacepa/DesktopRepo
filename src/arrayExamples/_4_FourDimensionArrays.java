package arrayExamples;

public class _4_FourDimensionArrays {

	public static void main(String[] args) {

		int myNum = 8;
		int[][][][] values = new int[6][2][2][2];

		for (int outLoop1 = 0; outLoop1 < values.length; outLoop1++) {
			for (int outLoop2 = 0; outLoop2 < values[outLoop1].length; outLoop2++) {
				for (int outLoop3 = 0; outLoop3 < values[outLoop1].length; outLoop3++) {
					for (int innerLoop = 0; innerLoop < values[outLoop1].length; innerLoop++) {
						if (myNum == 50) {
							break;
						}
						values[outLoop1][outLoop2][outLoop3][innerLoop] = myNum++;
						System.out.print(myNum + "\t");
					}
					System.out.println();
				}

			}

		}


	}

}
