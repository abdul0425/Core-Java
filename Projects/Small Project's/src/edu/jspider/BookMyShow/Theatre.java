package edu.jspider.BookMyShow;

public class Theatre {

	public int totalCount=50;
	private static Theatre t=null;
	private Theatre()
	{
		
	}
	
	
	public static Theatre getInstance()
	{
		if(t==null)
		{
			t=new Theatre();
		}
		return t;
	}
	
	public void reserveSeats(int seat)
	{
		if(seat>totalCount)
		{
			System.out.println(seat +"  Seats Not Available.");
			return;
		}
		totalCount=totalCount-seat;
		System.out.println(seat+ " Seats Reserved.");
		System.out.println(totalCount+"  seats available");
		
	}
	
	
}
