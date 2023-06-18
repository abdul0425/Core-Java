package edu.jspider.StrongNumber;

import java.util.Scanner;

public class StrongNumberWithinRange {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("start Range ?");
		int start=obj.nextInt();
		System.out.println("end Range ?");
		int end=obj.nextInt();
		int count=0;
		System.out.println("Strong  Number's  :  ");
		for(int i=start;i<=end;i++)
		{
			if(StrongNumber.strong(i))
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Strong Number's count  :  "+count);
	}
}
