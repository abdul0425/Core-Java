package edu.jspider.Recursion;

public class FibonacciUsingRecursion {

	//static int a=0,b=1,c=0;
	static int fib(int n)
	{
//		if(n>1)
//		{
//			if(a==0&&b==1)System.out.print(" "+b);
//			c=a+b;
//			System.out.print(" "+c);
//			a=b;
//			b=c;
//			fib(n-1);
//		}
		
		if(n==1 || n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		System.out.print("Fibonacci Series  :  ");
		for(int i=1;i<=10;i++)
		{
			System.out.print(fib(i)+" ");
		}
	}
}
