package edu.jspider.PrimeNumber;
import java.util.Scanner;
public class PrimeNumber {

	static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		System.out.println("Enter number  ?");
		int num=new Scanner(System.in).nextInt();
		System.out.println(num+" : "+isPrime(num));
	}
}
