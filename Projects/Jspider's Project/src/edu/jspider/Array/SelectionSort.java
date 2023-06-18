package edu.jspider.Array;

import java.util.Scanner;

public class SelectionSort {
	public static void selection(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[minIndex]>a[j])
					minIndex=j;
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
	}
	static void pattern()
	{
		System.out.println();
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size ?");
		int size=obj.nextInt();
		int[] a=new int[size];
		System.out.println("values ?");
		for(int i=0; i<a.length; i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println();
		System.out.print("Input Array : ");
		for(int n:a)
			System.out.print(n+" ");
		selection(a);
		pattern();
		System.out.print("Reverse Array : ");
		for(int n:a)
			System.out.print(n+" ");
	}

}
