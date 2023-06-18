package edu.jspider.FibonacciNumber;
import java.util.Scanner;
public class NthFibonacciNumber {

	static int fibonacci(int n)
	{
		if(n<=1)return n;
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter a number ?");
		int n=new Scanner(System.in).nextInt();
		
		System.out.println(n+"'th fibo number  :  "+fibonacci(n));
	}

}
