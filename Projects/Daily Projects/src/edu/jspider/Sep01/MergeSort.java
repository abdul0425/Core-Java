package edu.jspider.Sep01;

import java.util.Scanner;

public class MergeSort {
	static void merge(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		while (i < a.length) {
			c[k++] = a[i++];
		}
		while (j < b.length) {
			c[k++] = a[j++];
		}

	}

	static void split(int[] a) {
		if (a.length == 1)
				return;
		int[] left = new int[a.length / 2];
		int[] right = new int[a.length - left.length];
		int i;
		for (i = 0; i < left.length; i++)
				left[i] = a[i];
		for (int j = 0; j < right.length; j++) {
				right[j] = a[i++];
		}
		split(left);
		split(right);
		merge(left, right, a);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.print("Values : ");
		System.out.println();
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		
		//int[]a={5,4,3,2,1,};
		System.out.println();
		System.out.print("Input Array : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		split(a);
		System.out.print("Sorted Array : ");
		for (int n : a)
			System.out.print(n + " ");
	}

}
