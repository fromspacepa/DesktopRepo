package palindrome_InterviewQuestions;

public class PalindromeExample4 {
	
	public static void main(String[] args) {
		//String word = "DAD";
		palindrome4("DAD");
		
				
	}
	
	public static boolean palindrome4(String str) {
		
		for(int f = 0, b = str.length() -1; f < str.length(); f ++ , b --) {

			
			System.out.println(f +  "  " + b);
		}
		
		return true;
	}
	
}
