package edu.jspider.Sep02;

public class Bmw implements Car{
	@Override
	public void start()
	{
		System.out.println("Bmw Start by Remote");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Half Clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Bmw stop by Remote");
	}
	
	public void music()
	{
		System.out.println("BMW JBL Music is running");
	}
	
	public void gps()
	{
		System.out.println("GPS is running");
	}
}
