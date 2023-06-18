package edu.jspider.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {

	static int length(int num)
	{
		int len=0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		return len;
	}
	
	static boolean armstrong(int num)
	{
		int temp=num,sum=0;
		int length=length(num);
		while(num>0)
		{
			int prod=1;
			int digit=num%10;
			for(int i=1;i<=length;i++)
				prod=prod*digit;
			sum+=prod;
			num/=10;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Number ?");
		int num=new Scanner(System.in).nextInt();
		System.out.println(num+" : "+armstrong(num));
	}
}
