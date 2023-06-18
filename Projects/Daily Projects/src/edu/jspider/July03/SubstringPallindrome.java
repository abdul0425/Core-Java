package edu.jspider.July03;

public class SubstringPallindrome {

	static boolean isPallindrom(String s)
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
	
	static void subString(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				String s1=s.substring(i, j);
				if(isPallindrom(s1))
					System.out.println(s1);
			}
		}
	}
}
