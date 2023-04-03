package _6a__OPPs_InheritanceExamples;

public class RunnerClass {

	public static void main(String[] args) {

		// This is to create the instance copy (an object) of 1st Constructor in the
		// Child/Sub-Class "Student_Child_SubClass":
		Student_Child_SubClass stObj1 = new Student_Child_SubClass("Ahmad", "Mahmod", 31, "1234 Khan st, VA 20222",
				"ahmad@mahmod.com", "2671804758", 4.33, "Computer Science");

		// This is to create the instance copy (an object) of 2nd Constructor in the
		// Child/Sub-Class "Student_Child_SubClass":
		Student_Child_SubClass stObj2 = new Student_Child_SubClass("John", "Hock", "4536 James st, VA 20345",
				"john.hock@hotmail.com", "8576498376");

		// This is to create the instance copy (an object) of the Child/Sub-Class
		// "Employee_Child_SubClass", which is the childClass of
		// "Student_Child_SubClass" and the
		// grandChild of "Parent_SuperClass":
		Employee_Child_SubClass empObj1 = new Employee_Child_SubClass("David", "Black", "Engineering", "12272001",
				"David St. CA", "black@david.com", "1254682468");

		// This is to create the instance copy (an object) of the parentClass
		// "Parent_SuperClass":
		Parent_SuperClass supObj1 = new Parent_SuperClass("Kapil", "Sharma", 40, "Mombai, India",
				"kapil_sharma@sonytv.com", "5648792314");

		System.out.println(stObj1);// This is to printOut the above object named: stObj1.
		stObj2.printInfo_of_2nd_Constructor();// This is to printOut the above object named: stObj2.
		System.out.println(empObj1);// This is to printOut the above object named: empObj1.
		System.out.println(supObj1);// This is to printOut the above object named: supObj1.

	}

}
