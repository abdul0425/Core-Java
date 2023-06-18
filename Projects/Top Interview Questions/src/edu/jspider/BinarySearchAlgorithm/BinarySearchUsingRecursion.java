package edu.jspider.BinarySearchAlgorithm;

public class BinarySearchUsingRecursion {

	static int search(int[] a,int start,int end,int search)
	{
		if(start>end)return -1;
		int mid=(start+end)/2;
		if(search==a[mid])
			return mid;
		else if(search<a[mid])
		{
			end=mid-1;
			return search(a,start,end,search);
		}
		else
		{
			start=mid+1;
			return search(a,start,end,search);
		}
	}
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(search(a,0,a.length-1, 12));
	}
}
