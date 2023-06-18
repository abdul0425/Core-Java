package edu.jspider.NumberPatterns;

import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size ?");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				if(i%2==0)
					System.out.print(0+" ");
				else if((i+j)%2==0)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}

}
