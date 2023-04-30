package _0__InterviewQuestions__PalindromeExample;

public class Palindrome {

	public static void main(String[] args) {
		
		strPalindrome("ABCBA");

	}
	
	public static void strPalindrome(String str) {
		String rev = "";
		for(int r = str.length() -1; r >= 0; r--) {
			
			rev += str.charAt(r);
			
		}
		System.out.println(str);
		
		
	}


}
