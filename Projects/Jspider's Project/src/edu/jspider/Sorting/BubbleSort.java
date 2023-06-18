package edu.jspider.Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void bubble(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		bubble(arr);
		System.out.print("Sorted Array : ");
		for(int n:arr)
			System.out.print(n+" ");
		
	}

}
