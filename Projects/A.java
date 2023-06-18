class A
{
	Object m()
	{
		System.out.println("1");
		return 0;
	}
}
class B extends A
{
	Boolean m()
	{
		System.out.println("2");
		return false;
	}
	public static void main(String[] args)
	{
		A a=new A();
		a.m();
		B b=new B();
		b.m();
	}
}