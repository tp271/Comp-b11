package sumofthree;

import java.util.Scanner;

public class Sumofthree {

	public static void main(String[] args) {

	Scanner scnr = new Scanner(System.in);
		
	System.out.println("Enter the first number:");	
		int num1 = scnr.nextInt();
		
	System.out.println("Enter the second number:");	
		int num2 = scnr.nextInt();
		
	System.out.println("Enter the third number:");	
		int num3 = scnr.nextInt();		
	
	int sum = num1 + num2 + num3;	
		
	System.out.println("The sum is:" + sum + "." );
	
	
	}

}
