package javaBasics;

public class Operators_AssignmentVSCallingVariable_2 {

	public static void main(String[] args) {
		
		
//Assigning Variable means that you are assigning value OR changing value of Variable.
//Calling Variable means that you are just calling/printing value of Variable and while calling Variable, the value of Variable does not change.
	
//Example of Variable Initialization OR Initialization Process: 
		int x = 10;//<==Here Variable "X" is Declared and Initialized; First time declaring & initializing variable is called Initialization Process.
		//don't forget that the value of "X" is "10".
		System.out.println("Initialization Process:\n"+ x +"____1st time Variable 'X' is declared & initialized.\n");
		
//Example of Variable Assignment OR Assignment Process:
		x = 15;//<==Here Variable "X" is Assigned; After 1st time variable is declared & initialized, is called Assignment Process.
	    //don't forget that the value of "X" is/assigned and changed from above value "10" to value "15". So, this is "Assignment"
		System.out.println("Assignment/Assignment Process:\n"+ x +"____2nd time Variable 'X' is assigned and changed it's value.\n");
		
//Another example of Variable Assignment OR Assignment Process:
		x += 5;//<==Here Variable "X" is Assigned; This time variable "X" is assigned too, and the value is changed from "15" to "20" by using
	    //the example of Addition Shortcut assignment operator. 
		System.out.println("Assignment/Assignment Process:\n"+ x +"____3rd time Variable 'X' is assigned and changed it's value.\n");
				
				
//Example of Calling Variable:
		System.out.println("Calling Variable:\n"+ x + 5+"____1st time calling Variable, the printOut is '205',"
	    +"\nbecause it is printing '20' together with addition of '5' with no space in between, it looks like '205'.\n");//<==This is calling Variable "X". 
        //In the above examples the value of Variable is changed few times, which was "20".
        //at this calling Variable, the SysOut will print "205" because we used "+ 5" OR add "5" to previous value "20", but
        //the value of Variable "X" is not changed.
		System.out.println("Printing Variable 'X':\n" + x +"____Here this is just the printOut of Variable 'X'.\n");
		
//Important Note:
		//One thing you need to realize that what you do with the Assignment(s): (x = 5;) OR (x += 5;), is that you are assigning the right side of the 
		//equal = side to the left side of the equal side. 

//Example of Assignment Operators ShortCut:
		x += 10;//ShortCut of Addition Assignment Operator. (The original value of Variable "X" was "20", and I added "10" to it, now the value of X is 30.
		System.out.println("Result of Addition 'x += 10;' ShortCut Assingment Operator:");
		System.out.println(x);//The result is printed in the Cosole below:
		x = x + 10;//This and the above ^ Assignment Operator do the same job. The value of X was 30 and I added 10, now the value of X is 40.
		System.out.println("\nThis Addition 'x = x + 10' and the above Assignment do the same job:");// 
		System.out.println(x);//The result is printed in the Cosole below:
		x = 100;//Here the value of X is changed/assigned to 100.
		System.out.println(x);
		x += 5;//Here the value of X is added with 5 more, and the value of X is changed to 105.
		// (x = x + 5;) this is the same as above^. 
		System.out.print(x);
		x *= 5;//Here the value of X is multiplied by 5, now the value of X is changed to 525.
		// (x = x * 5;) this is the same as above^.
		System.out.println("\n"+x);
		x /= 5;//Here the value of X is divided by 5, now the value of X is changed to 105.
		// (x = x / 5;) this is the same as above^.
		System.out.println(x);
		x -= 7;//Here the value of X is subtracted by 7, now the value of X is changed to 98.
		// (x = x - 7;) this is the same as above^.
		System.out.println(x);
		x %= 5;//Here the value of X is divided by 5, the remainder is 3. Now the value of X is changed to 3.
		// (x = x % 5;) this is the same as above^ 
		System.out.println(x);
		x -= 3;//Here the value of X is subtracted by 3, now the value of X is changed to 0.
		System.out.println(x);
		 
	}

}
