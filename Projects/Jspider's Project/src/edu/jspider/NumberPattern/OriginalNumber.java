package edu.jspider.NumberPattern;

import java.util.Scanner;

public class OriginalNumber {

	public static void main(String[] args) {

		// Original Number 1234 = 1+2+3+4=10, 1+0=1 if 1 = Original Number

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number ?");
		int num = obj.nextInt();
		int temp = num;
		int sum1 = 0;

		while (num > 0) {
			int digit = num % 10;
			sum1 = sum1 + digit;
			num = num / 10;
		}
		System.out.println("Sum1 : " + sum1);
		int sum2 = 0;
		while (sum1 > 0) {
			int digit = sum1 % 10;
			sum2 = sum2 + digit;
			sum1 /= 10;
		}
		System.out.println("Sum2 : " + sum2);

		if (sum2 == 1)
			System.out.println(temp + " : is Original Number");
		else
			System.out.println(temp + " : is Not Original Number");
	}

}
