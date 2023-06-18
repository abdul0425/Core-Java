package edu.jspider.Resources;
import java.util.Scanner;

public class Categories {

	public static long factorial(long n) {

		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.print(n + " ! = ");
		return fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		long n = s.nextInt();
		long result = factorial(n);
		System.out.println(result);

	}

}
