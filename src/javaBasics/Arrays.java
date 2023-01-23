package javaBasics;

public class Arrays {

	public static void main(String[] args) {


		//Examples of Collections in Arrays:
		
		/*
		 * NOTE:
		 * Arrays are made of contiguous block of memory.
		 * When you think of Arrays, following are the 3 three things that you must focus on:
		 * 1) Fixed in size:
		 * Arrays are fixed in size. You have to define what is the size of Array(s) that you want to create or work with.
		 * 2) Define data type:
		 * You must define the data type that is going to go inside/into the Array(s) that you want to create or work with.
		 * 3) Dimensions in Array(s):
		 * There are Dimensions to Array(s); Arrays could have Single-Dimension, They could have Two-Dimensions, 
		 * Three-Dimensions, Four-Dimensions, and can go on......
		 * 
		 * 
		 * 
		 */
		int [] y = {1,2,3,4,5};//This is an example of Hard-Coding. It is not a preferred way to use in coding.
	
		int [] data = new int [5];//This is to create the Arrays that has the length of 5 index.
		data [0] = 20;
		data [1] = 25;
		data [2] = 30;
		data [3] = 10;
		data [4] = 5;
		
		System.out.println("-------------------------");
		//This is how to print the length of index:
		System.out.println(data.length);//the printout is going to be 5.

		//This is how to print the value of index 0:
		System.out.println(data[0]);//the printout is going to be 20.

		for (int i = 0; i < 5; i++ ) {
			System.out.println(data[i]);

		}
		
		int [] data1 = new int [30];
		data1 [0] = 10;
		data1 [1] = 12;
		data1 [2] = 23;
		data1 [3] = 34;
		data1 [4] = 46;
		data1 [5] = 100;
		data1 [6] = 145;
		data1 [7] = 12;
		data1 [8] = 134;
		data1 [9] = 13;
		data1 [10] = 134;
		data1 [11] = 133;
		data1 [12] = 150;
		data1 [13] = 25;
		data1 [14] = 40;
		data1 [15] = 60;
		data1 [16] = 70;
		data1 [17] = 80;
		data1 [18] = 90;
		data1 [19] = 100;
		data1 [20] = 45;
		data1 [21] = 56;
		data1 [22] = 67;
		data1 [23] = 34;
		data1 [24] = 6;
		data1 [25] = 56;
		data1 [26] = 56;
		data1 [27] = 56;
		data1 [28] = 15;
		data1 [29] = 56;
		System.out.println("-------------------------");
		System.out.println(data1.length);
		System.out.println("-------------------------");
		for (int b = 0; b < 30; b++) {
		System.out.println("The Value of Indexes:\t" + data1[b]);//this will printout the value of all indexes.

		}
		
		
		


		

	}

}
