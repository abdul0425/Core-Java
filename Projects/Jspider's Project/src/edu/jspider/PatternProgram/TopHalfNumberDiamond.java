package edu.jspider.PatternProgram;

import java.util.Scanner;

public class TopHalfNumberDiamond {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number.");
		int num = obj.nextInt();
		
		
		for(int i=1; i<=num; i++)
		{
			for(int j=num-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(k);
			}
			for(int l=i-1; l>0; l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
