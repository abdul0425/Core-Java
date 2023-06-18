class Animal
{
	void move()
	{
		System.out.println("Animal is Moving");
	}
}
class Cat extends Animal
{
	void move()
	{
		System.out.println("Cat is Running");
	}
	
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Animal a = new Cat();  // Upcasting .
		a.move();
		
		Cat c1 = (Cat)a;
		c1.move();
		
	}
}