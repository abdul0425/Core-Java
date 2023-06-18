package edu.jspider.FibonacciNumber;

import java.util.Scanner;

public class PrimeNumber {

	static boolean primeNumber(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Start Range ?");
		int start=s.nextInt();
		System.out.println("End Range ?");
		int end=s.nextInt();
		int count=0;
		System.out.print("Prime Number's  :  ");
		for(int i=start;i<=end;i++)
		{
			if(primeNumber(i))
			{
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Prime Number Count's  :  "+count);
		
	}
}
