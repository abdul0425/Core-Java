package edu.jspider.Abcd;

import java.util.Scanner;

public class PerfectNumber {

	static boolean perfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("Start ?");
		int start=o.nextInt();
		System.out.println("End ?");
		int end=o.nextInt();
		int count=0;
		System.out.println("Perfect Number : ");
		for(int i=start;i<=end;i++)
		{
			if(perfect(i))
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Count : "+count);
	}
}
