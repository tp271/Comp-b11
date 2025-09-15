package user;

import java.util.Scanner;

public class Userinfo {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = scnr.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = scnr.nextLine();
		
		System.out.println("Enter your major:");
		String major = scnr.nextLine();
		
		System.out.println("Your info is: " + lastName + "," + firstName + " and your major is " + major + ",");
			
		
	}

}
