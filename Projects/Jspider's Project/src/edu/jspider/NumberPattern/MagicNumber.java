package edu.jspider.NumberPattern;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {

		// Magic Number = 1458.

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number ?");
		int num = obj.nextInt();
		int temp = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num /= 10;
		}
		System.out.println("Sum : " + sum);
		int num1 = sum;
		int rev = 0;
		while (num1 > 0) {
			int digit = num1 % 10;
			rev = rev * 10 + digit;
			num1 /= 10;
		}
		System.out.println("Reverse Number : " + rev);

		if (temp == rev * sum)
			System.out.println(temp + " : Magic Number");
		else
			System.out.println(temp + " : Not Magic Number");
	}

}
