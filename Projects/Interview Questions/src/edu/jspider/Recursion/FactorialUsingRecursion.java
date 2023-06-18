package edu.jspider.Recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {

	static long factorial(int n)
	{
		if(n<=1)return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		System.out.println(n+"! => "+factorial(n));
	}
	
}
