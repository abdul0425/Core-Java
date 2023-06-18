package edu.jspider.Sep12;

import java.util.Arrays;

public class CompareTwoArray {

	
	static boolean compare(int[]a,int[]b)
	{
		if(a.length!=b.length)return false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int[] a= {9,8,7,6};
		int[] b= {8,6,7,9};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(compare(a,b))
			System.out.println("Same Array !");
		else
			System.out.println("Not Same Array !");
	}

}
