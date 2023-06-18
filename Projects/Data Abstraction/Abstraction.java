class Car
{
	public void start()
	{

	}
	public void accelarate()
	{

	}
	public void stop()
	{

	}
}
class Audi extends Car
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
	public void gps()
	{
		System.out.println("GPS is running");
	}
}
class BMW extends Car
{
	@Override
	public void start()
	{
		System.out.println("Start by Sensor");
	}
	@Override
	public void accelarate()
	{
		System.out.println("Double aceelarate");
	}
	@Override
	public void stop()
	{
		System.out.println("Stop by Sensor");
	}
	public void sunRoof()
	{
		System.out.println("Sunroof is Open");
	}
	public void sound()
	{
		System.out.println("JBL sound Playing");
	}
	
}

class Driver
{
	public void drive(Car c)
	{
		c.start();
		c.accelarate();
		c.stop();
	}

	public void musicPlayer(Car c)
	{
		if(c instanceof BMW)
		{
			((BMW)c).sound();
		}
		else
			System.out.println("Not Instance of BMW :");
	}
}

class CarImplement
{
	public static void main(String[] args)
	{
		Driver d = new Driver();
		d.drive(new Audi()); 
		System.out.println();
		d.drive(new BMW());
		System.out.println();
		d.musicPlayer(new BMW());
		System.out.println();
		d.musicPlayer(new Audi());
	}
}
