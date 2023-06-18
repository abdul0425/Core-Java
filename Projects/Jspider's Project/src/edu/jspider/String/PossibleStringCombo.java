package edu.jspider.String;

import java.util.Scanner;

public class PossibleStringCombo {

	public static String swap(String s, int i, int j)
	{
		char[] c = s.toCharArray();
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		return new String(c);
	}
	
	public static void combination(String s, int start,int end)
	{
		if(start==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=start; i<=end; i++)
		{
			String s1=swap(s,start,i);
			combination(s1,start+1,end);
		}
	}
	
	
	public static void main(String[] args) {
		String s="abc";
		combination(s,0,s.length()-1);
	}

}
