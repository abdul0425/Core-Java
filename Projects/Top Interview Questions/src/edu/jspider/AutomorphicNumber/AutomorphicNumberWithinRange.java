package edu.jspider.AutomorphicNumber;

import java.util.Scanner;

public class AutomorphicNumberWithinRange {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("start range ?");
		int start=obj.nextInt();
		System.out.println("end range ?");
		int end=obj.nextInt();
		int count=0;
		System.out.println("Automorphic Number  :  ");
		for(int i=start;i<=end;i++)
		{
			if(AutomorphicNumber.automorphicMethod2(i))
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Automorphic Count's  :  "+count);
	}
}
