class Animal1
{
	
}
class Dog1 extends Animal1
{
	void sound()
	{
		System.out.println(" Dog is Barking ");
	}
}
class Cat1 extends Animal1
{
	void run()
	{
		System.out.println(" Cat is Running ");
	}
}
class Shop
{
	Animal1 sell(String name)
	{
		if(name.equals("Dog"))
		{
			return new Dog1();
		}
		if(name.equals("Cat"))
		{
			return new Cat1();
		}
		System.out.println(name + " is not a valid Name ");
		return null;
	}
}
class Consumer
{
	public static void main(String[] args)
	{
		Shop shop = new Shop();
		Animal1 a1 = shop.sell("Dog");
		((Dog1)a1).sound();
		
		Animal1 a2 = shop.sell("Cat");
		((Cat1)a2).run();
		
	}
}