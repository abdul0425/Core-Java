package edu.jspider.PatternProgram;

import java.util.Scanner;

public class LeftHalfDiamond {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number.");
		int num = obj.nextInt();
		int star=1;
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*"+" ");
			}
			if(i<num/2)star++;
			else star--;
			System.out.println();
		}
	}

}
