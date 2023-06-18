package edu.jspider.StrongNumber;

public class StrongNumber {

	static boolean strong(int num)
	{
		int sum=0,temp=num;
		while(num>0)
		{
			int prod=1;
			int digit=num%10;
			for(int i=1;i<=digit;i++)
				prod*=i;
			sum+=prod;
			num/=10;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int num=145;
		System.out.println(num+" : "+strong(num));
	}
}
