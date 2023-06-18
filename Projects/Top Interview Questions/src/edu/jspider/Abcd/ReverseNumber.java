package edu.jspider.Abcd;

public class ReverseNumber {

	static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		return rev;
	}
	public static void main(String[] args) {
		System.out.println("Reverse : "+reverse(12345));
		System.out.println("Reverse : "+reverse("abcd"));
	}
}
