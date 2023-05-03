package palindrome_InterviewQuestions;

public class PalindromeExample3 {

	public static void main(String[] args) {
		
		String word = "MOM";
		System.out.println("Method 3: " + word + " <-- " + palindrome3(word));
	}
		public static boolean palindrome3(String str) {
			
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			return String.valueOf(sb).equals(str);
			
		}
		

}
