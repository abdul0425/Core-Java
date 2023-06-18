package edu.jspider.Resources;

import java.util.Scanner;

public class ArmstrongNumber {
	public static int armstrong(int num) {
		int length = Resource.length(num);
		int result = 0;
		while (num > 0) {
			int rem = num % 10;
			result = result + (int) Math.pow(rem, length);
			num /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = obj.nextInt();
		int temp = num;

		if (armstrong(num) == temp) {
			System.out.println("Armstrong.");
		} else {
			System.out.println("Not Armstrong.");
		}
	}

}
