package _1__JavaBasicsExamples;

public class _6__LogicalOperators_OR_LogicalGets {

	public static void main(String[] args) {


		String hi = "Welcome";
		
		/** 
		 * >>> LOGICAL OPERATORS OR LOGICAL GETS:
		 * Logical Operators are used to determine the logic between variables or values and all Logical Operators are good to use in the 
		 * "if statements", to make the "if statements" more complicated.
		 * 
		 * Following are all the Logical Operators/Gets:
		 * 
		 * __Operator:_____Name:__________Description:
		 * 1)__&&__________Logical AND____Returns TRUE if both side statements are true.
		 * 2)__||__________Logical OR_____Returns TRUE if one or both side statements are true.
		 * 3)__!___________Logical NOT____Reverses the result; Returns FALSE if the result is TRUE.
		 * 4)__^___________Logica XOR_____If both sides of the XOR '^' are different the return result will be TRUE.
		 * _______________________________If both sides of the XOR '^' are the same/true value, the return result will be FALSE.
		 * _______________________________XOR '^' Means Exclusive OR.
		 * 
		 * 1) Logical "AND (&&)" Operator:
		 * NOTE:
		 * To return "true" we need to have both sides of the Logical "AND (&&)" Operator to be true. 
		 * If one or both sides of the Logical "AND (&&)" are false, it will return the boolean result of "false".
		 * 
		 * Following are the examples of Logical "AND (&&)":
		 */
		
		int x = 20; 
		System.out.println("1)__Return resutls for Logical \"AND (&&)\" Operator:");
		System.out.println(x < 5 && x < 10);
		System.out.println(x > 5 && x > 10);
		System.out.println(x > 10 && x > 20);
		// Example of Logical "AND (&&)" Operator with boolean data type:
		System.out.println("\n2)__Using of Logical \"AND (&&)\" Operator with boolean data type:");
		boolean num1 = x < 5 && x < 10;
		System.out.println(num1);
		boolean num2 = x > 5 && x > 10;
		System.out.println(num2);
		boolean num3 = x > 19 && x > 20;
		System.out.println(num3);
		
		// Example of Logical "AND (&&)" Operator with selection statements (if, else if, else):
		System.out.println("\n3)__Using Logical \"AND (&&)\" Operator with Selection Statement (if, else if, else):");
		if (x < 5 && x < 10) {
			System.out.println("if block is: TRUE");
		}else if(x > 5 && x > 10){
			System.out.println("else if block is: TRUE");
		}else {
			System.out.println("Look both sides of Logical And");
		}

		/**
		 * 2) Logical "OR (||) Operator":
		 * NOTE:
		 * to return "true" we need to have one or both sides of the Logical "OR (||)" Operator to be true.
		 * If both sides of the Logical "OR (||)" are "false", it will return "false";
		 * 
		 * Following are the examples of Logical "OR (||)" Operator:
		 */
		
		int y = 50;
		// Examples of Logical "OR (||)" Operator with simple printout:
		System.out.println("\n4)__Using of Logical \"OR (||)\" Operator:");
		System.out.println(y > 30 || y < 30);
		System.out.println(y < 30 || y > 30);
		System.out.println(y > 30 || y > 40);
	
		// Example of Logical "AND (&&)" Operator with boolean data type:
		System.out.println("\n5)__Using of Logical \"OR (||)\" Operator with boolean data type:");
		boolean numA = y < 100 || y < 40;
		System.out.println(numA);
		boolean numB = y > 60 || y > 50;
		System.out.println(numB);
		boolean numC = y > 30 || y > 40;
		System.out.println(numC);
		
		/**
		 * 3) Logical "NOT (!)" Operator:
		 * NOTE:
		 * To return "true" we only need to have one side of the Logical "NOT (!)" Operator to be "true".
		 * Logical "NOT (!)" Operator reverses the result. It returns "false" if the result is "true".
		 * Basically, reverses the result of boolean. For instance, if the return result for other Logical Operators is "true" 
		 * and you add the Logical "NOT (!)" to it, the return results will get reverse from "true" to "false". 
		 * 
		 * Examples are shown below:
		 */
		
		int z = 40;
		// Examples of Logical "NOT (!)" with simple printout:
		System.out.println("\n6)__Return results for Logical \"NOT (!)\":");
		System.out.println(!(z > 50 || 30 < z));
		System.out.println(!(60 != z && z != 70));
		System.out.println(z > 30 || 30 > z);
		// Example of Logical "NOT (!)" with Selection Statements (if, else if, else):
		System.out.println("\n7)__Return result for Logical \"NOT (!)\" with Selection Statements (if, else if, else):");
		if (!(z < 20 || 30 > z)) {
			System.out.println("if block is: TRUE");
		}else if(70 > z && z > 50){
			System.out.println("else if block is: TRUE");
		}else {
			System.out.println("Look both sides of Logical OR");
		}
		// Example of Logical "NOT (!)" with boolean data type:
		System.out.println("\n8)__Return results for Logical \"NOT (!)\" with boolean data type:");
		boolean num4 = 10 < z || z != 20;
		System.out.println(num4);
		boolean num5 = !(20 != 50 && 30 != 20);
		System.out.println(num5);
		boolean num6 = !(20 > z && z > 20);
		System.out.println(num6);
		
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
