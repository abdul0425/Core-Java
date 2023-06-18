class A
{
	static void m1()
	{
		System.out.println("A class method");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.println("B class method");
	}
}
class C extends A
{
	static void m1()
	{
		System.out.println("C class method");
	}
}
class Test
{
	public static void main(String[] args)
	{
		A a1 = new B();
		a1.m1();
		
		a1 = new C();
		a1.m1();
	}
}