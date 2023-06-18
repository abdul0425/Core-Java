abstract class Car
{
	abstract public void start();
	//{}
	abstract public void accelarate();
	//{}
	abstract public void stop();
 	//{}
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
		System.out.println("Audi GPS is running");
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
		System.out.println("BMW Sunroof is Open");
	}
	public void sound()
	{
		System.out.println("BMW JBL sound is Playing");
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
			((BMW)c).sunRoof();
		}
		else
			System.out.println("Not Instance of BMW :");
	}
	public void gpsSystem(Car c)
	{
		if(c instanceof Audi)
		{
			((Audi)c).gps();
		}
		else
			System.out.println("Not Instance of Audi :");
	}
}
class CarImplement
{
	public static void main(String[] args)
	{
		Driver d = new Driver();
		// d.drive(new Audi());
		// d.drive(new BMW());
		// d.musicPlayer(new BMW());
		d.gpsSystem(new BMW());

	}
}