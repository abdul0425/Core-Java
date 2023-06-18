package edu.jspider.July02;

public class Audi extends Car {
	
	@Override
	public void start()
	{
		System.out.println("Audi started");
	}
	@Override
	public void stop()
	{
		System.out.println("Audi Stopped.");
	}
	
	public void gps()
	{
		System.out.println("GPS is running.");
	}

}
