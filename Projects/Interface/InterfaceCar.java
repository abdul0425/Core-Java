interface Car  //Car type interface :
{
	public abstract void start(); // Abstract method
	public abstract void accelarate(); // Abstract method
	public abstract void stop(); // Abstract method
	// Must be implemented all the abstract method in subclass !
}
class BMW implements Car
{
	@Override
	public void start()
	{
		System.out.println("Start by Sensor");
	}
	@Override
	public void accelarate()
	{
		System.out.println("Half Clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Stop by Sensor");
	}
}
class Audi implements Car
{
	@Override
	public void start()
	{
		System.out.println("Start by Button");
	}
	@Override
	public void accelarate()
	{
		System.out.println("Full Clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Stop by Button");
	}
}
class Driver
{
	//Tightly coupled, becase only work for BMW object :
	// BMW b;
	// public Driver(BMW b)
	// {
	// 	this.b = b;
	// }
	// public void driveBMW()
	// {
	// 	b.start();
	// 	b.accelarate();
	// 	b.stop();
	// 	System.out.println("--------------------");
	// }
	//Tightly coupled, becase only work for Audi object :
	// Audi a;
	// public Driver(Audi a)
	// {
	// 	this.a = a;
	// }
	// public void driveAudi()
	// {
	// 	a.start();
	// 	a.accelarate();
	// 	a.stop();
	// }

	//Now Generalizing the Program for All Car's !

	Car c;
	Driver(Car c)
	{
		this.c = c;
	}
	public void driveCar()
	{
		System.out.println("----------------");
		c.start();
		c.accelarate();
		c.stop();
		System.out.println("----------------");
	}
}
class CarImplementation
{
	public static void main(String[] args)
	{
		// Driver d1 = new Driver(new BMW());
		// d1.driveBMW();

		// Driver d2 = new Driver(new Audi());
		// d2.driveAudi();

		Driver d1 = new Driver(new BMW());
		d1.driveCar();

		Driver d2 = new Driver(new Audi());
		d2.driveCar();
	}
}