package edu.jspider.Array;

import java.util.Scanner;

public class QuickSort {

	static void qSort(int[] a,int start,int end)
	{
		if(start>=end)return;
		int pivot=a[(start+end)/2];
		int i=start; int j=end;
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
		
		qSort(a,start,j);
		qSort(a,i,end);
		
	}
	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array Size ?");
		int size=obj.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter values ?");
		System.out.println();
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println();
		qSort(arr,0,arr.length-1);
		System.out.println();
		for(int n:arr)
			System.out.print(n+" ");
	}

}
