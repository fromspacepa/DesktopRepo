package _2__SelectionsExamples;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculate your favorite numbers:");
		int cal = 10, cal1 = 20, res ;
		res = sc.nextInt();
		String calculation = "Addition";
		switch(calculation) {
		case("Multiplication"):
			res = cal *= cal1;
		System.out.println("Multiplication:" + res);
		break;
		case("Addition"):
			res = cal1 += cal;
		System.out.println("Addition:" + res);
		break;
			
			
		
			
		}
		}



	

}
