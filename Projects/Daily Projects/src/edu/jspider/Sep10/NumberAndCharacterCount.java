package edu.jspider.Sep10;

public class NumberAndCharacterCount {

	
	static void count(String s)
	{
		int numCount=0;
		int charCount=0;
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				numCount++;
				sum+=c-'0';
			}
			else
				charCount++;
		}
		System.out.println("Number Count : "+numCount);
		System.out.println("Character Count : "+charCount);
		boolean isPrime=true;
		if(sum<=1)
		{
			System.out.println(sum+"  :  Not Prime");
			return;
		}
		for(int i=2;i<=sum/2;i++)
		{
			if(sum%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(sum+"  :  Prime");
		else
			System.out.println(sum+"  :  Not Prime");
	}
	
	
	
	public static void main(String[] args) {

		String s="A5L89AM12HM";
		count(s);
	}

}
