package edu.jspider.InterviewQuestions;

import java.util.Scanner;

public class PowRecursion {
	public static int power(int x,int y)
	{
		if(y==0)return 1;
		return x*power(x,y-1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to find Power ?");
		int num=s.nextInt();
		System.out.println("Power ?");
		int pw=s.nextInt();
		int pow = PowRecursion.power(num, pw);
		System.out.println(num+"**"+pw+" = "+pow);
	}

}
