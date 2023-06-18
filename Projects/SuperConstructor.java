class Janwar
{
	Janwar()
	{
		System.out.println("janwar class Constructor");
	}
}
class Animal extends Janwar
{
	Animal()
	{
		System.out.println("Animal class Constructor");
	}
}
class Dog extends Animal
{
	Dog()
	{
		super();
		System.out.println("Sub Class class Constructor");
	}
}

class SuperConstructor
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
	}
}