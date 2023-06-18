package edu.jspider.PatternProgram;

import java.util.Scanner;

public class HPattern {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = obj.nextInt();
		
		if(num<3)
		{
			System.out.println("Enter atleast 3.");
			return;
		}
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				if(i==j || j==num)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
