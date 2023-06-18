package edu.jspider.Sep01;

public class Benz1 extends FourWheeler{
	@Override
	public void start()
	{
		System.out.println("Benz Started");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Full clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Benz Stopped");
	}
}
