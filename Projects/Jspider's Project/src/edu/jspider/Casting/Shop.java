package edu.jspider.Casting;

public class Shop {

	public Veg sell(String s)
	{
		if(s.equalsIgnoreCase("carrot"))return new Carrot();
		if(s.equalsIgnoreCase("potato"))return new Potato();
		System.out.println("Veg Not available.");
		return null;
	}
}
