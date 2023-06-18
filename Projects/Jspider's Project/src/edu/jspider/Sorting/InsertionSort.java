package edu.jspider.Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void insertion(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>-1&&key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
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
		insertion(arr);
		System.out.print("Sorted Array : ");
		for(int n:arr)
			System.out.print(n+" ");
	}

}
