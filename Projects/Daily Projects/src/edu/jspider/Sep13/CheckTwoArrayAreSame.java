package edu.jspider.Sep13;

import java.util.Arrays;

public class CheckTwoArrayAreSame {

	static boolean compare(int[]a,int[]b)
	{
		if(a.length!=b.length)return false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,5,4,9};
		int[]b= {9,4,5,1,2};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(compare(a,b));
	}
}
