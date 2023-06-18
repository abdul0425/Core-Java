package edu.jspider.CharacterPattern;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character ?");
		char c=sc.next().charAt(0);
		
		if(c>=97)
		{
			for(char i='a'; i<=c; i++)
			{
				for(char j='a'; j<=c; j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		else
		{
			for(char i='A'; i<=c; i++)
			{
				for(char j='A'; j<=c; j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
	}

}
