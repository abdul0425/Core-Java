package edu.jspider.FibonacciNumber;

public class FibonacciNumberUsingRecursion {

	static int a=0,b=1;
	static void fibonacci(int n)
	{
		if(n>=1)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			fibonacci(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		fibonacci(9);
	}
}
