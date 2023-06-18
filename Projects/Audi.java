class Driver
{
	void drive(Car c)
	{
		System.out.println("Car is Driving");
	}
}

class Car
{
	
}
class Audi extends Car
{
	public static void main(String[] args)
	{
		Driver d1 = new Driver();
		d1.drive(new Audi());
		Driver d2 = new Driver();
		d2.drive(new Benz());
	}
}
class Benz extends Car
{
	
}