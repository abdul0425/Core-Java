package edu.jspider.Resources;

import java.util.Scanner;

public class PrimeNumberInRange {
	
	public static boolean isPrime(int number)
	{
		if(number<=1)
			return false;
		boolean isPrime = true;
		for(int j=2; j<=number/2; j++)
		{
			if(number%j == 0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Start Range = ");
		int start = obj.nextInt();
		System.out.println("Last Range = ");
		int last = obj.nextInt();
		int primeNumberCount = 0;
		
		for(int i=start; i<=last; i++)
		{
			if(isPrime(i)==true)
			{
				primeNumberCount++;
				System.out.println(i);
			}
		}
		System.out.println("Prime Number Count = "+primeNumberCount);
	}

}
