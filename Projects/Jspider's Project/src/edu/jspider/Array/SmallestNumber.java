package edu.jspider.Array;

import java.util.Scanner;

public class SmallestNumber {

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
		int min = arr[0];
		
		for(int j=1; j<size; j++)
		{
			if(min>arr[j])
				min=arr[j];
		}
		System.out.println("Smallest Number : "+min);
	}

}
