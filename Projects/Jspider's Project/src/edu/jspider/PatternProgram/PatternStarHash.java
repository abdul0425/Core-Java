package edu.jspider.PatternProgram;

import java.util.Scanner;

public class PatternStarHash 
{

	public static void main(String[] args)
	{  
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number...");
		int num = obj.nextInt();
		for(int i=num; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				if(i==j)
				{
					System.out.print(j+" ");
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
