package edu.jspider.Sep02;

public class Benz implements Car{
	@Override
	public void start()
	{
		System.out.println("Benz Start by Sensor");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Full Clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Benz stop by Sensor");
	}
	
	public void sunRoof()
	{
		System.out.println("SunRoof is Open");
	}
}
