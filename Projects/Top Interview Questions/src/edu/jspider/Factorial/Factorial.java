package edu.jspider.Factorial;

public class Factorial {

	static long factorial(int n)
	{
		if(n<=1)
			return 1;
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		return prod;
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
