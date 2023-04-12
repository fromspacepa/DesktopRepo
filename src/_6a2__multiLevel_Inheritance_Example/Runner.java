package _6a2__multiLevel_Inheritance_Example;

public class Runner {
	
	public static void main(String[] args) {
		
		
		A__Parent objPa = new A__Parent("James", 25);
		System.out.println("Example of Multi Level inheritance\n--------------------------------------\n1) A__Parent:" + objPa);
		B__Child objCh1 = new B__Child("Khan", "Bacha", 29);
		System.out.println("\n2) B__Child:" + objCh1);
		C__Child objCh2 = new C__Child("Thomas", "David", 32, "8765478657");
		System.out.println("\n3) C__Child:" + objCh2);
		
	}

}
