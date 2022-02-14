package javaBasics;

public class IncrementsVSDecrements3 {

	public static void main(String[] args) {

		//INCREMENT VS DECREMENT:
//>>>Increment will be "++" (plus plus); This also means Increase variable by 1.
//>>>Decrement will be "--" (minus minus); This also means Decrease variable by 1.
//Then in Increment & Decrement we have Pre-Increment & Post-Increment; The same we have Pre-Decrement & Post-Decrement:

		//>>>PRE-INCREMENT:
//Pre-Increment first increases the value of variable by 1 and then prints the variable.
System.out.println("The flow execution of Pre-Increment:");
		int x = 1;//Here the Variable 'x' is declared and initialized with the assignment of value '1'
		System.out.println(x);//This will print the value of above^ Variable 'x' as '1'.
		System.out.println(++x);//This is Pre-Increment, it will print the value of 'x' as '2' because of flow execution of Pre-Increment.
		System.out.println(x);//Now it will still print the value of 'x' as '2' because of changes happened above^ by the flow execution of Pre-Increment.
	
		//>>>POST-INCREMEMNT:
//Post-Increment first prints the variable and then increase the value of variable.
System.out.println("The flow execution of Post-Increment:");
		int y = 2;//Here the Variable 'y' is declared and initialized with the assignment of value '2'
		System.out.println(y);//This will print the value of above^ Variable 'y' as '2'
		System.out.println(y++);//This is Post-Increment, it will still print the value of 'y' as '2' because of the flow execution of Post-Increment.
		System.out.println(y);//Now it will print the value of 'y' as '3' because of changes happened above^ by the flow execution of Post-Increment.
		
		//>>>PRE-DECREMENT:
//Pre-Decrement first decreases the value of variable by 1 and then prints the variable.
System.out.println("The flow execution of Pre-Decrement:");
		int a = 3;//Here the Variable 'a' is declared and initialized with the assignment of value '3'
		System.out.println(a);//This will print the value of above^ Variable 'b' as '3'.
		System.out.println(--a);//This is Pre-Decrement, it will print the value of 'b' as '2' because of flow execution of Pre-Decrement.
		System.out.println(a);//Now it will still print the value of 'b' as '2' because of changes happened above^ by the flow execution of Pre-Decrement.
	
		//>>>POST-DECREMEMNT:
//Post-Decrement first prints the variable and then increase the value of variable.
System.out.println("The flow execution of Post-Decrement:");
		int b = 4;//Here the Variable 'b' is declared and initialized with the assignment of value '4'
		System.out.println(b);//This will print the value of above^ Variable 'b' as '4'
		System.out.println(b--);//This is Post-Decrement, it will still print the value of 'b' as '4' because of the flow execution of Post-Decrement.
		System.out.println(b);//Now it will print the value of 'b' as '3' because of changes happened above^ by the flow execution of Post-Decrement.
		

	}

}
