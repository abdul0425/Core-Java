package edu.jspider.BookMyShow;

import java.util.Scanner;

public class BookingApp {

	public void bookTickets()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many seats ?");
		int seat = sc.nextInt();
		
		Theatre th=Theatre.getInstance();
		th.reserveSeats(seat);
	}
}
