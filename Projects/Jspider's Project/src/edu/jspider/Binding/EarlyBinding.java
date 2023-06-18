package edu.jspider.Binding;

class A
{
	int i;
	static public void m1()
	{
		System.out.println("A method m1()");
	}
	static public void m2()
	{
		System.out.println("class Am2()");
	}
}
class B extends A
{
	static public void m1()
	{
		System.out.println("Overridden m1()");
	}
	static public void m2()
	{
		System.out.println("Overridden m2()");
	}
}


public class EarlyBinding {

	public static void main(String[] args) {
		//B b1=new B();  Bounded at runtime,depends on what instance you provided.
		//A a=new B();
		//B a=new B();
		B.m1();   // Bounded at compile time,depends on what reference you have given.
		B.m2();
		A.m1();
		A.m2();
	}

}
