package edu.jspider.Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void selection(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minIndex]>arr[j])
					minIndex=j;
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
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
		selection(arr);
		System.out.print("Sorted Array : ");
		for(int n:arr)
			System.out.print(n+" ");
	}

}
