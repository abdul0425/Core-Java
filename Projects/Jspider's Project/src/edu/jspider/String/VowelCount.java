package edu.jspider.String;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		String s= s1.toLowerCase();
		int len = s.length();
		int count=0;
		for(int i=0; i<len; i++)
		{
			char c= s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println("Vowel's Count : "+count);
		
	}

}
