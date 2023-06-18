package edu.jspider.Sep11;

public class ReverseWordFromString {

	
	static String reverseWordFromString(String s)
	{
		String[] a=s.split(" ");
		String empty=" ";
		for(int i=0;i<a.length;i++)
			empty=empty+" "+reverseWord(a[i]);
		return empty.trim();
	}
	
	static String reverseWord(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
			s1+=s.charAt(i);
		return s1;
	}
	
	public static void main(String[] args) {
		String s="my name is abdul majid alam";
		System.out.println(reverseWordFromString(s));
	}

}
