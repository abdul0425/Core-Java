package edu.jspider.Inheritance;

public class Operations {

	public int length(int num)
	{
		int length=0;
		while(num>0)
		{
			length++;
			num/=10;
		}
		return length;
	}
	
	
}
