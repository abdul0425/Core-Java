package edu.jspider.Sep12;

public class ReverseString {

	static String reverse(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1+=s.charAt(i);
		}
		return s1;
	}
	
	
	public static void main(String[] args) {
		String s="abcdef";
		System.out.println(reverse(s));
	}

}
