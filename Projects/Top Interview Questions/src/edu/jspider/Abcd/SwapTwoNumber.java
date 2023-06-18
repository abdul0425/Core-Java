package edu.jspider.Abcd;

public class SwapTwoNumber {

	static void swap(int n1,int n2)
	{
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("Value of n1 &n2 : "+n1+" , "+n2);
	}
	public static void main(String[] args) {
		int n1=10,n2=20;
		swap(n1,n2);
	}
}
