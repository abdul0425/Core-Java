package edu.jspider.String;

import java.util.Scanner;

public class StringPallindrom {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = obj.next();
		int len = s1.length();
		String s = s1.toLowerCase();
		String s2 ="";
		
		for(int i=len-1; i>=0; i--)
		{
			s2 = s2+s.charAt(i);
		}
		if(s.equals(s2))
			System.out.println("Pallindrom");
		else
			System.out.println("Not Pallindrom");
	}

}
