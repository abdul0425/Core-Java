package edu.jspider.Aug30;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=s.nextInt(); int sum=0;
		int temp=num; int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		num=temp;
		while(num>0)
		{
			int prod=1;
			int digit=num%10;
			for(int i=1; i<=count; i++)
			{
				prod=prod*digit;
			}
			sum=sum+prod;
			num/=10;
		}
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not");
	}

}
