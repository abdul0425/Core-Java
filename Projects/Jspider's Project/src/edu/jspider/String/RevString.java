package edu.jspider.String;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String ?");
		String s1 = obj.nextLine();
		int len = s1.length();
		String s2 = " ";
		for(int i=len-1; i>=0; i--)
		{
			s2 = s2+s1.charAt(i);
		}
		System.out.println("Reverse String :"+s2);
	}

}
