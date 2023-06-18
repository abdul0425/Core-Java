class A
{
	void m()
	{
		System.out.println("I am inside A method");
	}
}
class B extends A
{
	void m()
	{
		System.out.println("I am inside B method");
	}
	void display()
	{
		m();
		super.m();
	}
}
class SuperCallingMethod
{
	public static void main(String[] args)
	{
		B b1=new B();
		b1.display();
		
	}
}