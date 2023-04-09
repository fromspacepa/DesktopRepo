package _6c__OOPs_PolymorphismExamples;


// This is the runner class; it is created to test-out and make objects of the Parent/Super Class and Child/Sub-Classes in the package of POLYMORPHISM.
public class ClassRunner {

	public static void main(String[] args) {

        // This is to create an object (instance copy) of a parent/super class named: ParentClass
		ParentClass objctOfParentClass = new ParentClass("John", "Habib", "29031982", "American");
		System.out.println(objctOfParentClass);
		// This is to create an object (instance copy) of a child/sub-class named: ChildClass__A
		ChildClass__A objctOfSubClassA = new ChildClass__A("Ahmad", "Wali", "21052000", "Afghan", 22, "2678376498","Computer Science");
	    System.out.println(objctOfSubClassA);
        // This is to create an object (instance copy) of a child/sub-class named: ChildClass__B
		ChildClass__B objctOfSubClassB = new ChildClass__B("Khan", "Gul", "12091992", "Pakistani", 32, "2154356743", "Buisenss", "Virgina, USA");
		System.out.println(objctOfSubClassB);
		// This is to create an object (instance copy) of a child/sub-class named: ChildClass__C
		ChildClass__C objctOfSubClassC = new ChildClass__C("David", "Dhawan", "03311994", "Indian", "dhawan392@yahoo.com","0345674876", "New Delhi, India");
		System.out.println(objctOfSubClassC);

	
	}

}
