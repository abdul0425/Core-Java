package edu.jspider.String;

import java.util.Scanner;

public class SubPallindrom {

	
	
	public static boolean isPallindrom(String s)
	{
		int i=0; int j=s.length()-1;
		while(i!=j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=obj.nextLine();
		for(int i=0; i<s.length()-1;i++)
		{
			for(int j=i+2; j<=s.length(); j++)
			{
				String s1=s.substring(i, j);
				if(isPallindrom(s1))
					System.out.println(s1);
			}
		}
	}

}
