package edu.jspider.Resources;

import java.util.Scanner;

public class AutomorphicNumberInRange
{
	public static int automorphicRange(int num)
	{
		int length = Resource.length(num);
		int square = (int)Math.pow(num,2);
		int result = square%(int)Math.pow(10, length);
		return result;
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Number ?");
		int range = obj.nextInt();
		
		for(int i=1; i<=range; i++)
		{
			if(automorphicRange(i)==i)
			{
				System.out.println(i);
			}
		}
	}

}
