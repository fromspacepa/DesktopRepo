package javaBasics;

public class WhileLoop {

	public static void main(String[] args) {
		
		System.out.println("-------------");

		// >>>>> WHILE LOOP EXAMPLES:
		int x = 10;
		while (x >= 0) {
			System.out.println(x--);
		}
		System.out.println("-------------");
		
		int y = 3;
		while (y <= 11) {
			System.out.println(y);
			// y++; y++;
			y += 2;

		}

	}
}
