package com.Interface;

interface InterfaceName
{
	public abstract void method();
	default void m1()
	{
		System.out.println("Default Method");
	}
	int i=10;
	static void m2()
	{
		System.out.println("Static Method");
		System.out.println(i);
	}
	
	
}

public class Demo implements InterfaceName
{
	public void method()
	{
		System.out.println("Interface Implemented :");
	}
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.method();
		d.m1();
		InterfaceName.m2();
		
		
	}
}
