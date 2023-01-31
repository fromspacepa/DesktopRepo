package loopsExamples;

public class PracticingLooping {

	public static void main(String[] args) {

		System.out.println("Printing from 10 - 0:");
		int x = 10;
		while (x >= 0 ) {
			System.out.println(x);
			x--;
		}
		System.out.println("\nPrinting from 0 - 10:");
		int x1 = 0;
		while (x1 <= 10) {
			System.out.println(x1);
			x1++;
		}
		System.out.println("\nWhile Loop Printing from 10 - 20:");
		int a = 10;
		while (a <= 20) {
			System.out.println(a);
			a++;
		}
		System.out.println("\nWhile Loop Printing from 20 - 10:");
		int a1 = 20;
		while (a1 >= 10) {
			System.out.println(a1);
			a1--;
	}
		{
			System.out.println("\nFor Loop Printing from 20 - 10:");
		for (int z = 20; z >= 10; z--) {
			System.out.println(z);
		}
		System.out.println("\nDo While Loop Printing from 20 - 10:"); 
		int z1 = 20;
		do {
			System.out.println(z1--);
		}while (z1 <= 20 && z1 >= 10);
		}
		System.out.println("\nDo While Loop Printing from 10 - 20:"); 
		int z2 = 10;
		do {
			System.out.println(z2++);
		}while (z2 <= 20 && z2 >= 10);
	}
}
