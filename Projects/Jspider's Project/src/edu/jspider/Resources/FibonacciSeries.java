package edu.jspider.Resources;

import java.util.Scanner;

public class FibonacciSeries {
	public static void fibonacci(int num) {
		int num1 = 0;
		int num2 = 1;

		System.out.print(num1 + " " + num2 + " ");
		for (int i = 1; i <= num; i++) {
			int series = num1 + num2;
			num1 = num2;
			num2 = series;
			System.out.print(series + " ");
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Range");
		int range = obj.nextInt();
		fibonacci(range);
	}

}
