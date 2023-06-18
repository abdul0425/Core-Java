package edu.jspider.Sep02;

public class A implements InterfaceA,InterfaceB{
	@Override
	public void m1()
	{
		System.out.println(" m1() ");
	}
	@Override
	public void m2()
	{
		System.out.println(" m2() ");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
	}
}
