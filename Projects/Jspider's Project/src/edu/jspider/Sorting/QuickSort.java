package edu.jspider.Sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static void quick(int[] a,int start,int end)
	{
		if(start>=end)return;
		int i=start; int j=end;
		int pivot=a[(start+end)/2];
		while(i<=j)
		{
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				i++;
				j--;
			}
		}
		quick(a,start,j);
		quick(a,i,end);
	}
	
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Size ?");
		int size=obj.nextInt();
		int[] arr=new int[size];
		System.out.println("values : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println();
		quick(arr,0,arr.length-1);
		System.out.print("Sorted Array : ");
		for(int n:arr)
			System.out.print(n+" ");
	}

}
