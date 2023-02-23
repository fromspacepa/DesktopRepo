 package classAndObjectExamples;
 
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
	  * In general constructors are absolutely different than methods; The rules that applied to constructors
	  * you cannot use the same rules for your methods. You would not be able to write the methods as you write
	  * the constructors.
	  * Q: What are Constructors? 
	  * A: Constructors are basically the methods that will help you create Objects.
	  * Basically, constructors will help you create an instance(exact)  copy (object) of a Class.
	  * And you have so many options to create Constructors, you have different versions of it that you can create
	  * Constructors in different ways. But there are certain rules that you have to follow, which will be discussed
	  * in other classes of this ClassAndObjectExamples package. 
	  * 
	  * __Generally when you say:
	  * Student obj1 = new Student(John, 23); 
	  *                    This ^ part "Student(John, 23)" after new is the Constructor and this is what creates the Object
	  *                    and this is the way that you are calling the Constructor.
	  * 
	  * >>>>> Let's create a Class below, name of the Class is going to be: ClassStudent.
	  * ___NOTE: When you are creating a Class, as you know by now that it is going to be a Blue-Print OR a Template of something
	  * that you are going to be creating object(s) from it. Basically, it is like you are creating the structure of object such as 
	  * Form to be filled with some information.
	  * __NOTE: that when you are creating a Class in the E-Clips, you don't need to have a main method in your Class.
	  * Q: What is the main method?
	  * A: It is a method to print out the outcome of your code written in the E-Clips.
	  * __NOTE: while creating a Class you will only need to create Variables and Methods, you don't need to assign any Values to the Variables
	  * in the Class. You will assign Values to the Variables while you creating an Object of the Class.
	  * __Earlier we talked about Constructors, we said that Constructors are the methods that we create, so then when you want to create an Object
	  * of this Class below (that we are going to create) you will need to call the Constructor of it that creates the Object for you.
	  * And the rule is that you have to call/write the Access Modifier "public"; public is an Access Modifier, it is a modifier that can access to it
	  * from anywhere in your project, after "public" you will mention/write the name of a Class, which in this following example is the:
	  * "ClassStudent" then you will need to have an open Parenthesis "(" and then you will have close Parenthesis ")". 
	  * That is the rule, you cannot put anything else here. The section between open and close as a above^ is called Argument of the Constructor method.
	  * __NOTE: Argument(s) of the method(s) is the inputs to the method.
	  * 
	  * Example as shown below:
	  * 
	  * public ClassStudent (){
	  * 
	  *  
	  *  } Here "public" is the Access Modifier, "ClassStudent" is the class name, and "(Argument)" here between both Parenthesis 
	  * is called Argument which is the inputs to the method. 
	  * 
	  * 
	  * 
	  * 
	  * */
		
	
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
