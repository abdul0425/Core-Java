class Parent
{
	Parent(int a)
	{
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent
{
	Child()
	{
		super(10);
		System.out.println("Child Constructor");
	}
	Child(String name)
	{
		super(10);
		System.out.println("Parameterised Constructor");
	}

	public static void main(String []args)
	{
		Child c1 = new Child("rascal");
		Child c2 = new Child();
	}
}