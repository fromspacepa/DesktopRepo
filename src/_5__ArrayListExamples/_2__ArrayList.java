package _5__ArrayListExamples;

import java.util.ArrayList;

public class _2__ArrayList {
	public static void main(String[] args) {
		
	
		
	/*
	 * >>>>> ArrayList: (ArrayList is like Arrays) 
	 * 
	 * >>> Difference between ArrayList and Array:
	 * __ Arrays are fixed in size, but ArrayList is not fixed in size, ArrayList is dynamic in size.
	 *    means, that ArrayList is open in size.
	 * __ In Arrays you can use Primitive Data Types, but in ArrayList you cannot use Primitive Data Types.
	 * __ Another difference is that in Arrays you can have empty indexes, but in ArrayList you cannot have
	 *    empty indexes.
	 * __ In Arrays you have to define the size, but in ArrayList you don't have to define the size.
	 * 
	 * >>> As mentioned above ArrayList are not limited to the size, you can have many indexes size 
	 * as you want; you can start with a fixed data type, but then you don't define the size to it.
	 * You can define the initial size to wards the ArrayList to begin with, but then you don't define
	 * the actual ending size of the ArrayList; you can basically keep adding staff (size) to it, and
	 * then ArrayList will manage the size.
	 * 
	 * >>> ArrayList Syntax (This is called a Single Dimension ArrayList of a String):                                                                                
	 */
	ArrayList<String> nameList = new ArrayList<String>();//Note: When you write this syntax, you'll see the ArrayList underlined 
	                                                  //red-line, in this case you'll need to hover your mouse on ArrayList 
	                                                  //and then import the "Import 'ArrayList'(Java.util)" from the list.
	                                                  //After importing the ArrayList the ArrayList will work, other than that
	                                                  //it will not work at all.
	/*
	 * Understanding of all components of the above ArrayList Syntax:
	 * __"ArrayList<String>" is the Data-Type (String Data type).
	 * __"nameList" is the Identifier/Name of ArrayList.
	 * __"=" is the Assignment Operator.
	 * __"new" is the Keyword which creates new Object.
	 * __"new ArrayList<String>();" all together is the Initialization part, The Initialization part is going to reserve the memory/space in database.
	 * __"ArrayList<String> nameList" all together is the Declaration part, The Declaration part is only going to reserve the Identifier/Name.
	 *
	 * >>> ArrayList is collection or class that is developed, as you can develop a class too:
	 * When you get to the collection frame work in Java, you cannot use Primitive Data Types in ArrayList.
	 * (List is one portion of collections and ArrayList is an instance of list)
	 * When you get to the collection, you cannot use Primitives in any of them. The main reason for that
	 * is, the way they are implemented, they are using a concept called Generics; in Generics you can only
	 * pass a Reference data types, you cannot pass Primitive data types.
	 * 
	 * >>>>> WRAPPER CLASS:
	 * __ As we mentioned that we cannot work with Primitives in ArrayList. Well, that is going to give us some challenges,
	 * because we use Primitives at all times. 
	 * __ Question: what if we need a list of numbers or what if we need a list of double value,
	 * char value, booleans or what we would do if we need a list of any Primitives Data types?
	 * __ Answer: For that Java has these Classes called "Wrapper Classes" for all Primitives:
	 * (byte, short, int, long,  float, double, boolean, and char) Java has Wrapper Classes.
	 * __ The term Wrapper is like wrapping a gift box or wrapping something in a paper.
	 * __ Basically, the Wrapper Classe(s) is wrapping Primitive Data Types into a Class structure,
	 * the Wrapper Class will store the Primitives Data type(s) in a Class in an instance of a Class.
	 * 
	 * >>> NOTE: Alone with Primitive Data types you don't get any functions, but with a Class you get a bunch of 
	 * functions that you can use them to do something, so you can perform functions on these Primitives
	 * once wrapped into a Class. And the naming of all these Classes are pretty simple, you know that
	 * all Primitives are keywords and all of them starts with lower-case letter; So while wrapping 
	 * all Primitives into Wrapper Class, the naming of the Primitives will be starting with Upper-case letter 
     *
	 * >>>>> For more about "WRAPPER CLASSES" Please visit the Wrapper Class named as: 
	 * "_1__WrapperClasses" in the same package: arrayListExamples.
	 * 
	 * 
	 * >>>>> ArrayList & Arrays:
	 * __ As we mentioned above ^: "The difference between ArrayList & Arrays is that Arrays is fixed in size, but
	 * ArrayList is not fixed in size, ArrayList is Dynamic in size, you don't have to define a size for ArrayList.
	 * And the way that you are referring to indexes in ArrayList is different than Arrays. 
	 * We don't use the brackets, we are going to call methods/functions. 
	 * For example if you want:
	 * --> Method: "add()" is used to add data into the ArrayList.
	 * --> Method: "size()" is used to get the length/size of indexes in the ArrayList.
	 * --> Method: "get()" is used to get the value/data of an index from the ArrayList.
	 * 
	 * >>> Example of Adding data into the ArrayList:
	 */
	ArrayList<Integer> numbers = new ArrayList<Integer>();//This is to initially declare and initialize the ArrayList.
		numbers.add(10);//This is how to add data into the index zero '0' of an ArrayList.
		numbers.add(20);//This is how to add data into the index zero '1' of an ArrayList.
		numbers.add(30);//This is how to add data into the index zero '2' of an ArrayList.
		//This is how to get the size(length) of indexes in the ArrayList. This will print: 3
		System.out.println(numbers.size());
		//This is how to get the data/value of a specific indexes from ArrayList. This will print: 10 and 30
		System.out.println(numbers.get(0));//Index zero '0'
		System.out.println(numbers.get(2));//Index two '2'
		//This is how to loop through entire ArrayList with the help of "for loop"
		System.out.println("---Looping through ArrayList:");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		

	

	
	

	 
} 
}
