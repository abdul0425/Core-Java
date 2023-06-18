package edu.jspider.Sep11;

import java.util.Arrays;

public class TwoArrayAreSame {

	static boolean same(int[]a,int[]b)
	{
		if(a.length!=b.length)return false;
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]==b[i]))return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int[] a1= {3,2,5,7};
		int[] a2= {2,3,7,5};
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(same(a1,a2))
			System.out.println("Same Array.");
		else
			System.out.println("Not Smae Array.");
		
	}

}
