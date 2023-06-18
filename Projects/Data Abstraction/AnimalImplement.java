abstract class Animal
{
	abstract public void sound();
	abstract public void move();

	public void drink()
	{
		System.out.println("Water required for every Animal");
	}
}
class Lion extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("Lion is Roaring !");
	}
	@Override
	public void move()
	{
		System.out.println("Lion Walks / Lion Runs !");
	}
}
class Snake extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("Sshhssssssssssss !");
	}
	@Override
	public void move()
	{
		System.out.println("Snake is Crawling !");
	}
}
class AnimalImplement
{
	public static void main(String[] args)
	{
		Animal a;

		a = new Lion();
		a.sound();
		a.move();
		a.drink();

		a = new Snake();
		a.sound();
		a.move();
		a.drink();
	}
}