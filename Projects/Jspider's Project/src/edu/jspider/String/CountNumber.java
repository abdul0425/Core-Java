package edu.jspider.String;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String ?");
		String s1 = sc.nextLine();
		int len = s1.length();
		int count = 0;
		for(int i=0; i<len; i++)
		{
			char c=s1.charAt(i);
			if(c>='0' && c<='9')
				count++;
		}
		System.out.println("Number's COunt : "+count);
	}

}
