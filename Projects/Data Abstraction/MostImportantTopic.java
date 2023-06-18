abstract class A1
{
	A1()
	{
		System.out.println("A1 class Constructor => Calling by ' SUPER() - super call statement' in subclass Constructor .");
	}
	public static void staticMethod()
	{
		System.out.println("Static Method => Mandatory Instruction for every subClass types .");
	}
	public final void finalMethod()
	{
		System.out.println("Final Method => Final Method can't be overridden,but can be Inherited easily .");
	}
	abstract public void method1();
	abstract public void method3();
}
abstract class B1 extends A1
{
	@Override
	public void method3()
	{
		System.out.println("OverRidden => A1 class overridden Method3 in subClass B1");
	}
}
class C1 extends B1
{
	C1()
	{
		super();
	}
	@Override
	public void method1()
	{
		System.out.println("OverRidden => A1 class overridden Method1 in C1 !");
	}
}
class Implementation
{
	public static void main(String[] args)
	{
		C1 object = new C1();
		object.staticMethod();
		object.finalMethod();
		object.method1();
		object.method3();
	}
}