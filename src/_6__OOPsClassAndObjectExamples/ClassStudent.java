 package _6__OOPsClassAndObjectExamples;
 
public class ClassStudent {
	
	 /*
	  * >>>>> CLASS:
	  * Q: What is a Class? A: Class is a BluePrint OR a Template.
	  * Q: What is an Object? A: Object is the instance(Exact) copy of a Class.
	  * (Every copy of a Class that we make is called an Object.)
	  * 
	  * >>> Members of a Class:
	  * Q: What are the members of a Class? A: The members of a Class are: 
	  * __1) Methods (Functions)   
	  * __2) Variables (Fields)
	  * Basically, Class is made of Methods and Variables.
	  * 
	  * __Methods (Functions):
	  * In terms of Methods, we have different types of Methods. In general, we have Constructors
	  * and then you have general Methods and with-in Methods we have different sections such as:
	  * _Getter Methods, _Sitter Methods, _Static Methods, _Non-Static Methods, also you have
	  * special Methods such as: Two Strings and etc.
	  * So, we have plenty of these methods, but one of the thing that all these methods are written
	  * the same way but every methods is doing different thing.
	  * Basically, all the methods in general have same structure but then we customize that structure
	  * of a method to do something different.
	  * 
	  * >>> Constructors:
	  * Q: What are Constructors? 
	  * A: Constructors are basically the methods that will help you create Objects.
	  * Also the job of Constructor is to initialize all of the Variables of the Class.
	  * 
	  * >>>>> Step by step instructors how to create a class:
	  * --> Declare your Variables.
	  * --> Create your Default Constructor
	  * --> Initialize your early declared Variables in the body of Default Constructor.
	  * --> Create your Parameterized Constructor.
	  * --> Assign the Variables of the Arguments to the early initialized Variables in the body of Parameterized Constructor.
	  * 
	  * __NOTE: The Variables that you will have in the Arguments/Parameters of the Parameterized Constructor are going to be called by the Object Class,
	  * OR that from the Object Class the Values will be assigned to the Variables that you have in the Arguments/Parameters of the Parameterized Constructor,
	  * and then these Variables that you have in the Arguments/Parameters of the Parameterized Constructor will be then assigned to the Variables that you have
	  * in the body of Parameterized Constructor, and then these Variables that you have in the body of Parameterized Constructor will be assigned to the initially
	  * Declared and Initialized Variables. This way the Constructor will get implemented by creating the Object(s) as follows and visit the RunnerClassAsAnObjectOfClass.
	  */
	
	String name;//This is to create a String Variable.
	int age;//This is to create an integer Variable.
	
	public ClassStudent () {//This Constructor method is called: Default Constructor, because the argument of this constructor is empty (it has no parameters).
		name = " ";
		age = 0;
	}
	
	public ClassStudent(String newName, int newAge) {//This Constructor method is called: Parameterized Constructor, because the argument of this constructor is parameters.
		name = newName;
		age = newAge;
	
	}
	 
	/*
	 * >>>>> Understanding Terminology of every portion/section of the above Parameterized Constructor:
	 * --> "public" is the Access modifier.
	 * --> "ClassStudent" is the Name of Constructor method.
	 * --> "(String newName, int newAge)" is the Arguments/Parameters (Think of Arguments/Parameters as the inputs of the Constructor method).
	 * --> All together the "public ClassStudent(String newName,int newAge)" is the Definition of the Constructor method.
	 * --> All together the "ClassStudent(String newName, int newAge)" is the Signature of the Constructor method.
	 * --> From open to close bracket "{
	 *      name = newName;
	 *      age = newAge;
	 *    }" is Implementation of Constructor method. So think of every constructor's portions/sections the same way.
	 *    
	 */
	

}
