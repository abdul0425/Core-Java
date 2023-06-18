package edu.jspider.FibonacciSeries;

public class FibonacciSeries {

	static int fibonacci(int n)
	{
		if(n==0 || n==1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		int n=10;
		System.out.print("Fibonacci Series  :  ");
		for(int i=1;i<=n;i++)
			System.out.print(fibonacci(i)+" ");
	}
}
