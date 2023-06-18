package edu.jspider.Sep01;

import java.util.Scanner;

public class InsertionSort {
	
	static void insertion(int[]a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>-1&&key<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			j--;
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
		insertion(a);
		System.out.println();

		System.out.print("Sorted Array : ");
		for (int n : a)
			System.out.print(n + " ");
	}

}
