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
			for(int i = 0; i < states.size(); i++) {
				System.out.println(states.get(i));
			}
			System.out.println("---------");
	
			for(int j = states.size()-1; j >= 0; j--) {
				System.out.println(states.get(j));
			}
			}
		


	}

