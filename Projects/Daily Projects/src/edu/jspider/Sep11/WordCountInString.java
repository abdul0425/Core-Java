package edu.jspider.Sep11;

public class WordCountInString {
	
	static int wordCount(String s)
	{
		String[] s1=s.split(" ");
		return s1.length;
	}
	
	public static void main(String[] args) {
		String s="My name is Abdul Majid Alam";
		System.out.println(wordCount(s));
	}

}
