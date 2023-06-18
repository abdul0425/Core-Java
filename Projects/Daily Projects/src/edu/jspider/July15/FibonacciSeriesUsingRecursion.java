package edu.jspider.July15;

public class FibonacciSeriesUsingRecursion {


	static int fibo(int n)
	{
		if(n<=1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		System.out.print("fibonacci series  :  ");
		for(int i=1;i<=10;i++)
			System.out.print(fibo(i)+" ");
	}
}
