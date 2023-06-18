package edu.jspider.Sep02;

public class Audi implements Car{
	@Override
	public void start()
	{
		System.out.println("Audi Start by key");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Normal Clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Audi stop by Key");
	}
	
	public void bluetooth()
	{
		System.out.println("Bluetooth is running");
	}
	
	public void music()
	{
		System.out.println("Sony Music is running");
	}
}
