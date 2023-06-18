class Animal
{
	String name;
	int legs;
	Animal(String n, int l)
	{
		name = n;
		legs = l;
		
		
	}
	Animal(int d)
	{
		this("Tiger",d);
	}
	void m1()
	{
		System.out.println("Name is : "+ name);
		System.out.println("Legs is : "+ legs);
	}
}

class ConstructorChain
{
	public static void main(String[] args)
	{
		Animal a1 = new Animal(10);
		a1.m1();
	}
}