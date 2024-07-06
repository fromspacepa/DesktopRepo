
package _1__JavaBasicsExamples;

public class _6b__MixedTypeArithmeticExpressionsAndTypeCasting {

	public static void main(String[] args) {
		
		/**
		 * >>> Mixed-Type Arithmetic Expressions:
		 * 
		 * In this class we will be covering the following problems in Mixed Type Arithmetic Expressions:
		 * 		1) Mixed Type
		 * 		2) Mixed Type with Promotion
		 * 		3) Type Casting:
		 *   		__Implicite Casting
		 *    		__Explicite Casting
		 *    
		 * 1) Mixed Type: 
		 * is when you are trying to do an operation between double and integer values,
		 * while doing Mixed Type Arithmetic Execution in your code such as "int <--> double" it will give you the
		 * result of double value.
		 * NOTE: Just keep in mind that the double data type is more accurate then integer data type.
		 * Following are the examples:
		 */
		double x = 6.7;
		int y = 3;
		
		// With the execution of Mixed Type Addition, this will give you the result of 9.7:
		double addition = x + y;
		System.out.println("The outcome for Mixed-Type 'double & int' addition: " + addition);
		// With the execution of Mixed-Type Multiplication, this will give you the result of 20.1:
		double multiplication = x * y;
		System.out.println("The outcome for Mixed-Type execution of 'double <--> int': " + multiplication);
		// With the execution of Mixed-Type Division this will give the result of 2.2333333333333334
		double division = x / y;
		System.out.println("The outcome for Mixed-Type execution of 'double <--> int': " + division);
		
		/** 
		 * 2) Mixed Type with Promoting: 
		 * is while doing mixed execution of integer data type to double data type; In Java this term is called promotion,
		 * because the value of integer is promoting to double; means that the integer value will get promoted to double with decimals.
		 * 
		 * Following are the examples of Promotion:
		 */
				
		byte byteVal = 127;
		short shortVal = 30000;
		int integerVal = 100000;
		float floatVal = 2000.12f;
		double doubleVal = 1000.24;
		long longVal = 2000002325234444442L;
		char charCharacter = 'B';//The Value of Character "B" is 66. (Referenced from ASCII Table)
		
		System.out.println("\nFollowing are the results of Mixed-Type Promotion Operations:");
		double promotToDouble = byteVal + floatVal;//This is when you promoting byte <--> float to double: (2127.1201171875)
		System.out.println("Promoting of byte <--> float resulting to double:\t" + promotToDouble);
		float promotToFloat = byteVal + longVal;//This is when you promoting byte <--> long to float: (2.00000231E18)
		System.out.println("Promoting of byte <--> long resulting to float:\t" + promotToFloat);
		long promotToLong = byteVal + integerVal;//This is when you promoting byte <--> integer to long: (100127)
		System.out.println("Promoting of byte <--> int resuling to long:\t" + promotToLong);
		int promotToInt = byteVal + shortVal + charCharacter;//This is when you promoting byte <--> short/char to integer: (30193)
		System.out.println("Promoting of byte <--> short plus char resulting to integer:\t" + promotToInt);
		
		/** 
		 * 3) Type Casting:
		 *    __Implicit Casting
		 *    __Explicit Casting
		 * 
		 * -> Type Casting:
		 * means converting one data type to another data type; For instance, you convert integer to double and vice versa.  
		 * __Implicit Casting:
		 * happens automatically when converting from narrower range data type to a wider range data type without losing data, 
		 * such as: byte -> short -> char -> int -> long -> float -> double; For instance: converting int to double or float/long.
		 * NOTE:
		 * In the above case, Implicit Casting happens automatically because the double/float/long has wider range then integer OR  
		 * we can say that Implicit Casting happens, when converting a narrower to wider range data type, without losing data.
		 * 
		 * __Explicit Casting: 
		 * does not happen automatically, it should be done by the programmer when converting from a wider to narrow range data type,
		 * such as: double -> float -> long -> int -> char -> short -> byte; For instance converting a double/float/long to int.
		 * NOTE:
		 * In the above case, Explicit Casting cannot happen because you will get exception/error during runtime.
		 */

		// Following are the examples of Implicit Casting:
		System.out.println("Examples of Implicit casting 'A narrow range data type to a wider range data type:\n");
		
		byte myByte = 127;
		short myShort = 70;
		char myChar = 66;
		int myInt = 100;
		long myLong = 800L;
		float myFloat = 700.F;
		double myDouble = 200.22;
		
		// Assigning byte data type to byte Implicitly.
		byte num1 = myByte;
		System.out.println("Assigning byte to byte: "+ num1);
		// Converting byte data type to short Implicitly.
		short num2 = myByte;
		System.out.println("Converting byte to short: "+ num2);
		// Assigning char data type to char Implicitly.
		char num4 = myChar;
		System.out.println("Assigning char to char: "+ num4);
		// Converting char/short/byte to integer Implicitly
		int num6 = myChar, num7 = myShort, num8 = myByte;
		System.out.println("Converting char/short/byte to integer: "+ num6 +"_"+ num7 +"_"+ num8);
		// Converting integer/char/short/byte to long Implicitly.
		long num11 = myInt, num12 = myChar, num13 = myShort, num14 = myByte;
		System.out.println("Converting int/char/short/byte to long: "+ num11 +"_"+ num12 +"_"+ num13 +"_"+ num14);
		// Converting long/integer/char/short/byte to float implicitly.
		float num15 = myLong, num17 = myInt, num18 = myChar, num19 = myShort, num20 = myByte;
        System.out.println("Converting long/int/char/short/byte to float: "+ num15 +"_"+ num17 +"_"+ num18 +"_"+ num19 +"_"+ num20);
        // Converting float/long/integer/char/short/byte to double Implicitly.
		double num21 = myFloat, num22 = myLong, num23 = myInt, num24 = myChar, num25 = myShort, num26 = myByte;
		System.out.println("Converting float/long/int/char/short/byte to double: "+ num21 +"_"+ num22 +"_"+ num23 +"_"+ num24 +"_"+ num25 +"_"+ num26);
	
		
		// Following are the examples of Explicit Casting:
		System.out.println("\n\nExamples of Explicitly Casting 'A wider range data type to a narrow range data type:\n");
		byte numF = (byte) myDouble;// Explicit Casting of double data to byte (Wider Range to Narrow Rage).
		short numE = (short) myDouble;// Explicit Casting of double data to short (Wider Range to Narrow Rage).
		char numD = (char) myDouble;// Explicit Casting of double data to char (Wider Range to Narrow Rage).
		int numA = (int) myDouble;// Explicit Casting of double data to integer (Wider Range to Narrow Rage).
		long numB = (long) myDouble;// Explicit Casting of double data to long (Wider Range to Narrow Rage).
		float numC = (float) myDouble;// Explicit Casting of double data float (Wider Range to Narrow Rage).
		System.out.println("Converting double to byte/short/char/int/long/float: "+ numF +"_"+ numE +"_"+ numD +"_"+ numA +"_"+ numB +"_"+ numC);
		long numG = (long) myFloat;// Explicit Casting of float data to long (Wider Range to Narrow Rage).
		int numH = (int) myFloat;// Explicit Casting of float data to integer (Wider Range to Narrow Rage).
		char numI = (char) myFloat;// Explicit Casting of float data to char (Wider Range to Narrow Rage).
		short numJ = (short) myFloat;// Explicit Casting of float data to short (Wider Range to Narrow Rage).
		byte numK = (byte) myFloat;// Explicit Casting of float data to byte (Wider Range to Narrow Rage).
		System.out.println("Converting float to long/int/char/short/byte: "+ numG +"_"+ numH +"_"+ numI +"_"+ numJ +"_"+ numK);
		
		
		System.out.println("\nFollowing are the examples of \"Explicit Casting\":");
		double myDoubleValue = 66.02;
		System.out.println("double value:\t\t\t" + myDoubleValue);
		int myIntValue = (int) myDoubleValue;
		System.out.println("double to integer value:\t" + myIntValue);
		char myCharVal = (char) myDoubleValue;
		System.out.println("double to char value:\t\t" + myCharVal);
		byte myByteVal = (byte) myDoubleValue;
		System.out.println("double to byte value:\t\t" + myByteVal);
		short myShortVal = (short) myDoubleValue;
		System.out.println("double to short value:\t\t" + myShortVal);
		float myFloatVal = (float) myDoubleValue;
		System.out.println("double to float value:\t\t" + myFloatVal);
		long myLongVal = (long) myDoubleValue;
		System.out.println("double to long value:\t\t" + myLongVal);
		
		
		int intVal = 10; double dblVal = 20.22;
		
		int explicitCasting = (int) dblVal;
		System.out.println(explicitCasting); 
		double implicitCasting = intVal;
		System.out.println(implicitCasting);
		
	} 

}
