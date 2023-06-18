package edu.jspider.String;

public class SplitMethod {

	public static void main(String[] args) {
		String s1 = "Java is an Easy Language";
		String[] s = s1.split(" ");
		for(String a : s)
			System.out.println(a);
	}

}
