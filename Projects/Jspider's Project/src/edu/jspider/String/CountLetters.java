package edu.jspider.String;

public class CountLetters {

	public static void main(String[] args) {
		String s1 = "FullStackJavaDeveloper";
		String s2 = s1.toLowerCase();
		while(s2.length()>0)
		{
			char c = s2.charAt(0);
			String s = s2.replace(c+"", "");
			int count = s2.length()-s.length();
			System.out.println(c+" = "+count);
			s2=s;
		}
	}

}
