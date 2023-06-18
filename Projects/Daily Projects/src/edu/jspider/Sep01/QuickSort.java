package edu.jspider.Sep01;

import java.util.Scanner;

public class QuickSort {
	
	static void quick(int[]a,int start,int end)
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
					i++; j--;
				}
			}
			
		quick(a,start,j);
		quick(a,i,end);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.print("Values : ");
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		System.out.println();
		System.out.print("Input Array : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		quick(a,0,a.length-1);
		System.out.println();

		System.out.print("Sorted Array : ");
		for (int n : a)
			System.out.print(n + " ");
	}

}
