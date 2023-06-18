// Note : Here m1 not implemented in class A and class B , so A and B is
// abstract class. so need to create one more class "C " give implementation
// for m1() method. So there is concept of mMultilevel Inheritation concept.
// So to Access the m1() method you need to create class for class C.

abstract class A
{
	abstract public void m1();
	public void m2()
	{
		System.out.println("Hiii");
	}
	abstract public void m3();
}
abstract class B extends A
{
	@Override
	public void m3()
	{
		System.out.println("Overridden");
	}
}
class C extends B
{
	public void m1()
	{
		System.out.println("Overridden By Multilevel Inherited");
	}
}
class Demo
{
	public static void main(String[] args)
	{
		C c1 = new C();
		c1.m1();
		c1.m2();
		c1.m3();
	}
}