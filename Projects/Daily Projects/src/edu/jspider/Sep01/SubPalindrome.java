package edu.jspider.Sep01;

public class SubPalindrome {
	
	static boolean isPalli(String s)
	{
		int i=0; int j=s.length()-1;
		while(i<j)
			{
			if(s.charAt(i)!=s.charAt(j))
					return false;
			else
				i++;j--;
			}
		return true;
	}
	static void subString(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				String s1=s.substring(i, j);
				if(isPalli(s1))
					System.out.println(s1);
			}
		}
	}
	
	public static void main(String[] args) {
		subString("123454321");
	}

}
