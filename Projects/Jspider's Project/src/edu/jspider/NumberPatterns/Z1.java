package edu.jspider.NumberPatterns;

import java.util.Scanner;

public class Z1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ?");
		int num=sc.nextInt(); 
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				if(i+j==num+1||i==1||i==num)
					System.out.print(1);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
