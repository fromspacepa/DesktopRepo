package _7__SpecifierExamples;

/*
 * >>> Keyword "final" is also called: specifier or Non-Access Modifier
 * 
 * NOTE: 
 * The Keyword (Non-Access modifier "final" has 3-three usage cases, such as follows: 
 * 1). final attributes/variables:
 * ____You cannot assign a new value to the final variable once value is assigned at the first time. 
 * 2). final methods:
 * ____Methods that are final cannot be overridden/modified after initially modification, even in
 * child/sub-classes after inherited. 
 * 3). final classes: 
 * ____Classes that are final cannot be inherited from a parent/super-class. 
 * 
 * >>> Basically "final" will make all attributes, methods, and classes not changeable.
 * 
 * NOTE: 
 * The Keyword or Non-Access modifier "final" goes after Access modifiers.
 * Basically, all Non-Access modifiers goes after Access modifiers
 */

// Example of final class:
public final class FinalKeywordExample {

		//Example of final attribute/variable that is encapsulated:
		private final int myNum = 10;
		
		// Example of final attribute/variable:
		final int x = 10;
		// x = 5;// Here you can see the attribute is not changeable anymore.
	

	// Example of final method:
	@Override
	public final String toString() {
		return "This is final method, it is not changeable!!!";
	}

}
