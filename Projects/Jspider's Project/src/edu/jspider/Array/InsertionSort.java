package edu.jspider.Array;

import java.util.Scanner;

public class InsertionSort {

	public static void insertion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = i;
			int j = i - 1;
			while (j > -1 && a[i] < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;

		}
	}

	public static void pattern() {
		System.out.println();
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size ?");
		int size = obj.nextInt();
		int[] a = new int[size];
		System.out.println("values ?");
		for (int i = 0; i < a.length; i++) {
			a[i] = obj.nextInt();
		}
		System.out.println();
		System.out.print("Input Array : ");
		for (int n : a)
			System.out.print(n + " ");
		// pattern();
		insertion(a);
		pattern();
		System.out.print("Reverse Array : ");
		for (int n : a)
			System.out.print(n + " ");
	}
}
