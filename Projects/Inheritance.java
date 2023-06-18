
class A
{
	void showA()
	{
		System.out.println("A");
	}
}
class B extends A
{
	void m()
	{
		System.out.println("B");
	}
	
}
class C extends B
{
	void m1()
	{
		System.out.println("C");
	}
	public static void main(String[] args)
	{
		
		
		C c=new C();
		c.showA();
		c.m();
		c.m1();
	}
}