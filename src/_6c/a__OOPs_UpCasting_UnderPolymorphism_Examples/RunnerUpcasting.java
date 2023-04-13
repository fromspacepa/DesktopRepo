package _6c.a__OOPs_UpCasting_UnderPolymorphism_Examples;

public class RunnerUpcasting {
	
	public static void main(String[] args) {
		
		SuperClass__Mobile__Example1 objSuper = new SubClass__Apple__Example1("Apple", "iPhone15", "SN657462");
		System.out.println(objSuper);
		objSuper.setSerialNo("AIKI394340");
		System.out.println(objSuper);
		
		SubClass__Apple__Example1 objIOS = new SubClass__Apple__Example1("Samsung", "Note3", "SAM4341");
		System.out.println(objIOS);
		
		SuperClass__Mobile__Example1 objSuper1 = new SuperClass__Mobile__Example1();
		System.out.println(objSuper1);
		
		SuperClass__MobileBlue__Example2 m = new SubClass__Samsung__Example2();
		System.out.println(m);
		m.calling();
		//m.camera();
		
		SuperClass__MobileBlue__Example2 m1 = new SuperClass__MobileBlue__Example2();
		System.out.println(m1);
		m1.calling();
		SubClass__Samsung__Example2 s = new SubClass__Samsung__Example2();
		System.out.println(s);
		s.camera();
		

	}

}
