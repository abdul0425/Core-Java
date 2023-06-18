package edu.jspider.PatternProgram;

import java.util.Scanner;

public class CPattern {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number...");
		int num = obj.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == j || i == num)
					System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
