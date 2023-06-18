package edu.jspider.AllAlphabets;

import java.util.Scanner;

public class A {

	static void patternA(int[][]a,int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n/2+1 || j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Size ?");
		int n=obj.nextInt();
		int[][] a=new int[n][n];
		patternA(a,n);
	}
}
