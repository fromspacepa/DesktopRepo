 
    //Following is the package and name of the package is: "javaBasics".

package javaBasics;

    //Following is the Class and name of the class is: "CreatingVariables_1".
    //Note: When creating class in Java/Eclipse, the class name always starts with upper case and then CamleCase if it's a combination of two or more than two names.
public class CreatingVariables_1 {

	//Following is the method, which is called main method; To run our code(s) in Java/Eclipse, we need main method.
	public static void main(String args[]) {

	//Following is the method, which is called main method; To run our code(s) in Java/Eclipse we need main method.


	//Following is the basics sample of creating Variable:
	//Note: We have two different types of Variables:
	//Primitive Data Types and Reference Data Types
	//We have 8-Primitive Data Types which are listed and explained below and Reference Data Types would be any object that we create
	//Lets say that we create String, String is a class, so every instance of String is Reference Data Type
	//Lets say we define a class of Student and then we create an object of it, so that would be a Reference Data Type.
	//In conclusion: We have 8 Primitive Data Types and we have thousands & thousands of Reference Data Types.
	
	int x = 20;//<==This is the syntax, it is called Initialization process.
	//Here "int" is a one of Primitives Data Type; "x" is Variable, "=" is Assignment Operator, and "20" is the Value.
	//we basically created Variable and assigned the value "20" to it. 
	//The portion "int x" of the syntax is called Declaration, The portion "=" of the syntax is called Assignment Operator;
	//The portion "20" of the syntax is called Initialization.
	x = 30; //<==This syntax is called the process of assignment.
	//Note: After the first time of Variable declaration and initialization, and then changing the Variable Value here is called the process of Assignment.
	
	
	int y = 15;//<==This syntax is also the process of Initialization.
		
	//Following is the sample of printing our created variables and it's assigned values:
	System.out.println("The value of X is:"+ x + " and the value of Y is:"+ y);
	
//Below here we are talking about the two different types of Data Types: 
//Note: We have Two types of Data Type; Which are Primitive and Reference Data Types.
//We have 8 Primitive Data Types and Thousands of Non-Primitive/Reference Data Types; Basically, you can create Reference Data Types.
//All Primitive Data Types starts with lower case and all Reference/Non-Primitive Data Types starts with UpperCase Letter.
//Following here are the 8-Primitive data types which are mentioned below with all details:

//  Type ------- SizeInBytes ------- Range
//  byte         1-byte              -128 to 127
	byte b1 = 127;
//  short        2-bytes             -32,768 to 32,767
	short s1 = 15;
//  int          4-bytes             -2,147,483,648 to 2,147,483,647
	int i = 4568;
//  long         8-bytes             -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	long l1 = 1354;
//  float        4-bytes             approximately 3.40282347E+38F (6-7 significant decimal digits) Java implements IEEE 754 standard
	float f = 120.21f;
//  double       8-bytes             approximately 1.797693134862315 70E +308 (15 significant decimal digits)
	double d = 12.12;
//  char         1-byte              0 to 65,536
	char c = 'a';
//  boolean      not precisely       true or false
//               defined *
	boolean b = true;
	boolean b2 = false;
	boolean b3 = b1 > i;
	b2 = b;
	System.out.println(f);
	System.out.println(b2);
	System.out.println(b3);
	
//Here we are explaining the Reference OR Non-Primitive Data Types:
//When we get to the Reference Data Types, we have couple of ways to Initialize the Reference Data Types.
//One of the most Famous and popular class that we will use a lot, is a String. Every instance of String Class will be an object
//Or a Reference Data Type. 
//Following is the example of how we create a String:
	String text = "texting is fun";//Here is one way of creating a String and it's a special way that's only available to a String Class
//You'll not be able to do the same way with other Reference Data Types.
//Note: The text inside two double code is called Literal Value.
//The other way that you can create a String is going to be as follows:
	String text1 = new String ("texting is fun");//Here in this syntax when you say "new String", this structure is basically used to 
//initialized any Reference Data Type and this applicable to all of the Reference Data Types.

//Note: In general when you want to create a Reference Data Type, you need to make sure that your Data Type
//is the name of the class that you are trying to create an object of. 
//And then for a String you have the option to initialize the Variable with a Literal Values and you also have the option to call the 
//Constructor of the Class which is the second way, and then you can create the object of that.


	System.out.println(text);
	System.out.println(text1);

	
	
	
	
	}	
	
	

}

