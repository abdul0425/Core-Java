package edu.jspider.Abcd;

public class HCF {

	static int hcf(int n1, int n2) {
		int hcf = 0;
		int range = n1 > n2 ? n1 : n2;
		for (int i = 1; i <= range / 2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				hcf = i;
		}
		return hcf;
	}

	public static void main(String[] args) {
		System.out.println("HCF : " + hcf(24, 36));
	}
}
