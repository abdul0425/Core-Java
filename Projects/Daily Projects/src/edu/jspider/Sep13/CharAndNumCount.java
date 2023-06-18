package edu.jspider.Sep13;

public class CharAndNumCount {

	static void count(String s)
	{
		
		int numCount=0;
		int charCount=0;
		int sum=0;
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
		System.out.println("Character Count  :  "+charCount);
		System.out.println("NumberCounts  :  "+numCount);
		System.out.println("Number's Sum   :   "+sum);
		if(sum<=1)
		{
			System.out.println(sum+"   :   Not Prime.");
			return;
		}
		boolean isPrime = true;
		for(int i=2;i<=sum/2;i++)
		{
			if(sum%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(sum+"   :   Prime Number.");
		else
			System.out.println(sum+"   :   Not Prime.");
	}
	
	
	public static void main(String[] args) {
		String s="skdj54cdlkc78ddlk55cc5cdc5";
		count(s);
	}
}
