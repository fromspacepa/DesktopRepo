package _6d__OOPs_Interface_Abstraction_Examples;

/* >>> interface:
 * ___An interface is a java reserved keyword, which declare a special type of class that only contains abstract methods
 * and as well as static and final variables.
 * 
 * ___Following are the important notes to be noted:
 * >>> 1): As a definition point of view interface is the blue print of a class, means that interface is exactly the same as class.
 * >>> 2): interface contains only static and final variables by default. by default it means that when you declare variable(s) inside
 * interface that/those variable(s) is/are static and final without specifying that/those variable(s) with the keyword 'static' or 'final'.
 * >>> 3): Within interface the method(s) is/are public by default, means the method(s) could be accessed without specifying them with
 * the keyword 'public'.
 * >>> 4): As well as, within interface the methods are abstract by default. (abstract means, that the method will only have the definition, but
 * not implementation/body of code)
 * 
 * ___Question: What is the difference between normal method and abstract method?
 * ___Answer: An abstract method only has the definition portion, but no implementation portion, Where normal method has both definition and 
 * implementation portions.
 * 
 * >>> Curiosity!!! 
 * ___Question: What is the purpose of method?
 * ___Answer: The method should have some functionality to perform certain tasks. 
 * (it could be only done when the method has implementation/code body, where you would write some codes so the method could perform some tasks)
 * 
 * ___Question: What is the usage of interface?
 * ___Answer: In real live time, there is something called 'Requirement'; suppose if a developer wants to implement some functionalities, he/she
 * would need some requirements, sometimes the developer has the requirements, but he/she does not know how to implement that/those requirements
 * so in such cases, the developer would wait till the design of application is completed, and the developer would just create some interfaces,
 * where the developer would have variables and methods (abstract methods, which are without implementations) within the interfaces, and as soon as
 * the design is ready, the developer would create new classes where the developer would implement those abstract methods and variables from interface
 * into new sub-classes. So, that is one of the scenario where interfaces could be useful in real time.
 */



    //Example of interface:
	interface TestInterface{
		// Example of variable created inside the body of interface:
		int myNum = 10;// By default this variable 'myNum' is static and final (without specifying the variable with keyword 'static' or 'final').
		
		// Example of method created inside the body of interface:
		void display();// By default this method is public (without specifying it with keyword 'public') and this is called abstract method, because
		               // it only has the definition portion, but no implementation portion.
	}
	
	public class Interface_Examples implements TestInterface{	

		public void display() {
				System.out.println("The value of static/final variable in the interface is: " + myNum);
		}
		public static void main(String[] args) {
			
		
		Interface_Examples obj = new Interface_Examples();
		obj.display();
}
		
			
		}

