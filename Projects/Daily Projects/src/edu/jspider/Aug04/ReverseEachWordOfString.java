package edu.jspider.Aug04;

public class ReverseEachWordOfString {

	
	static String wordReverse(String s)
	{
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--)
			s1+=s.charAt(i);
		return s1;
	}
	
	static void reverse(String s)
	{
		String[] a=s.split(" ");
		String s1=" ";
		for(int i=0;i<a.length;i++)
		{
			String rev=wordReverse(a[i]);
			s1=s1+rev;
		}
		String s2=s1.trim();
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		String s="my name is abdul majid alam";
		reverse(s);
	}

}
