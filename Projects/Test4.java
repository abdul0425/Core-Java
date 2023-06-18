class A1
{
	static
	{
		System.out.println("Static block in A1");
	}
	{
		System.out.println("nonStatic block in A1");
	}
	A1()
	{
		System.out.println("A1 class Constructor");
	}
}

class Test4
{
	public static void main(String[] args)
	{
		new A1();
		new A1();
	}
}