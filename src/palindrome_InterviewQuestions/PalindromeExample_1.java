package palindrome_InterviewQuestions;// This is the package.


public class PalindromeExample_1 {

	public static void main(String[]args) {
			
		
	String reverse = "";
	String original = "JAN";

		
	for (int i = original.length() - 1; i >= 0; i--) {
		reverse += original.charAt(i);
	}
	System.out.println(reverse);
	if (reverse.equals(original))
		System.out.println("The above word is a palindrome");
	else
	System.out.println("The above word is not a palindrome!");
}{



}}
