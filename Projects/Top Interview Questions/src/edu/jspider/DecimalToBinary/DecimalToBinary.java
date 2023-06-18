package edu.jspider.DecimalToBinary;
import java.util.Scanner;
public class DecimalToBinary {

	static int binary(int num)
	{
		int sum=0, i=1;
		while(num>0)
		{
			int digit=num%2;
			sum=sum+i*digit;
			num/=2;
			i*=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number ?");
		int num=new Scanner(System.in).nextInt();
		System.out.println("Binary Number  :  "+binary(num));
	}
}
