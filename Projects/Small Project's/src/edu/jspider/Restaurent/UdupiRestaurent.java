package edu.jspider.Restaurent;

import java.util.Scanner;
public class UdupiRestaurent {

	public static void main(String[] args) 
	{
		System.out.println(".       Welcome To Udupi Restaurent       .");
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("\n1. Menu."
				+ "\n2. Order's."
				+ "\n3. Contact's."
				+ "\n4. Address."
				+ "\n5. About Us.");
		System.out.println();
		System.out.println("Enter Your Choice Sir...");
		int choice = obj.nextInt();
		if(choice == 1)
		{
			System.out.println("Menu");
		}
		else if(choice == 2)
		{
			System.out.println("Order's");
		}
		else if(choice == 3)
		{
			System.out.println("Contact's");
		}
		else if(choice == 4)
		{
			System.out.println("Address");
		}
		else if(choice == 5)
		{
			System.out.println("About");
		}
	}

}
