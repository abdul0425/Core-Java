package edu.jspider.Interview;

import java.util.Scanner;

public class StringPrimeNumbe {

	static String s1="";
	
	static void stringToNumber(String s,int index,int range)
	{
		int sum=0;
		String s1=s.trim();
		String[] a=s1.split(" ");
		for(int i=index;i<index+range;i++)
		{
			int num=Integer.parseInt(a[i]);
			sum+=num;
		}
		System.out.println("Number is  :  "+prime(sum));
	}
	
	static boolean prime(int num)
	{
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	
	static void primeNumberRange(int num)
	{
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
		{
			System.out.print(num+" ");
			s1=s1+num+" ";
		}
		
	}
	
	static void userInput()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Start Range ?");
		int start=obj.nextInt();
		System.out.println("Enter End ?");
		int end=obj.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			primeNumberRange(i);
		}
	}
	
	public static void main(String[] args) {
		
		userInput();
		System.out.println("String input  :  "+s1);
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Index Value ?");
		int index=obj.nextInt();
		System.out.println("How Many Number's You want ?");
		int range=obj.nextInt();
		stringToNumber(s1,index,range);
	}
}
