package edu.jspider.FibonacciNumber;

public class PrimeNumberUsingRecursion {

	static int count=0,i=1;
	static int prime(int n)
	{
		if(i<=n)
		{
			if(n%i==0)
				count++;
			i++;
			prime(n);
		}
		return count;
	}
	
	public static void main(String[] args) {
			if(prime(10)==2)
				System.out.print("Prime Number ! ");
			else
				System.out.print("Not Prime Number ! ");
	}
}
