package edu.jspider.Sep02;

import java.util.Scanner;

import edu.jspider.Resources.MergeSort;

public class Merge {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size ?");
		int size=obj.nextInt();
		int[]a=new int[size];
		System.out.println("Values ?");
		for(int i=0;i<size;i++)
			a[i]=obj.nextInt();
		MergeSort.split(a);
		System.out.println();
		System.out.print("Sorted Array : ");
		for(int n:a)
			System.out.print(n+" ");
	}

}
