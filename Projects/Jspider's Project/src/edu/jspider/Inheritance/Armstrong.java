package edu.jspider.Inheritance;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=obj.nextInt();
		ArmstrongCalc ac=new ArmstrongCalc();
		int len=ac.length(num);
		int sum=ac.armstrong(num,len);
		System.out.println("Sum : "+sum);
		if(sum==num)
			System.out.println(num+" : Armstrong Number");
		else
			System.out.println(num+" : Not Armstrong Number");
	}

}
