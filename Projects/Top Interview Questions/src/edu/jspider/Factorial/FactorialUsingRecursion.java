package edu.jspider.Factorial;

public class FactorialUsingRecursion {

	static long factorial(int n)
	{
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(5+"! : "+factorial(5));
		System.out.println("================");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"! : "+factorial(i));
		}
	}
}
