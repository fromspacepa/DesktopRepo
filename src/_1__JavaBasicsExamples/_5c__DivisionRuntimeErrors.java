package _1__JavaBasicsExamples;

public class _5c__DivisionRuntimeErrors {

	public static void main(String[] args) {
		
		// >>>>> DIVISION (1-OF-2) (Division with integer and double): 
		
	    /*While having Arithmetic Statements/Executions in your Java code, you may face 
		exceptions/errors, especially in Division during runtime. 
		Following are some of the examples of coding and what to expect from it during execution/runtime:
		NOTE: Why is this important to know?
		This is important because you maybe working with a peace of code that is going to calculate
		something you need to know, what can you expect from such code statements that is demonstrated below:
		*/
		
		//Integer Division By Zero:
		int x = 13, y = 5; //As you know by now that this is the process of Declaration and Initialization.
		//Quotient:
		int quotient = x / y; //The quotient will equal to 2:
		System.out.println("Result of Quotient: " + quotient);
		//Remainder:
		int remainder = x % y; //The remainder here will be 3:
		System.out.println("Result of Remaider: " + remainder);
		//Division By Zero:
		int zeroDivision = 9 / 0; //Here you will get Error/Arithmetic Exception:
		System.out.println("Result of Division By Zero: " + zeroDivision);

	    // Division by Zero: 
		int a = 10;
		int b = 0;
		System.out.println(a/b);//This will give you Exception.
		System.out.println(b/b);//This will also give you Exception.
	    //NOTE: While integer is divided by zero it will give you Exception/Error during execution/runtime, but while you are coding
	    //everything will look good and will not indicate any errors.
		double c = 10.0;
		double d = 0.0;
		System.out.println(c/b);//This will give you infinity.
		System.out.println(d/d);//This will give you NaN.
	    //NOTE: While double is divided by zero it will give you Infinity OR NaN during execution/runtime, but while you are coding
	    //everything will look good and will not indicate any errors.
		
		
		// >>>>> DIVISION (2-OF-2) (Division with Floating-Point)
		// >Fraction Part AND Division by Zero:
		
		//Double Division By Zero:
		double e = 10.0, f = 2.2;//As you know by now that this is the process of Declaration and Initialization.
		double q = e / f;
		System.out.println("Result of Quotient/Division By Floating-Point: " + q);//This will give you: 4.545454545454545
		double r = e % f;
		System.out.println("Result of Remainder by Floating-Point: " + r);//This will give you: 1.1999999999999993
		double z = 3.0 / 0.0;
		System.out.println("Result of Double Division by Floating-Point: "+ z);//This will give you: Infinity
		double z1 = 0.0 / 0.0;
		System.out.println("Result of Double Divsion by Zero Floating-Point: " + z1);//This will give you: NaN
 
		

	}

}
