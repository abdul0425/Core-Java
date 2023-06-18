package edu.jspider.Sep08;

public class LinearSearch {
	
	static int linear(int[]a,int s)
	{
		for(int i=0;i<a.length;i++)
		{
			if(s==a[i])
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a= {9,8,7,6,5,4,3,2,1};
		int s=2;
		System.out.println("Index : "+linear(a,s));
	}
}
