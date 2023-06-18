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
		System.out.println("Sunroof is Open");
	}
}
class Driver1
{
	void drive(Car c)
	{
		System.out.println("Car is Driving");
	}
}

class Test
{
	public static void main(String[] args)
	{
		Driver1 d = new Driver1();
		d.drive(new Benz());
		d.drive(new Audi());
		Car c = new Benz();
		System.out.println(c);
		//c.start();
		c = new Audi();
		//c.start();
		//c.gps();
		//c.sunRoof();
		/*Audi a = new Audi();
		a.start();
		a.gps();*/
		
	}
}