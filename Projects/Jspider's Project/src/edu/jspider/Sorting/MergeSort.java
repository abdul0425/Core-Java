package edu.jspider.Sorting;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int[] a,int[] b,int[] c)
	{
		int i=0; int j=0; int k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				k++;
				i++;
			}
			else
			{
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			k++;
			j++;
		}
	}
	
	public static void split(int a[])
	{
		if(a.length==1)return;
		int[] left=new int[a.length/2];
		int[] right=new int[a.length-left.length];
		int i;
		for(i=0;i<left.length;i++)
		{
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=a[i];
			i++;
		}
		split(left);
		split(right);
		merge(left,right,a);
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
		split(arr);
		System.out.print("Sorted Array : ");
		for(int n: arr)
			System.out.print(n+" ");
	}

}
