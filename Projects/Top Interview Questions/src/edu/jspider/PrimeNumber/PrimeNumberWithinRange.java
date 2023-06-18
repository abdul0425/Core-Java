package edu.jspider.PrimeNumber;

import java.util.Scanner;

public class PrimeNumberWithinRange {

	
	static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		boolean isPrime=true;
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("start Range ?");
		int start=obj.nextInt();
		System.out.println("End Range ?");
		int end=obj.nextInt();
		System.out.print("Prime Number's  :  ");
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i))
			{
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Prime Number Count's  :  "+count);
	}
}
