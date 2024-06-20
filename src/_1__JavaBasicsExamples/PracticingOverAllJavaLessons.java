package _1__JavaBasicsExamples;

public class PracticingOverAllJavaLessons {

	

	public static void main(String[] args) {
		
		int myVal = 10; System.out.println("Initial Value:\t\t" + myVal);
		
		// Example of Arithmetic Operators ShortCut used:
		
		  myVal *= 10; System.out.println("After Multiplication:\t" + myVal); 
		  myVal /= 5; System.out.println("After Division:\t\t" + myVal); 
		  myVal %= 3; System.out.println("After Modulus:\t\t" + myVal); 
		  myVal += 90; System.out.println("After Addition:\t\t" + myVal); 
		  myVal -= 50; System.out.println("After Subtraction:\t" + myVal);
		 
		  // Example of Arithmetic Operators normally used: 
			/*
			 * myVal = myVal * 10; System.out.println("After Multiplication:\t" + myVal);
			 * myVal = myVal / 5; System.out.println("After Division:\t\t" + myVal); 
			 * myVal = myVal % 3; System.out.println("After Modulus:\t\t" + myVal); 
			 * myVal = myVal + 90; System.out.println("After Addition:\t\t" + myVal); 
			 * myVal = myVal - 50; System.out.println("After Subtraction:\t" + myVal);
			 */
		
		  int even = 10;
		  int odd = 20;
		  String myResult = even % 2 == 0 ? "Even" : "Odd";
		  System.out.println(myResult);
		  String result1 = odd % 3 == 0 ? "Odd" : "Even";
		  System.out.println(result1);
		  
		  int num = 15;
		  int num1 = 20;
		  
		  if (num % 5 == 0 && num % 4 == 0) {
		  System.out.println("FizzBuzz");
		  }if (num1 % 3 == 0) { 
		  System.out.println("Fizz");
		  }if (num1 % 10 == 0 ^ num % 4 == 0) { 
		  System.out.println("Buzz");
		  }else {
		  System.out.println("You were not able to find any of the FizzBuzz, Fizz, or ");
		  }
			  
		  
		 System.out.println("******************************\n");
		 int myFizzBuzz = 33;

		 if (myFizzBuzz % 5 == 0 && myFizzBuzz % 10 == 0) {
			 System.out.println("FizzBuzz");
		 }else if (myFizzBuzz % 5 == 0) {
			 System.out.println("Fizz");
		 }else if (myFizzBuzz % 3 == 0) {
			 System.out.println("Buzz");
		 }else {
			 System.out.println("Try Again!!!");
		 }
		 
		 int myTen = 10;
		 int myTwenty = 20;
		 
		 myTwenty -= myTen;
		 myTen += myTwenty;
		 
		 System.out.println("myTwenty is swapped to: " + myTwenty + "\nmyTen is swapped to: " + myTen);
		 
		 int val = 20;
		 int val1 = 20;
		if (val == 20 ^ val1 == 20) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
		}
		 
		 
		
		  }
		
		

		
	
	
}


		
		
		
		
	


