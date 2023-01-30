package arrayExamples;

public class _1_SingleDimensionArray {

	public static void main(String[] args) {


		//Examples of Collections in Arrays:
		
		/*
		 * NOTE:
		 * 
		 * --> The idea of Array is the data type that you want to store in Array(s)...
		 * First you have to define the data type, whatever data type that you want to store in Array(s).
		 * 
		 * --> Arrays are made of contiguous block of memory.
		 * When you think of Arrays, following are the 3 three things that you must focus on:
		 * 1) Fixed in size:
		 * Arrays are fixed in size. You have to define what is the size of Array(s) that you want to create or work with.
		 * 2) Define data type:
		 * You must define the data type that is going to go inside/into the Array(s) that you want to create or work with.
		 * 3) Dimensions in Array(s):
		 * There are Dimensions to Array(s); Arrays could have Single-Dimension, They could have Two-Dimensions, 
		 * Three-Dimensions, Four-Dimensions, and can go on......
		 * 
		 * --> Basically, the idea of Array(s) is that to define the data type that you want to store in the Array(s). 
		 * And that type could be: integer, String, double, char or any data type.
		 * 
		 * --> In general working with Array(s), the biggest thing that is going to help you is understanding each component
		 * of an Array, and the Variable of Array(s) that you declare and initialize. For instance, you want to create a single
		 * dimension Array of integer, then you create the following Syntax or Statement and you should understand every 
		 * component of it:
		 * --> int[] nums = new int [5]; //This is the single dimension Array of integer;
		 * "int[]" is the data type of single dimension Array of integer.
		 * "nums" is the Variable/Identifier.
		 * "int[] nums" (both data type and identifier) is the declaration.
		 * "=" is the assignment operator.
		 * "new" is the keyword and this creates new object.
		 * "int [5];" is the initialization and it means that inside a single dimension Array of integer is assigned with 5 elements.
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
		

		//This is how to print the length of elements in a single dimension Array:
		System.out.println("--------Single dimension--------\n--integer Arrays with 5 elements--");//the printout is going to be 5.
		System.out.println("Numbers of Elements:\t\t" + data.length);

		//This is how to print the value of index 0:
		System.out.println("Value of index '0':\t\t" + data[0]);
		System.out.println("Value of index '1':\t\t" + data[1]);
		System.out.println("Value of index '2':\t\t" + data[2]);
		System.out.println("Value of index '3':\t\t" + data[3]);
		System.out.println("Value of index '4':\t\t" + data[4]);
		System.out.println("\n---Value of indexes from 0 to 4 by order:");
		//This is how to printout the value of all indexes:
		for (int i = 0; i < 5; i++ ) {
			System.out.println(data[i]);
		}
		System.out.println("\n---Examples of String Arrays---");
		//This is how to creat a single dimension Array of String:
		String[] names = new String [5];
		names[0] = "Ahmad";
		names[1] = "Jamal";
		names[2] = "Kabir";
		names[3] = "Wali";
		names[4] = "Sardar";
		System.out.println("Number of Names and Elements: " + names.length);
		for (int i = 0; i <= 4; i++) {
			System.out.println("List of all Names: " + names[i]);
		}
		System.out.println("Printing the name of index 0: " + names[0]);
		
		
		

		
			}
		


		
		
		
		


		

	

}
