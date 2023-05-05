package muatationExamples;

public class ImmutableExamples {
	
	public static void main(String[] args) {
		
		
		String str = new String("Software");
		
		str.concat("Engineer");
		System.out.println(str);
		
		str = "Engineer";
		System.out.println(str);
		
		System.out.println(str.substring(0, 6));
	}

}
