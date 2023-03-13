package _1__JavaBasicsExamples;

public class _5c_MixedTypeArithmeticExpressionsAndTypeCasting {

	public static void main(String[] args) {
		
		/** >>>>> Mixed-Type Arithmetic Expressions: 
		 *    
		 * >>>Mixed-Type: (1-OF-3)
		 * (Arithmetic Execution An Operation Between Double and Integer Values) 
		 * ___Mixed-Type is when you are trying to do an operation between double and integer values.
		 * While doing Mixed-Type Arithmetic Execution in your code such as "int <--> double" the
		 * outcome/result of the execution will be double. 
		 * Note: double is more accurate then integer value.
		 * Examples are provided below: */
		
		double x = 6.7;//By now you should know this is the process of declaration and initialization
		int y = 3;//By now you should know this is also the process of declaration and initialization
		
		double sum = x + y;//With the operation of Mixed-Type addition, this will give the result of 9.7
		System.out.println("The outcome for Mixed-Type execution of 'doubl <--> int':\n.......... " + sum);
		double multiplication = x * y;//With the execution/operation of Mixed-Type multiplication,
		                              //this will give you the result of 20.1.
		System.out.println("The outcome for Mixed-Type execution of 'double <--> int':\n.......... " + multiplication);
		double division = x / y;//With the execution of Mixed-Type division this will give the result of 2.2333333333333334
		System.out.println("The outcome for Mixed-Type execution of 'double <--> int':\n.......... " + division);
		
		/** >>>>> Mixed-Type Arithmetic Expressions CONTINUES....:
		 * 
		 * >>>MIXED-TYPE WITH PROMOTING:  (2-OF-3)
		 * ___While doing Mixed-Type Arithmetic Execution such as integer <--> double, here this term is called "Promotion"
		 * because the value of integer is promoting to double; means that the integer value will promote to double value (with decimals).
		 * Examples are provided below: */
				
		byte byteValue = 127;
		short shortValue = 30000;
		int integerValue = 100000;
		float floatValue = 2000.12f;
		double doubleValue = 1000.24;
		long longValue = 2000002325234444442L;
		char charCharacter = 'B';//The Value of Character "B" is 66. (Referenced from ASCII Table)
		
		System.out.println("\nFollowing are the results of Mixed-Type Promotion Operations:\n");
		double promotingToDouble = byteValue + floatValue;//This is when you promoting byte <--> float to double: (2127.1201171875)
		System.out.println("Promoting of byte <--> float resulting to double: \n\t" + promotingToDouble);
		float promotingToFloat = byteValue + longValue;//This is when you promoting byte <--> long to float: (2.00000231E18)
		System.out.println("Promoting of byte <--> long resulting to float: \n\t" + promotingToFloat);
		long promotingToLong = byteValue + integerValue;//This is when you promoting byte <--> integer to long: (100127)
		System.out.println("Promoting of byte <--> int resuling to long: \n\t" + promotingToLong);
		int promotingToInteger = byteValue + shortValue + charCharacter;//This is when you promoting byte <--> short/char to integer: (30193)
		System.out.println("Promoting of byte <--> short plus char resulting to integer: \n\t" + promotingToInteger);
		
		/** >>>>> Mixed-Type Arithmetic Expressions CONTINUES....:
		 * 
		 * >>>TYPE CASTING (3-OF-3)
		 * ___Implicit Casting
		 * ___Explicit Casting
		 * 
		 * ___Casting means converting a data type to another data type; 
		 * For example you can convert an integer to double and double to integer.
		 * ___Implicit: --Implicit casting happens automatically when converting from a narrower rage data type 
		 * to a wider range data type; Such as: byte -> short -> char -> int -> long -> float -> double 
		 * For instance: Converting int to a double/float/long OR converting float to a double.
		 * In the above case the Implicit Casting can happen automatically because the double/float/long 
		 * has wider range than integer OR we can say that Implicit Casting can happen 
		 * when we convert a narrower data type to another wider range data type without losing data .
		 * ___Explicit: --Explicit casting does not happen automatically. It should be done by the programmer
		 * when converting from a wider range data type to a narrower data type; 
		 * Such as: double -> float -> long -> int -> char -> short -> byte
		 * For instance: Converting a double/float/long to int then Implicit casting can not happen because you will get exception/error. */
		
		//Implicit Casting Examples:
		System.out.println("Examples of Implicit casting 'A narrow range data type to a wider range data type:\n");
		
		byte myByte = 127;
		short myShort = 70;
		char myChar = 66;
		int myInt = 100;
		long myLong = 800L;
		float myFloat = 700.F;
		double myDouble = 200.22;
		
		byte num1 = myByte;//Assigning byte data type to byte Implicitly.
		System.out.println("Assigning byte to byte:\n___"+ num1);
		short num2 = myByte;//Converting byte data type to short Implicitly.
		System.out.println("Converting byte to short:\n___"+ num2);
		char num4 = myChar;//Assigning char data type to char Implicitly.
		System.out.println("Assigning char to char:\n___"+ num4);
		int num6 = myChar, num7 = myShort, num8 = myByte;//Converting char/short/byte to integer Implicitly
		System.out.println("Converting char/short/byte to integer:\n___"+ num6 +"_"+ num7 +"_"+ num8);
		long num11 = myInt, num12 = myChar, num13 = myShort, num14 = myByte;//Converting integer/char/short/byte to long Implicitly.
		System.out.println("Converting int/char/short/byte to long:\n___"+ num11 +"_"+ num12 +"_"+ num13 +"_"+ num14);
		float num15 = myLong, num17 = myInt, num18 = myChar, num19 = myShort, num20 = myByte;//Converting long/integer/char/short/byte to float implicitly.
        System.out.println("Converting long/int/char/short/byte to float:\n___"+ num15 +"_"+ num17 +"_"+ num18 +"_"+ num19 +"_"+ num20);	
		double num21 = myFloat, num22 = myLong, num23 = myInt, num24 = myChar, num25 = myShort, num26 = myByte;//Converting float/long/
		System.out.println("Converting float/long/int/char/short/byte to double:\n___"+ num21 +"_"+ num22 +"_"+ num23 +"_"+ num24 +"_"+ num25 +"_"+ num26);
		//integer/char/short/byte to double Implicitly.
		
		//Explicit Casting Examples:
		System.out.println("\n\nExamples of Explicitly Casting 'A wider range data type to a narrow range data type:\n");
		byte numF = (byte) myDouble;//Explicit Casting of double data to byte (Wider Range to Narrow Rage).
		short numE = (short) myDouble;//Explicit Casting of double data to short (Wider Range to Narrow Rage).
		char numD = (char) myDouble;//Explicit Casting of double data to char (Wider Range to Narrow Rage).
		int numA = (int) myDouble;//Explicit Casting of double data to integer (Wider Range to Narrow Rage).
		long numB = (long) myDouble;//Explicit Casting of double data to long (Wider Range to Narrow Rage).
		float numC = (float) myDouble;//Explicit Casting of double data float (Wider Range to Narrow Rage).
		System.out.println("Converting double to byte/short/char/int/long/float:\n___"+ numF +"_"+ numE +"_"+ numD +"_"+ numA +"_"+ numB +"_"+ numC);
		long numG = (long) myFloat;//Explicit Casting of float data to long (Wider Range to Narrow Rage).
		int numH = (int) myFloat;//Explicit Casting of float data to integer (Wider Range to Narrow Rage).
		char numI = (char) myFloat;//Explicit Casting of float data to char (Wider Range to Narrow Rage).
		short numJ = (short) myFloat;//Explicit Casting of float data to short (Wider Range to Narrow Rage).
		byte numK = (byte) myFloat;//Explicit Casting of float data to byte (Wider Range to Narrow Rage).
		System.out.println("Converting float to long/int/char/short/byte:\n___"+ numG +"_"+ numH +"_"+ numI +"_"+ numJ +"_"+ numK);
	} 

}
