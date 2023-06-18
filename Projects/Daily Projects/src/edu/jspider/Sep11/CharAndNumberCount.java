package edu.jspider.Sep11;

public class CharAndNumberCount {

	static boolean count(String s) {
		int charCount = 0;
		int numCount = 0;
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				numCount++;
				sum += c - '0';
			} else
				charCount++;
		}
		System.out.println("Character Counts  :  " + charCount);
		System.out.println("Number Counts  :  " + numCount);
		System.out.println("Number's Sum  :  " + sum);
		boolean isPrime = true;
		if (sum <= 1)
			return false;
		for (int i = 2; i <= sum / 2; i++) {
			if (sum % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		String s = "aiuf8nvd9ns7jkd5";
		System.out.println(count(s));
	}

}
