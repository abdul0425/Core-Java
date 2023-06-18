package edu.jspider.Composition;

public class StringCombo {

	static String swap(String s, int start, int end) {
		char[] c = s.toCharArray();
		for (int i = start; i < end; i++) {
			char temp = c[i];
			c[i] = c[end];
			c[end] = temp;
		}
		return new String(c);
	}

	static void combo(String s, int start, int end) {
		if (start == end) {
			System.out.println(s);
			return;
		}
		for (int i = start; i <= end; i++) {
			String s1 = swap(s, start, i);
			combo(s1, start + 1, end);
		}

	}

	public static void main(String[] args) {
		String s = "abcd";
		int len = s.length();
		combo(s, 0, len - 1);
	}

}
