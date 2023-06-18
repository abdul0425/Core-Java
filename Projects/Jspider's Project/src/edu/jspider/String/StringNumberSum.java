package edu.jspider.String;

public class StringNumberSum {

	public static void main(String[] args) {
		String s = "jav8ade12velo86per4";
		int count=0; int sum=0;
		System.out.print("Number's : ");
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(c>='0' && c<='9')
			{
				count++;
				sum=sum+c-'0';
				System.out.print(c+" ");
			}
		}
		System.out.println();
		System.out.println("Count = "+count);
		System.out.println("Sum = "+sum);
	}

}
