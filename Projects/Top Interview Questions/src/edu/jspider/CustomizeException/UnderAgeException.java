package edu.jspider.CustomizeException;

import java.util.Scanner;

public class UnderAgeException extends RuntimeException{

	static void ageValidate(int age)
	{
		if(age<18)
			throw new UnderAgeException();
		else
			System.out.println("You are Eligible for Voting");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age ?");
		int age=s.nextInt();
		try
		{
			ageValidate(age);
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
	}
}
