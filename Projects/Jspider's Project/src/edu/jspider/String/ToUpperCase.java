package edu.jspider.String;

import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = obj.nextLine();
		String s2 = s1.toUpperCase();
		System.out.println(s1+" : "+s2);
	}

}
