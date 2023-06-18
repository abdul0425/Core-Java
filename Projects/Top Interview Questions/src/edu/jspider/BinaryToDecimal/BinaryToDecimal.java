package edu.jspider.BinaryToDecimal;
import java.util.Scanner;
public class BinaryToDecimal {

	static int decimal(int num)
	{
		int sum=0,i=1;
		while(num>0)
		{
			int bit=num%10;
			sum=sum+bit*i;
			num/=10;
			i*=2;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter binary Number ?");
		int num=new Scanner(System.in).nextInt();
		System.out.println("Decimal Number  :  "+decimal(num));
	}
}
