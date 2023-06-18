package edu.jspider.Resources;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int number)
	{
		if(number<=1)
			System.out.println("Not Prime");
		boolean isPrime = true;
		for(int i=2; i<=number/2; i++)
		{
			if(number%i==0)
			{
				isPrime = false;
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
		System.out.println("Enter Number = ");
		int number = obj.nextInt();
		
		System.out.println(isPrime(number));
	}

}
