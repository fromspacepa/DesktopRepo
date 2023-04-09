package _7__SpecifierExamples;

public class Keywords_continue_break_Examples {

	public static void main(String[] args) {
		
		// Following here are the examples of keywords: (continue and break) using them inside forLoop and ifStatement:
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
		}
		System.out.println(i);
		
		}
		
		for (int j = 0; j < 10; j++) {
			if (j == 5) {
				break;
			}
			System.out.println(j);
		}
		
		for (int num = 0; num < 10; num++) {
			if (num % 2 != 0) {
				continue;
			}
			System.out.println(num);
		}
		System.out.println();
		outter: for (int outerNum1 = 0; outerNum1 < 10; outerNum1++) {
			inner: for (int innerNum2 = 0; innerNum2 < 10; innerNum2++) {
				System.out.print(innerNum2*outerNum1 + "\t");
				if (innerNum2*outerNum1 > 20) {
					break outter;
					
				}
				
			
			}
			System.out.println();
		}
	}

}
