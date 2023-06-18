package edu.jspider.String;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ?");
		String s1 = sc.nextLine();
		String s2="";
		int len=s1.length();
		for(int i=len-1; i>=0; i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2))System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}

}
