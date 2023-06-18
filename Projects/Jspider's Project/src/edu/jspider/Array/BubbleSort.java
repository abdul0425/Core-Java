package edu.jspider.Array;

import java.util.Scanner;

public class BubbleSort {
	public static void bubble(int[] a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void pattern()
	{
		System.out.println();
		System.out.println("-------------------------");
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
		//pattern();
		bubble(a);
		pattern();
		System.out.print("Reverse Array : ");
		for(int n:a)
			System.out.print(n+" ");
	}

}
