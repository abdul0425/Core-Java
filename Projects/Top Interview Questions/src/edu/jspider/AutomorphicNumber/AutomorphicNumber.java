package edu.jspider.AutomorphicNumber;

public class AutomorphicNumber {

	// Method 1.
	static boolean automorphicMethod1(int num)
	{
		int square=num*num;
		while(num>0)
		{
			if(num%10!=square%10)return false;;
			num/=10;
			square/=10;
		}
		return true;
	}
	
	// Method 2.
	static boolean automorphicMethod2(int num)
	{
		int square=num*num;
		int temp=num;
		int len=0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		int digit=square%(int)Math.pow(10, len);
		if(temp==digit)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		int num=376;
		System.out.println(num+" : "+automorphicMethod1(num));
		System.out.println(num+" : "+automorphicMethod2(num));
	}
}
