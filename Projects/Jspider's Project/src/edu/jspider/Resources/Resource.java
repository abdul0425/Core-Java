package edu.jspider.Resources;

public class Resource {

	
	// Length Method.
	public static int length(int num)
	{
		int len=0;
		while(num!=0)
		{
			len++;
			num/=10;
		}
		return len;
	}
	
	
	// Factorial Method.
	public static int factorial(int num)
	{
		int fact = 1;
	
		for(int i=1; i<=num; i++)
		{
			fact =  fact*i;
		}
		return fact;
	}
	
}
