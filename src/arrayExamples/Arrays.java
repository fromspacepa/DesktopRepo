package arrayExamples;

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
		 * Note:
		 * We can use Arrays to store multiple values in a single variable, instead of declaring variable multiple times.
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
		//This is how to print the length of elements in a single dimension Array:
		System.out.println("Single dimension Array with \nelements of:\t\t\t" + data.length);//the printout is going to be 5.

		//This is how to print the value of index 0:
		System.out.println("Value of index '0':\t\t" + data[0]);
		//This is how to printout the value of all indexes:
		for (int i = 0; i < 5; i++ ) {
			System.out.println("Value of indexes from 0 to 4:\t" + data[i]);
		}
		
		//This is how to creat a single dimension Array of String:
		String[] names = new String [5];
		names[0] = "Ahmad";
		names[1] = "Jamal";
		names[2] = "Kabir";
		names[3] = "Wali";
		names[4] = "Sardar";
		System.out.println("Number of Names: " + names.length);
		for (int i = 0; i <= 4; i++) {
			System.out.println("List of all Names: " + names[i]);
		}
		System.out.println("Printing the name of index 0: " + names[0]);
		
		
		

		
			}
		


		
		
		
		


		

	

}
