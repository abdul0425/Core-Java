package edu.jspider.Inheritance;

public class ArmstrongCalc extends Operations{
	public int armstrong(int num,int length)
	{
		int sum=0; 
		while(num>0)
		{
			int product=1; int digit=num%10;
			for(int i=1; i<=length; i++)
			{
				product=product*digit;
			}
			sum=sum+product;
			num/=10;
		}
		return sum;
	}
}
