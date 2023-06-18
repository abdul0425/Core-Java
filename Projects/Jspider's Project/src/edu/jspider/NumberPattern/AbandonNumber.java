package edu.jspider.NumberPattern;

import java.util.Scanner;

public class AbandonNumber {

	public static void main(String[] args) {

		// Abandoned Number - 36.

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number ?");
		int num = obj.nextInt();
		int sum = 0;
		int temp = num;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (temp < sum)
			System.out.println(temp + " : is Abandoned Number.");
		else
			System.out.println(temp + " : Not Abandoned Number.");
	}

}
