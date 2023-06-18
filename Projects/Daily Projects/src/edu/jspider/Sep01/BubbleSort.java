package edu.jspider.Sep01;

import java.util.Scanner;

public class BubbleSort {

	static void bubble(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
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
		bubble(a);
		System.out.println();

		System.out.print("Sorted Array : ");
		for (int n : a)
			System.out.print(n + " ");
	}

}
