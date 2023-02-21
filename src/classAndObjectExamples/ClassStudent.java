 package classAndObjectExamples;

public class ClassStudent {
		
	 /*
	  * >>>>> CLASS:
	  * Q: What is a Class? A: Class is a BluePrint OR a Template.
	  * Q: What is an Object? A: Object is the instance copy of a Class.
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
	  * In general constructors are absolutely different than methods; The rules that applied to constructors
	  * you cannot use them the same for your methods. You would not be able to write the methods as you write
	  * the constructors.
	  * Q: What are Constructors? A: Constructors are basically the methods that will help you create Objects.
	  * Basically, constructors will help you create an instance copy (object) of a Class.
	  * And you have so many options to create Constructors, you have different versions of it that you can create
	  * Constructors in different ways. But there are certain rules that you have to follow, which will be discussed
	  * in other classes of this ClassAndObjectExamples package. 
	  * 
	  * 
	  * 
	  */
	
	String name;//This is to create a String Variable.
	int age;//This is to create an integer Variable.
	
	public ClassStudent () {//This syntax is the Method.
		//This is the body of Method body.
		name = " ";
		age = 0;
	}
	
	public ClassStudent(String newName, int newAge) {
		name = newName;
		age = newAge;
	
	}
	 
	

}
