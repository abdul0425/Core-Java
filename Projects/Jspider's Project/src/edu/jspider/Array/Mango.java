package edu.jspider.Array;

public class Mango {

	private Mango()
	{
		System.out.println("Mango Constructor");
	}
	
	public static Mango m1()
	{
		return new Mango();
	}
}
