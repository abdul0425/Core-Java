package edu.jspider.ReverseNumber;
import java.util.Scanner;
public class ReverseNumber {

	static int reverse(int num)
	{
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum*10+digit;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number ?");
		int num=new Scanner(System.in).nextInt();
		System.out.println("Reverse Number  :  "+reverse(num));
	}
}
