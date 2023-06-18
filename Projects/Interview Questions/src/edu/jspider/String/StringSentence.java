package edu.jspider.String;

import java.util.Arrays;
	
public class StringSentence {

	static void count(char[] c) {
		int i;
		for (i = 0; i < c.length; i++) {
			char temp = c[i];
			int count = 0;
			for (int j = i; j < c.length; j++) {
				
				if (temp == c[j])
					count++;
				else {
					i = j;
					break;
				}
			}
			System.out.println(temp + "  :  " + count);
		}
	}

	public static void main(String[] args) {
		// String s1="is2Thi1sT4est3a"; // Output -> This is a Test
		String s2 = "aappllee"; // a-1,p-2,l-1,e-1.
		char[] c = s2.toCharArray();
		Arrays.sort(c);
		for (char a : c)
			System.out.print(a);
		System.out.println();
		count(c);

	}
}
