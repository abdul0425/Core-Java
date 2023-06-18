package edu.jspider.Sep11;

public class ReverseString {

	
	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		String s="12345";
		System.out.println(reverse(s));
	}

}
