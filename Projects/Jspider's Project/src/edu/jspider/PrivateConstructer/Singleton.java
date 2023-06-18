package edu.jspider.PrivateConstructer;

public class Singleton {

	
	private static Singleton st=null;
	static int count;
	
	private Singleton()
	{
		count++;
	}
	
	public static int countObject()
	{
		return count;
	}
	
	public static Singleton getObject()
	{
		if(st==null)
			return st=new Singleton();
		return st;
	}
}
