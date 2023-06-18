package edu.jspider.PatternProgram;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number...");
		int num = obj.nextInt();
		int star = 1; int hash = num-1;
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			for(int k=num-1; k>=i; k--)
			{
				System.out.print("#"+" ");
			}
			star++;
			hash--;
			System.out.println();
		}
	}

}
