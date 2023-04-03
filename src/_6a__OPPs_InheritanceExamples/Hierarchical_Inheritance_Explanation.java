package _6a__OPPs_InheritanceExamples;

public class Hierarchical_Inheritance_Explanation {
	
	
	/*
	 * --->> Introduction of Hierarchy OR Hierarchical Inheritance:
	 * Hierarchical/Hierarchy Inheritance in Java is when more than one classes inherit a same class; then this is called Hierarchical/Hierarchy Inheritance;
	 * for example, a class 'B', 'C', and 'D' extends from a same class 'A'; such as follows:
	 *            
	 *             A <--(Class 'A') and this is the Super OR a Parent Class.
	 *         ____|____
	 *         |   |   |
	 *         B   C   D    
	 *         ^---^---^------(Class B, C, and D) and all these are the Sub-Classes OR Child Classes.
	 *         
	 * Note:
	 * Hierarchical OR Hierarchy Inheritance is happens during Inheritance, which it is part of the Inheritance Pillar in the concept of Object Oriented Programs (OOPs) in Java.
	 * 
	 *      For example:
	 *      Initially I have created a class and named: 'A' so this initially created class becomes a Super OR Parent Class since I am copying/inheriting the codes of it 
	 *      into the other classes, such as into the classes 'B', 'C', and 'D'. So while created the classes 'B', 'C', and 'D' and extended the class 'A' into them, all
	 *      these classes becomes the Sub-Classes OR Child Classes.
	 *      
	 * --->> Introduction on Inheritance Rules:
	 * All here are the rules of Inheritance while using Access Modifiers:
	 * 
 	 * 	   Super Class           Inherited By          Sub-Classes          Sub-Classes Client (Sub-Classes client is the sub-class of a sub-class)           
	 * 	   Members:			     Sub-Classes:          Can Access:          Can Access:
	 * ---------------------------------------------------------------------------------------------
	 *     public fields <----------> YES <----------------> YES <--------------> YES
	 *     public methods <---------> YES <----------------> YES <--------------> YES
	 *     protected fields <-------> YES <----------------> YES <--------------> NO (must use public method)
	 *     protected methods <------> YES <----------------> YES <--------------> NO
	 *     private fields <---------> NO* <----------------> NO* <--------------> NO (must use public method)
	 *     private methods <--------> NO* <----------------> NO* <--------------> NO 
	 *     constructor methods <----> NO* <----------------> YES (using super())  NO
	 *     overridden methods <-----> No* <----------------> YES (using super())  NO
	 * 
	 */

}
