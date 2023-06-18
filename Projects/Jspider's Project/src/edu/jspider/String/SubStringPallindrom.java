package edu.jspider.String;

import java.util.Scanner;

public class SubStringPallindrom {

	public static boolean isPallindrome(String s)
	{
		s=s.toLowerCase();
		int i=0; int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String");
//		String s=sc.nextLine();
		String s="Malayalam";
		
		for(int i=0; i<s.length()-1; i++)
		{
			for(int j=i+2; j<=s.length(); j++)
			{
				String s1=s.substring(i,j);
				if(isPallindrome(s1))
					System.out.println(s1);
			}
		}
	}

}
