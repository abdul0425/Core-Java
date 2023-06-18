package edu.jspider.Exception;

import java.util.Scanner;

public class Vote {

	static void casteVote(int age) {
		if (age < 18)
			throw new ArithmeticException("Your Age is below 18, You are not adult enough to vote.");
		System.out.println("Casting vote is success.");
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = obj.nextInt();

		try {
			casteVote(age);
		} catch (ArithmeticException arg) {
			System.out.println(arg.getMessage());
		}

	}

}
