package edu.jspider.InterviewQuestions;

import java.util.Scanner;

public class FibonacciRecursion {

	public static int fib(int i)
	{
		if(i==0||i==1)return 1;
		return fib(i-1)+fib(i-2);
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Range ?");
		int num=obj.nextInt();
		System.out.print("Fibonacci Series for Range "+num+" : ");
		for(int i=0; i<=num; i++)
		{
			int fibo = fib(i);
			System.out.print(fibo+" ");
		}
		
		
		
	}

}
