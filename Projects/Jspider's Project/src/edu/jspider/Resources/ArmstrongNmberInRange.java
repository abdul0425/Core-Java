package edu.jspider.Resources;

import java.util.Scanner;

public class ArmstrongNmberInRange {
	public static int armstrongRange(int num) {
		int length = Resource.length(num);
		int result = 0;

		while (num > 0) {
			int reminder = num % 10;
			result += (int) Math.pow(reminder, length);
			num /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Range :");
		int range = obj.nextInt();

		for (int i = 1; i <= range; i++) {
			if (armstrongRange(i) == i) {
				System.out.println(i);
			}
		}
	}

}
