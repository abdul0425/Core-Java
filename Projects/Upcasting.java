class Animal
{
	void move()
	{
		System.out.println("I am Moving");
	}
	
}
class Dog extends Animal
{
	
	void move()
	{
		System.out.println("Dog is Running");
	}
	
	
	public static void main(String[] args)
	{
		
		Dog d = new Dog();
		
		Animal a = new Dog();
		d.move();
		a.move();
		
		
	}
}