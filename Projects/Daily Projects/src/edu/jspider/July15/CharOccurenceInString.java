package edu.jspider.July15;

public class CharOccurenceInString {

	static void charCount(String s)
	{
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			System.out.println(c+" -> "+count);
			s=s1;
		}
	}
}
