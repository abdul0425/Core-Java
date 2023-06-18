package edu.jspider.Sep11;

public class StringPallindrome {

	static boolean isPallindrome(String s)
	{
		int i=0; int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String s="123454321";
		System.out.println(isPallindrome(s));
	}

}
