package edu.jspider.String;

import java.util.Scanner;

public class Pallindrom {

	static boolean isPallindrom(String s)
	{
		s = s.toLowerCase();
		int i=0; int j= s.length()-1;
		while(i<j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = obj.next();
		
		System.out.println(isPallindrom(s1));
		
	}

}
