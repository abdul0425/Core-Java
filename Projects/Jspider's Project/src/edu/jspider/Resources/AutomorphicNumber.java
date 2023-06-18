package edu.jspider.Resources;

import java.util.Scanner;

public class AutomorphicNumber 
{
	public static int automorphic(int num)
	{
		int length = Resource.length(num);
		int square = (int)Math.pow(num, 2);
		int result = square%(int)Math.pow(10, length);
		return result;
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Number ?");
		int num = obj.nextInt();
		
		if(automorphic(num)==num)
			System.out.println(num+" : Automorphic Number.");
		else
			System.out.println(num+" : Not Automorphic Number.");
	}

}
