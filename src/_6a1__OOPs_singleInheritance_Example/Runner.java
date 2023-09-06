package _6a1__OOPs_singleInheritance_Example;

public class Runner {
	
    public static void main(String[] args) {
		
   	
    	ParentClass objPar = new ParentClass("Wali", 21);
    	System.out.println("Example of single inheritance\n----------------------------------\n1) Parent Class:" + objPar);
    	ChildClass objSt = new ChildClass("Khan", "Wali", 21);
    	System.out.println("\n2) Child Class:" + objSt);
	}

}
