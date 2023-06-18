package edu.jspider.Exception;

import java.util.Scanner;

public class AgeValidation extends RuntimeException{

	private String msg;
	
	AgeValidation(String msg)
	{
		this.msg=msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age=obj.nextInt();
		try
		{
			if(age<18)
				throw new AgeValidation("You are note Adult.");
			System.out.println("You are an Adult Person.");
		}
		catch(AgeValidation arg)
		{
			System.out.println(arg.getMessage());
		}
	}

}
