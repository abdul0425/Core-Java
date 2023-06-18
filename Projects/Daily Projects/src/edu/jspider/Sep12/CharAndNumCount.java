package edu.jspider.Sep12;

public class CharAndNumCount {

	static void count(String s)
	{
		int charCount=0;
		int numCount=0;
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
		System.out.println("Character Counts  :  "+charCount);
		System.out.println("Numbers Count  :  "+numCount);
		System.out.println("Sum of Number's  :  "+sum);
		if(sum<=1)
		{
			System.out.println("Not Prime .");
			return;
		}
		boolean isPrime=true;
		for(int i=2;i<sum/2;i++)
		{
			if(sum%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(sum+"  :  Prime Number.");
		else
			System.out.println(sum+"  :  Not Prime Number.");
	}
	
	
	
	public static void main(String[] args) {
		String s="abd156ulma45jid45ala124am";
		count(s);
	}

}
