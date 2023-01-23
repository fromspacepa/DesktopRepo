package javaBasics;

public class Arrays {

	public static void main(String[] args) {


		//Examples of Arrays:
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
	    System.out.println("-------------------------");
		//This is how to print the value of index 0:
		System.out.println(data[0]);//the printout is going to be 20.
		System.out.println("-------------------------");
		for (int i = 0; i < 5; i++ ) {
			System.out.println(data[i]);
		}


		

	}

}
