package edu.jspider.PrivateConstructer;

public class PrivateConstructor {

	static int count;
	
	private PrivateConstructor()
	{
		count++;
	}
	
	
	public int countObject()
	{
		return count;
	}
	
	public static PrivateConstructor getInstance()
	{
		return new PrivateConstructor();
	}
}
