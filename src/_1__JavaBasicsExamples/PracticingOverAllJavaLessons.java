package _1__JavaBasicsExamples;

public class PracticingOverAllJavaLessons {

	private static char[] $myTotalMoney_withI;

	public static void main(String[] args) {
		
		// Example of creating Variables with all possible naming options:
		
		int $ = 10;
		int _ = 20;
		int myNum = 30;
		int x = 40;
		int _1state_$ = 50;
	
		System.out.println($ + _ + myNum + x + _1state_$);
		
		String $myTotalMoney_withIn__1state_$ = "I am not rich";
		System.out.println($myTotalMoney_withIn__1state_$);//
		
		//Practice of swapping numbers with the help of 3rd variable:
		System.out.println("\n\n");
		int a = 30 , b = 40;
		System.out.println(a);
		System.out.println(b);
		int c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		
		//Practice of Swapping numbers without the help of 3rd variable:
		a = a -b;
		b = b +a;
		System.out.println(a);
		System.out.println(b);
		
		//Arithmetic Operators:
		/*
		 * () = Parenthesis 
		 *  * = Multiplication
		 *  / = Division
		 *  % = Remainder
		 *  + = Addition
		 *  - = Subtraction
		 *  = = Equal
		 */  
		 
		// Arithmetic Operator SHORTCUTS:
		
		int mMul = 10;
		int mDiv = 5;
		int mRem = 2;
		int mAdd = 20;
		int mSub = 5;
		
		mMul *= 5;
		mDiv /= 1;
		mRem %= 1;
		mAdd += 80;
		mSub -= 3;
		System.out.println("\nMultiplication:\t" + mMul);
		System.out.println("Division:\t" +mDiv);
		System.out.println("Remainder:\t" + mRem);
		System.out.println("Addition:\t" + mAdd);
		System.out.println("Subtraction:\t" + mSub);
		
		int mixArithmeticShorts = mAdd + mSub - mMul / 5 + (mDiv * mDiv) % 5;
		System.out.println(mixArithmeticShorts);
		System.out.println(mAdd + mSub - mMul / 5 + (mDiv * mDiv) % 5);

		
		int a1 = 10;
		int b1 = 20;
		System.out.println("\n" + a1);
		System.out.println(b1);
		b1 = b1 - a1;
		System.out.println(b1);
		a1 = a1 + b1;
		System.out.println(a1);
				
		int ca = 10;
		int ac = 20;
		System.out.println("....Printing for ca:\t" + ca);
		System.out.println("....Printing for ac:\t" + ac);
		int ab;
		ab = ca;
		ca = ac;
		ac = ab;
		System.out.println("....Printing for ca:\t" + ca);
		System.out.println("....Printing for ac:\t" + ac);
		
		
		

		
	}
	
}


		
		
		
		
	


