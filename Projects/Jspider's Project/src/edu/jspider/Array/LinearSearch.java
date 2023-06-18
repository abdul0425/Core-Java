package edu.jspider.Array;

import java.util.Scanner;

public class LinearSearch {

	
	static int linearSearch(int[] a, int search)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)return i;
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array Size ?");
		int size=obj.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter values ?");
		System.out.println();
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println();
		System.out.println("Which Element you want to search ?");
		int search=obj.nextInt();
		int found=linearSearch(arr,search);
		System.out.println(search+" index is : "+found);
	}

}
