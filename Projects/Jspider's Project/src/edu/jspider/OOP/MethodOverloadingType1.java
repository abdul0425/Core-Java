package edu.jspider.OOP;

public class MethodOverloadingType1 {
	
	
	public void m1(float b)
	{
		System.out.println("float Argument");
		System.out.println(b);
	}
//	public void m1(int b)
//	{
//		System.out.println("int Argument");
//		System.out.println(b);
//	}
	public void m1(long s)
	{
		System.out.println("long Argument");
		System.out.println(s);
	}
	public void m1(double s)
	{
		System.out.println("double Argument");
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		MethodOverloadingType1 m = new MethodOverloadingType1();
		m.m1((byte)4);
		m.m1((short)10);
	}

}
