package _8a__OOPs_PolymorphismPractice;

public class ClassRunner {

	public static void main(String[] args) {


		ParentClass objctOfParentClass = new ParentClass("John", "Habib", "29031982", "American");
		System.out.println(objctOfParentClass);
		
		ChildClass__A objctOfSubClassA = new ChildClass__A("Ahmad", "Wali", "21052000", "Afghan", 22, "2678376498","Computer Science");
	    System.out.println(objctOfSubClassA);

		ChildClass__B objctOfSubClassB = new ChildClass__B("Khan", "Gul", "12091992", "Pakistani", 32, "2154356743", "Buisenss", "Virgina, USA");
		System.out.println(objctOfSubClassB);
		
		ChildClass__C objctOfSubClassC = new ChildClass__C("David", "Dhawan", "03311994", "Indian", "dhawan392@yahoo.com","0345674876", "New Delhi, India");
		System.out.println(objctOfSubClassC);
	}

}
