package edu.jspider.Sep08;

public class BinarySearch {

	static int binary(int[]a,int s)
	{
		int start=0; int end=a.length-1;
		int mid=a.length/2;
		if(s==a[mid])return mid;
		while(s<a[mid])
		{
			start=mid-1;
		}
		
		while(s>a[mid]) end=mid+1;
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int s=5;
		binary(a,s);
	}
}
