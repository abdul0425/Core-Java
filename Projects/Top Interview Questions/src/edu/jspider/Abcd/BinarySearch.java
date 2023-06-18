package edu.jspider.Abcd;

public class BinarySearch {

	static int search(int[]a,int search)
	{
		int start=0,end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(search==a[mid])
				return mid;
			else if(search<a[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
	static int search(int[]a,int start,int end,int search)
	{
		if(start>end)return -1;
		int mid=(start+end)/2;
		if(search==a[mid])
			return mid;
		else if(search<a[mid])
			return search(a,start,mid-1,search);
		else
			return search(a,mid+1,end,search);
	}
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(search(a,90));
		System.out.println(search(a,0,a.length-1,10));
	}
}
