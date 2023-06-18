package edu.jspider.July18;

import java.util.Scanner;

public class PsychoBar {

	static String adminUser="admin";
	static String adminPswd="admin";
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		String username;
		String password;
		System.out.println("______--* PSYCHO BAR *--______");
		System.out.println();
		System.out.println("1. Apply for Membership.");
		System.out.println("2. Admin Login");
		System.out.println("Choice  ?");
		int choice=obj.nextInt();
		
		
		if(choice==1)
		{
			System.out.println("Applied for member.");
		}
		else if(choice==2)
		{
			
			System.out.println("Enter Username : ");
			username=new Scanner(System.in).nextLine();
			if(adminUser.equals(username))
			{
				System.out.println("Enter Password : ");
				password=new Scanner(System.in).nextLine();
				if(adminPswd.equals(password))
					System.out.println("Login Successful");
				else
					System.out.println("Wrong Password.");
			}
			else
			{
				System.out.println("Wrong Username.");
			}
			
		}
	}

}
