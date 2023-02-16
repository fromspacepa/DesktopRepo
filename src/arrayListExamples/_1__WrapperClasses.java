package arrayListExamples;

public class _1__WrapperClasses {

	public static void main(String[] args) {
		
		    /* >>>>> WRAPPER CLASS:
			 * __ As we mentioned that we cannot work with Primitives in ArrayList. Well, that is going to give us some challenges,
			 * because we use Primitives at all times. 
			 * __ Question: what if we need a list of numbers or what if we need a list of double value,
			 * char value, booleans or what we would do if we need a list of any Primitives Data types?
			 * __ Answer: For that Java has these Classes called "Wrapper Classes" for all Primitives:
			 * (byte, short, int, long,  float, double, boolean, and char) Java has Wrapper Class, means
			 * that for each Primitive Data type Java has a Wrapper Class.
			 * __ The term Wrapper is like wrapping a gift box or wrapping something in a paper.
			 * __ Basically, the Wrapper classes is wrapping Primitive Data Types into a Class structure,
			 * the Wrapper Class will store the Primitives Data type(s) in a Class in an instance of a Class.
			 * 
			 * >>> NOTE: Alone with Primitive Data types you don't get any functions, but with a Class you get a bunch of 
			 * functions that you can use them to do something, so you can perform functions on these Primitives
			 * once wrapped into a Class. And the naming of all these Classes are pretty simple, you know that
			 * all Primitives are keywords and all of them starts with lower-case letter; So while wrapping 
			 * all Primitives into Wrapper Class, the naming of the Primitives will be starting with Upper-case letter
			 * such as follows:
			 *Primitive Data Types: -------->>> After wrapped into a Wrapper Class:
			   byte ---------------------->>>>> Byte                              
			   short --------------------->>>>> Short                             
			   int ----------------------->>>>> Integer                           
			   long ---------------------->>>>> Long                              
			   float --------------------->>>>> Float                             
			   double -------------------->>>>> Double                            
			   boolean ------------------->>>>> Boolean                           
			   char ---------------------->>>>> Charater                  
			  *
			  * __ Question: What are the members of a Class?
			  * __ Answer: Members of a Class are Attributes/Variables and Methods which are functions.
			  *
			  * >>> In general when you are calling a function, it is like using a function, so when you are calling a function,
			  * it calls on that Variable, such as follows: 
			  */
		      int value = 20;//Here the "int" is just a Primitive Data type.
			  Integer x = 20;//Here the "Integer" is a Class, the "x" is Variable, and the "20" is Value.
			                 //Basically it is the Syntax of Wrapper Class of Primitive Data type "int" after wrapped into Wrapper Class
			                 //and "x" is the variable/Identifier, and the Value of "20" is assigned to the Variable "x".
			                 //So, when you call on a Variable "x" such as follows:
			 //System.out.println(x.);//When you put a dot "." after Variable "x" it will give you so many functions, each function will be
			                        //able to do something. Basically, the Wrapper Classes comes with these functions/methods to be used
			                        //for different purposes. Try it yourself by removing the comment line "forward slashes" before print-line above.
			 //Here following are some more examples: Concatenation 
			 Integer y = 30;
			 String z = "5";
			 System.out.println("This is Addition of Integers with a Concatenation of a String:");
			 System.out.println(+ x + y + z);//This is Addition of Integers with a Concatenation of a String. 
			 System.out.println("This is an Addition of Integers and a String after getting the value of a String:");
			 System.out.println(+ x + y + Integer.valueOf(z));//This is an Addition of Integers and a String after getting the value of a String.
			 System.out.println("Per the prcedence of Java, here is the print-out of Concatenation of a String 'z' and Integers 'x' & 'y':");
			 System.out.println("z="+z +", x="+ x +", & y="+ y);//This is Concatenation of a String and Integers.
			 System.out.println(z + x + y);
			//This is Concatenation of a String with the Addition of Integers in the Parenthesis
			 System.out.println(z + (x + y));//This is going to print: 550. "5" is the String Value and "50" is the Addition of integers inside Parenthesis.
		

	}

}
