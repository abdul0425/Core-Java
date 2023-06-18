package edu.jspider.String;

import java.util.Scanner;

public class PossibleStringCombination {
	
	//Swapping Method Created.
	public static String swap(String s, int i, int j)
	{
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return new String(a);
	}
	
	
	//Method Created for String Combination.
	public static void permutation(String s, int start, int end)
	{
		if(start == end)
		{
			System.out.println(s);
			return;
		}
		
		for(int i=start; i<=end; i++)
		{
			String s1 = swap(s, start, i);
			
			//Using Recursion Concept
			permutation(s1, start+1, end);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s1 = obj.next();
		int len = s1.length();
		
		permutation(s1,0,len-1);
	}

}