package edu.jspider.Array;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enetr Size ?");
		int size = obj.nextInt();
		int[] arr = new int[size];
		System.out.print("Value : ");
		for(int i=0; i<size; i++)
		{
			arr[i] = obj.nextInt();
		}
		for(int n : arr)
			System.out.print(n+" ");
		System.out.println();
		System.out.println("enter Number to search for 2nd occurence from given array ?");
		int first = obj.nextInt();
		int found=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]==first)
			{
				found++;
				if(found==2)
				{
					System.out.println("2nd Occurence Index for : "+ first+" : is :"+i);
					break;
				}
			}
		}
	}

}
