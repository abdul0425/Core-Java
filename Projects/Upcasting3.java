class Driver1
{
	void drive1(Car c)
	{
		System.out.println("Car is running");
	}
	public static void main(String[] args)
	{
		Driver1 d1 = new Driver1();
		new Audi().start();
		d1.drive1(new Audi());
		
	}
}
class Car
{
	void start()
	{
		System.out.println("Car is Started");
	}
}
class Audi extends Car
{
	void gps()
	{
		System.out.println("GPS is running");
	}
}
class Benz extends Car
{
	void sunRoof()
	{
		System.out.println("SUnroof Is Open");
	}
}