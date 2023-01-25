package loopsExamples;

public class BreakAndContinueKeywordsInForLoop {

	public static void main(String[] args) {

		//Example of break key-word using with for-loop:
		System.out.println("----Break keyword with for-loop----");
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
			if (i == 12) 
				break;//Here this break keyword stop iterating at number 12 and will not allow the for-loop to loop more than 12 times.
		}
		
		//Example of continue key-word using with for-loop:
		System.out.println("----Continue keyword with for-loop----");
		for (int i = 1; i <= 20; i++) {
			if (i == 12) 
				continue;//Here this continue keyword escape number 12 and will escape looping at 12.
			System.out.println(i);
		}
		//Example of continue key-word using with for-loop:
		System.out.println("----Continue keyword with for-loop----");
		for (int i = 1; i <= 20; i++) {
			if (i <= 12) 
				continue;//Here this continue keyword escape the looping up to number 12 and allows the looping to loop from number 13 to 20.
			System.out.println(i);
		}
	}

}
