package edu.jspider.OOP;

import java.util.Scanner;

import edu.jspider.Resources.Resource;

public class MethodOverloading {

	
	public static int factorial()
	{
		return Resource.factorial(5);
	}
	public static int factorial(int num1)
	{
		return Resource.factorial(num1);
	}
	public static int factorial(int num1, int num2)
	{
		int sum = num1+num2;
		return Resource.factorial(sum);
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two number's");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		
		int result1 = factorial();
		System.out.println(result1);
		int result2 = factorial(num1);
		System.out.println(result2);
		int result3 = factorial(num1,num2);
		System.out.println(result3);
	}

}
