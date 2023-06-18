package edu.jspider.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumberWithinRange {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Start Range  ?");
		int start=obj.nextInt();
		System.out.println("End Range  ?");
		int end=obj.nextInt();
		int count=0;
		System.out.println("Armstrong Number  :  ");
		for(int i=start;i<=end;i++)
		{
			if(ArmstrongNumber.armstrong(i))
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Count's  :  "+count);
	}
}
