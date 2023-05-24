package _1__JavaBasicsExamples;

public class _6__LogicalOperators_OR_LogicalGets {

	public static void main(String[] args) {


		String hi = "Welcome";
		
		/** >>>>> LOGICAL OPERATORS OR LOGICAL GETS:
		 * 
		 * __Operator:_____Name:__________Description:
		 * 1)__&&____________Logical AND____Returns TRUE if both side statements are true.
		 * 2)__||____________Logical OR_____Returns TRUE if one or both side statements are true.
		 * 3)__!_____________Logical NOT____Reverses the result; Returns FALSE if the result is TRUE.
		 * 4)__^_____________Logica XOR_____If both sides of the XOR '^' are different the return result will be TRUE.
		 * _______________________________If both sides of the XOR '^' are the same/true value, the return result will be FALSE.
		 * _______________________________XOR '^' Means Exclusive OR.
		 * NOTE: In whole Logical Operators are used to determine the logic between variables or values.
		 * and all Logical Operators are good to use in the 'if statements' to make it more complicated.
		 * Following are the examples of all above mentioned Logical Operators/Gets:
		 * 
		 * 1) >>> LOGICAL AND '&& EXAMPLES:'
		 * As explained above, To return 'true' we need to have both sides of the Logical And '&&' operator to be true.
		 * if one or both sides are false it will return 'false'. Examples are shown below:
		 *  
		 */
		
		int x = 20; 
		//Examples with simple printout:
		System.out.println("Return resutls for LOGICAL AND '&&':");
		System.out.println(x < 5 && x < 10);
		System.out.println(x > 5 && x > 10);
		System.out.println(x > 10 && x > 20);
		
		//Example of LOGICAL AND '&&' with Selection Statements (if/else if/else):
		if (x < 5 && x < 10) {
			System.out.println("If block is: TRUE");
		}else if(x > 5 && x > 10){
			System.out.println("Else if block is: TRUE");
		}else {
			System.out.println("Look both sides of Logical And");
		}
		//Example of LOGICAL AND '&&' with boolean data type:
		boolean num1 = x < 5 && x < 10;
		System.out.println("Depending on the condition of both sides of Logical AND, the result is: " + num1);
		boolean num2 = x > 5 && x > 10;
		System.out.println("Depending on the condition of both sides of Logical AND, the result is: " + num2);
		boolean num3 = x > 19 && x > 20;
		System.out.println("Depending on the condition of both sides of Logical AND, the result is: " + num3);
		
		
		/**
		 * 2) >>> LOGICAL OR '&& EXAMPLES:'
		 * As explained above, To return 'true' we need to have one or both sides of the Logical OR '||' operator to be true.
		 * if one or both sides are true it will return 'true'. 
		 * Means that we only need one side true to return true.
		 * Examples are shown below:
		 */
		
		int y = 50;
		//Examples with simple printout:
		System.out.println("\nReturn results for Logical OR '||:");
		System.out.println(y > 30 || y < 30);
		System.out.println(y < 30 || y > 30);
		System.out.println(y > 30 || y > 40);
		//Example of LOGICAL AND '&&' with Selection Statements (if/else if/else):
		if (y < 50 || 50 > y) {
			System.out.println("If block is: TRUE");
		}else if(y > 70 || y > 60){
			System.out.println("Else if block is: TRUE");
		}else {
			System.out.println("'False' Look both sides of Logical OR");
		}
		//Example of LOGICAL AND '&&' with boolean data type:
		boolean numA = y < 100 || y < 40;
		System.out.println("Depending on the condition of both sides of Logical OR, the result is: " + numA);
		boolean numB = y > 60 || y > 50;
		System.out.println("Depending on the condition of both sides of Logical OR, the result is: " + numB);
		boolean numC = y > 30 || y > 40;
		System.out.println("Depending on the condition of both sides of Logical OR, the result is: " + numC);
		
		/**
		 * 3) >>> LOGICAL NOT '!' EXAMPLES:
		 * As explained above, Logical Not '!' operator reverses the result. It returns false if the result is true.
		 * Basically reverses the result of boolean. For instance, if the return result for other logical operators is true and you add 
		 * the Logical Not '!' to it, the return results will reverse from true to false. 
		 * Means that we only need one side true to return true.
		 * Examples are shown below:
		 */
		
		int z = 40;
		//Examples of LOGICAL NOT '!' with simple printout:
		System.out.println("\nReturn results for Logical NOT '!':");
		System.out.println(!(z > 50 || 30 < z));
		System.out.println(!(60 != z && z != 70));
		System.out.println(z > 30 || 30 > z);
		//Example of LOGICAL NOT '!' with Selection Statements (if/else if/else):
		if (!(z < 20 || 30 > z)) {
			System.out.println("If block is: TRUE");
		}else if(70 > z && z > 50){
			System.out.println("Else if block is: TRUE");
		}else {
			System.out.println("Look both sides of Logical OR");
		}
		//Example of LOGICAL NOT '!' with boolean data type:
		boolean num4 = 10 < z || z != 20;
		System.out.println("Depending on the condition of both sides of Logical NOT, the result is: " + num4);
		boolean num5 = !(20 != 50 && 30 != 20);
		System.out.println("Depending on the condition of both sides of Logical NOT, the result is: " + num5);
		boolean num6 = !(20 > z && z > 20);
		System.out.println("Depending on the condition of both sides of Logical NOT, the result is: " + num6);
		
		/**
		 * 4) >>> LOGICAL XOR '^'(EXCLUSIVE OR) EXAMPLES:
		 * As explained above, Logical XOR '^' (Exclusive OR) Operator means one or another.
		 * To return the 'true' result, both sides of the conditions or value should be different;
		 * (Means that on side of the XOR '^' should be 'true' and the other side should be 'false' to return 'true'.
		 * To return the 'false' result, both sided of the conditions or value should be the same;
		 * (Means that both sides of the XOR '^' should be the same value of either 'true' OR 'false' to return 'false'.
		 * Examples are shown below:
		 */
		
		int x1 = 100;
		//Examples of LOGICAL XOR '^' (Exclusive OR with simple printout:
		System.out.println("\nReturn results for Logical XOR '^' (Exclusive OR):");
		System.out.println(!(x1 > 50 ^ 30 < x1));
		System.out.println(!(60 != x1 ^ x1 == 70));
		System.out.println(x1 > 30 ^ 30 < x1);
		System.out.println(x1 == 100 ^ 100 == x1);
		//Example of LOGICAL XOR '^' (Exclusive OR) with Selection Statements (if/else if/else):
		if (x1 < 100 ^ 30 > x1) {
			System.out.println("If block is: TRUE");
		}else if(!(70 > x1 && x1 > 50)){//(Not(F&&T=F) = 'NotFalse = True')
			System.out.println("Else if block is: TRUE");
		}else {
			System.out.println("Look both sides of Logical OR");
		}
		//Example of LOGICAL XOR '^' (Exclusive OR) with boolean data type:
		boolean numD = 10 < 20 ^ x1 > 20 && (x1 > 90 ^ 30 == x1);//T^T='False' && (T^F=True') Returns result to: "False && True = False"
		System.out.println("Depending on the condition of both sides of Logical XOR '^', the result is: " + numD);
		boolean numE = !(20 != 50 ^ 30 != 20);//Not(T^T='False') Returns result to: "Not False = True"
		System.out.println("Depending on the condition of both sides of Logical XOR '^', the result is: " + numE);
		boolean numF = !(20 > 30 ^ 30 > 20);//Not(F^T='True') Returns result to: "Not True = false"
		System.out.println("Depending on the condition of both sides of Logical XOR '^', the result is: " + numF);
		
		boolean result1 = true;
		boolean result2 = false;
		boolean result3 = false;
		if  (result1 != result2 ^ result2 == result3) {
		System.out.println("Your return of XOR is True");
		} else {
			System.out.println("Your return of XOR is False");
		}
		
		int A = 10, B = 20;
		boolean C = A == B ^ B != A;
		System.out.println(C);
		boolean D = A > 30 ^ B < 10;
		System.out.println(D);
		boolean E = A > B ^ B < A;
		System.out.println(E);
		
		
			
		
		
	}
	

}
