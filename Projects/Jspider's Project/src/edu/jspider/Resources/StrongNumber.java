package edu.jspider.Resources;

import java.util.Scanner;

public class StrongNumber 
{
	public static int strongNumber(int num)
	{
		int length = Resource.length(num);
		int sum = 0;
		while(num!=0)
		{
			int digit = num%10;
			sum+=Resource.factorial(digit);
			num/=10;
		}
		return sum;
	}
	
//	Strong Number List : 1,2,145,40585..
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Number :");
		int num = obj.nextInt();
		int temp = num;
		
		if(strongNumber(num)==temp)
			System.out.println(temp+" Strong Number");
		else
			System.out.println(temp+" Not Strong Number");
		
		
	}

}
