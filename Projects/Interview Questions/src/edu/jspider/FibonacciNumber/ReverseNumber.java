package edu.jspider.FibonacciNumber;

public class ReverseNumber {

	static int rev=0;
	static int reverse(int n)
	{
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse no :  "+reverse(12345));
	}
}
