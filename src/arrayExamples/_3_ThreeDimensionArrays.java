package arrayExamples;

public class _3_ThreeDimensionArrays {

	public static void main(String[] args) {

		//Below is the example of 3-Three Dimension Arrays of Integer.
		//The idea of Array is the data type that you want to store in Array(s).
		//More than One Dimension Array, such as Two, Three, Four Dimension Arrays are like 
		//Arrays inside Arrays.
		
		int[][][] myNumbers = new int [2][5][2];//Here the 3-Three Dimension Arrays of Integer 
		                                        //is declared and initialized.
		//Following here the value is assigned to all the Arrays:
	    myNumbers [0][0][0] = 5;
	    myNumbers [0][0][1] = 10;
	    myNumbers [0][1][0] = 15;
	    myNumbers [0][1][1] = 20;
	    myNumbers [0][2][0] = 25;
	    myNumbers [0][2][1] = 30;
	    myNumbers [0][3][0] = 35;
	    myNumbers [0][3][1] = 40;
	    myNumbers [0][4][0] = 45;
	    myNumbers [0][4][1] = 50;
	    myNumbers [1][0][0] = 55;
	    myNumbers [1][0][1] = 60;
	    myNumbers [1][1][0] = 65;
	    myNumbers [1][1][1] = 70;
	    myNumbers [1][2][0] = 75;
	    myNumbers [1][2][1] = 80;
	    myNumbers [1][3][0] = 85;
	    myNumbers [1][3][1] = 90;
	    myNumbers [1][4][0] = 95;
	    myNumbers [1][4][1] = 100;
	  //myNumbers [2][0][0] = 105;//If you remove the comment line from this could, you will not be able to print out 
	                              //or the code will not be executed, because this line of code is out of bound for 
	                              //length 2 at 3-Dimension Array of Integer which is declared and initialized above.
	    
	      System.out.println(myNumbers[1][4][0]);

	}

}
