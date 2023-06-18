package edu.jspider.July17;

public class CountCharAndNumber {

	static int numCount=0;
	static int charCount=0;
	static int sum=0;
	
	static void count(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				numCount++;
				sum+=c-'0';
			}
			else
				charCount++;
		}
	}
}
