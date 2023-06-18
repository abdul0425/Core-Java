package edu.jspider.Sep13;

public class BinarySearch {

	
	static int binarySearch(int[]a,int s)
	{
		int start=0; int end=a.length-1;
		
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(s==a[mid])return mid;
			else if(s<a[mid]) end=mid-1;
			else  start=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50,60,70,80,90};
		int s=60;
		System.out.println(binarySearch(a,s));
	}
}
