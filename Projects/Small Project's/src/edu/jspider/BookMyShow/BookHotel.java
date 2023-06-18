package edu.jspider.BookMyShow;

import java.util.Scanner;

public class BookHotel {

	public void bookHotel()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many rooms ?");
		int room = sc.nextInt();
		System.out.println(" a/A for A/c or n/N for Non A/c");
		char c=sc.next().charAt(0);
		Hotel h=Hotel.getInstance();
		if(c=='a'||c=='A')
		{
			h.reserveACrooms(room);
		}
		else
		{
			h.reserveNonACrooms(room);
		}
		
	}
}
