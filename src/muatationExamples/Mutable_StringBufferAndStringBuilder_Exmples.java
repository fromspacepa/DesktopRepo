

/* >>> Mutation concept in Java general explanation:
 * In the concept of Mutation we have Immutable (Which is String) and we have Mutable (which are StringBuffer and StringBuilder) 
 * ___Mutation is coming from something that is changeable or something that can be change.
 * The concept of Mutation in Java is referring to the object that can be Mutable or can be Immutable.
 * FOR INSTANCE: String is an object that cannot be change, means that String cannot be mutable and that is why String object is called Immutable.
 * And there are objects that can be change, such as: StringBuffer and StringBuilder classes and that is why they are called Mutable.
 * 
 * NOTE: 
 * __Basically Mutable/Immutable in this concept stands for: Changeable/Not Changeable, and by that it means that the location in the Memory (Heap)
 * is changeable and not changeable.
 * __Immutable: When you change the value of object (attribute) it will go and create a new object in the Heap memory.
 * __Mutable: When you change the value of object it will change the value in the same location in the Heap memory (kind of overriding on the existing
 * or current object).
 * __Mutation is basically considered to software developers, not to SDETs/QAs.
 * 
 * QUESTION: What is mutation for?
 * ANSWER: Mutation is a concept that is used in development and it is not something that SDETs will really care too much about it, because SDETs are 
 * not much concerned about the Mutation concept. SDETs only need to know that how Mutation works in Java or SDET just need to know that this is how
 * Java works. There are reasons that why SDETs need to know: 1st: You will get Interview Questions and there are other reasons too, which will be 
 * explained in the coming lessons/pages.
 * 
 * >>> Difference between String, StringBuffer, and StringBuilder:
 * 1) OBJECTS:
 * String objects are Immutable, whereas StringBuffer and StringBuilder are mutable objects.
 * 2) STORAGE:
 * String objects are stored in the Heap area and String Static Pool, whereas StringBuffer and StringBuilder are stored in the only Heap area.
 * 3) MEMORY:
 * String: if we change the value of a String a lot of times, it will allocate more memory, whereas as the StringBuffer and StringBuilder are mutable, both
 * StringBuffer and StringBuilder will allocate less memory.
 * 4) THREAD SAFE:
 * String class methods are not thread safe because they are non-synchronized, same the StringBuilder class methods are not thread safe and non-synchronized too,
 * but StringBuffer class methods are synchronized and that is why they are thread safe.
 * 5) PERFORMANCE:
 * Strings are slow if we talk about performance, but if we talk about StringBuffer's performance they are faster compared to Strings, and if we talk about
 * StringBuilder they are more faster the as compare to both StringBuffer and Strings.
 * 6) USAGE:
 * String: if the data is not changing frequently then we will use the String class, but if the data is changing frequently then we will use StringBuffer or 
 * StringBuilder depending on the condition/situation; If you want the method thread safe then you will need to use StrinfBuffer and if you want non-safe thread
 * then you will need to use the StringBuilder class. 
 * 
 */

package muatationExamples;

public class Mutable_StringBufferAndStringBuilder_Exmples {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hakim");
		System.out.println(sb);
		sb.append(" Gul");
		sb.append(" " + 420);
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		
		StringBuilder sbdr = new StringBuilder();
		System.out.println(sbdr);
		sbdr.append("StringBuilder");
		System.out.println(sbdr);
		sbdr.append(" " + 420);
		System.out.println(sbdr);
		

		String str = "Software";
		
		str.concat("Engineer");
		//System.out.println(str);
		
		//str = "Engineer";
		//System.out.println(str);
		
		//System.out.println(str.substring(0, 6));
		
		System.out.println(str);
		System.out.println((str.concat(" Engineer")));
		
	}
	
	
}
