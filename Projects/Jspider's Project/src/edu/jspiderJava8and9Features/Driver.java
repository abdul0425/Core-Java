package edu.jspiderJava8and9Features;

public class Driver {
	public void drive(Car c)
	{
		c.start();
		c.accelerate();
		c.stop();
		c.gps();
		c.airBag();
		pattern();
		Car.generalInfo();
		pattern1();
	}
	
	public void pattern()
	{
		System.out.println("----------------------");
	}
	public void pattern1()
	{
		System.out.println("```````````````````````");
	}
}
