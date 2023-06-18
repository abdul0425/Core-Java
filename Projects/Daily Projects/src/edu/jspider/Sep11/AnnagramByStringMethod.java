package edu.jspider.Sep11;

import java.util.Arrays;

public class AnnagramByStringMethod {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();

		Arrays.sort(a1);
		Arrays.sort(a2);

		//System.out.println(new String(a1).equals(new String(a2)));
		System.out.println(Arrays.equals(a1, a2));
	}

}
