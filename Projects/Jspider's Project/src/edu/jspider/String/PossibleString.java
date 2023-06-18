package edu.jspider.String;

import java.util.Scanner;

public class PossibleString {

	static String swap(String s, int i, int j) {
		char[] arr = s.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return new String(arr);
	}

	static void combination(String s, int start, int end) {
		if(start == end)
		{
			System.out.println(s);
			return;
		}
		for (int i = start; i <= end; i++) {
			String s1 = swap(s, start, i);
			combination(s1, start + 1, end);
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = obj.nextLine();
		int len = s.length();
		combination(s,0,len-1);
	}

}
