package edu.jspider.Sep01;

import java.util.Scanner;

public class SelectionSort {
	
	static void selection(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
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
		selection(a);
		System.out.println();

		System.out.print("Sorted Array : ");
		for (int n : a)
			System.out.print(n + " ");
	}

}
