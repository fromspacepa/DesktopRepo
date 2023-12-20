package _1__JavaBasicsExamples;

public class PracticingOverAllJavaLessons {

	

	public static void main(String[] args) {
		
		int myInt = 10;
		int myNum = 20;
		double myDouble = 10.22;
		myNum -= myInt;
		myInt += myNum;
		System.out.println("myInt Variable is now: " + myInt + "\nmyNum Variable is now: " + myNum);
		
		boolean myAND = (myInt > 8 && myNum < 30);
		System.out.println("myLogical/get AND && Operator:\t" + myAND);
		//Both side has to be either true or false to return the true , if both sides are different you will get false.
		boolean myOR = (myInt >= 10 || myInt > 20);
		System.out.println("myLogical/get OR || Operator:\t" + myOR);
		//Both or one side has to be true to return the true.
		boolean myNOT = myInt != 10;
		System.out.println("myLogical/get NOT ! Operator:\t" + myNOT);
		//It changes the result of true to false and false to true.
		boolean myXOR = myNum == 10 && myInt != 10;
		System.out.println("myLogical/get XOR ^ Operator:\t" + myXOR);
		//Both sides has to be different to return true. If both side are either true or false, it will return false.
		
		//Short hand if statement:
		// -> Data type -> Variable = condition ? true block : false block;
		
		String myShortHandResults = myNum > myInt ? "Habibi you got it" : "Habibi try again!";
		System.out.println(myShortHandResults);
		
		myInt = (int) myDouble;
		System.out.println("Explicit Casting: " + myInt);
		myDouble = myNum;
		System.out.println("Implicit Casting: " + myDouble);
		myDouble++;
		System.out.println(myDouble);
		++myDouble;
		System.out.println(myDouble);
		myInt = (int) myDouble;
		System.out.println(myInt);
		
		
		}
		
		

		
	
	
}


		
		
		
		
	


