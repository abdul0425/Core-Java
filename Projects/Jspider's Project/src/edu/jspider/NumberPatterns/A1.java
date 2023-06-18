package edu.jspider.NumberPatterns;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1||i==n/2)
					System.out.print('a');
				else if(j==1||j==n)
					System.out.print('a');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
