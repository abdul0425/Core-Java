package edu.jspider.String;

public class StringClass {

	public static void main(String[] args) {
		String s1 = new String("Bengaluru");
		String s2 = new String("Bengaluru");
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		//Both will give the same output
		System.out.println(s2);
		System.out.println(s2.toString());
	}

}
