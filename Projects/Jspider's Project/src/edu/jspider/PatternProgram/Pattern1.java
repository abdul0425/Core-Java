package edu.jspider.PatternProgram;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a number...");
		int num = obj.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for(int j=num; j>=1; j--)
			{
				if(i==j)
					System.out.print("*"+" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
