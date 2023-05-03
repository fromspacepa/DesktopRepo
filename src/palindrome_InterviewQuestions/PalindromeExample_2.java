package palindrome_InterviewQuestions;

public class PalindromeExample_2 {
	
	public static void main(String[] str) {
		
		String word = "12321";
		System.out.println("Method 2: " + word + " <-- " + palindrome2(word));
		
	}
	
	public static boolean palindrome2(String str) {
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i --) {
			rev += str.charAt(i);
		}
		
		return str.equals(rev);
		
	}

		
	

}
