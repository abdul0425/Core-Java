package edu.jspider.Sep02;

public class Driver {
	public void drive(Car c)
	{
		c.start();
		c.accelerate();
		c.stop();
	}
	
	public void music(Car c)
	{
		if(c instanceof Audi)
		{
			((Audi) c).music();
		}
		
		if(c instanceof Bmw)
			((Bmw)c).music();
	}
	public void bluetooth(Car c)
	{
		if(c instanceof Audi)
		{
			((Audi) c).bluetooth();
		}
	}
	public void gps(Car c)
	{
		if(c instanceof Bmw)
		{
			((Bmw) c).gps();
			((Bmw) c).music();
		}
		
	}
	public void sunRoof(Car c)
	{
		if(c instanceof Benz)
			((Benz) c).sunRoof();
	}
	
	
}
