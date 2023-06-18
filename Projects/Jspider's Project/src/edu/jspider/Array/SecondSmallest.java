package edu.jspider.Array;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size ?");
		int size = obj.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values : ");
		for(int i=0; i<size; i++)
		{
			arr[i] = obj.nextInt();
		}
		
		System.out.print("Input Array :");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		int first = arr[0];
		int second = arr[0];
		System.out.println();
		for(int j=1; j<size; j++)
		{
			if(first>arr[j])
			{
				second=first;
				first=arr[j];
				
			}
			else if((arr[j]!=first) && (first==second) || arr[j]<second)
			{
				second=arr[j];
			}
				
		}
		System.out.println();
		System.out.println("First Smallest Number : "+first);
		System.out.println();
		System.out.println("Second Smallest Number : "+second);
	}

}
