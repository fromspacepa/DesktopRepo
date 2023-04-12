package _6a3__Hierarchical_Inheritance_Example;

public class Runner {
	
	public static void main(String[] args) {
		
		Parent parObj = new Parent("Khan", "Gul", 10);
		System.out.println("\nExample of Hierarchical Inheritance\n"
				+ "=================================" + "\n__ParentClass:" + parObj);
		Child1 chilOne = new Child1("Khan", "Gul", 10, "Computer Science");
		System.out.println("\n__Child Class One:" + chilOne);
		Child2 chilTwo = new Child2("Pacha", "Wali", 30, "Afghan", "Virginia, USA", "6746598976");
		System.out.println("\n__Child Class Two:" + chilTwo);
	}

}
