package edu.jspider.BookMyShow;

public class Hotel {
	int roomAC=10;
	int roomNonAC=10;
	
	private static Hotel h=null;
	
	private Hotel()
	{
		
	}
	public static Hotel getInstance()
	{
		if(h==null)
		{
			return h=new Hotel();
		}
		return h;
	}
	
	public void reserveACrooms(int room)
	{
		if(room>roomAC)
		{
			System.out.println(room+" Sorry Rooms not available.");
			return;
		}
		roomAC=roomAC-room;
		System.out.println(room+" Room Booked");
		System.out.println(roomAC+"  Available Ac rooms");
	}
	
	public void reserveNonACrooms(int room)
	{
		if(room>roomNonAC)
		{
			System.out.println(room+" Sorry Rooms not available.");
			return;
		}
		roomNonAC=roomNonAC-room;
		System.out.println(room+" Room Booked");
		System.out.println(roomNonAC+"  Available Non Ac rooms");
	}
}
