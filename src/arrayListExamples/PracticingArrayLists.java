package arrayListExamples;

import java.util.ArrayList;

public class PracticingArrayLists {

	public static void main(String[] args) {


		/*
		 * Assignment to be practiced:
		 * 
		 * --> Create an ArrayList that takes String values.
		 * --> Add these values: DC, VA, CA, TX.
		 * --> Create a loop that goes through from 1st to last index.
		 * --> Create a loop that goes through from last to 1st index.
		 * --> Get through the list with "for-each" loop.
		 * --> Print the list without a loop by printing the names of the list.
		 */
		
		ArrayList<String> states = new ArrayList<String>();
		states.add("DC");
		states.add("VA");
		states.add("CA");
		states.add("TX");
			for(int i = 0; i < states.size(); i++) {//This "for-loop" will print-out all the indexes from start to end.
				System.out.println(states.get(i));
			}
			System.out.println("---------");
	
			for(int i = states.size()-1; i >= 0; i--) {//This "for-loop" will print-out the indexes from end to start.
				System.out.println(states.get(i));
			}
			System.out.println("---------");
			for (String i: states) {//This "for-each loop" will print-out the entire 
				System.out.println(i);
			}
			System.out.println("---------");
			System.out.println(states);//This is to print-out the names of the states without a loop.
			
			}
		


	}

