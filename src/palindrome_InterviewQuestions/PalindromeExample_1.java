package palindrome_InterviewQuestions;// This is the package.


public class PalindromeExample_1 {

	public static void main(String[] args) {
		palindrome1("ABCBA");
		
}
	public static boolean palindrome1(String str) {
		for(int i = str.length() - 1; i >= 0; i--) {
			
			System.out.print(" " + str.charAt(i));
		}
		
		return true;
		
	}



}
