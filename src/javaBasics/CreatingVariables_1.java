
    // This part is related to Package and the name of package. The name of package is: javaBasics.
    //Note: When creating package in Java, the name of package always starts with lower case and camleCase.
package javaBasics;

    //This part is related to class and the name of class. The name of class is: CreatingVariables.
    //Note: When creating class in Java, the name of class always starts with upper case and then CamleCase.
public class CreatingVariables_1 {

	//This part is related to method which is called main method; it is used to run our code(s) in Java.
	public static void main(String[] args) {

	//Following is the basics sample of creating Variable:
	int x = 20;//<==This is the syntax is called Initialization process.
	// Here "int" is a one of Primitives Data Type; "x" is Variable, "=" is Assignment Operator, and "20" is the Value.
	// we basically created Variable and assigned the value "20" to it. 
	//This portion "int x" of the syntax is called Declaration, This portion "=" of the syntax is called Assignment Operator;
	//This portion "20" of the syntax is called Initialization.
	
	int y = 15;//<==This is called Assignment process.
		
	//Following is the sample of printing our created variables and it's assigned values:
	System.out.println("The value of X is:"+ x + " and the value of Y is:"+ y);
	
//Following here are the types of Primitive data types:
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
//  char         1-bytes             0 to 65,536
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

	
	
	}	
}
