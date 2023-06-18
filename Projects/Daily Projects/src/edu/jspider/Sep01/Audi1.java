package edu.jspider.Sep01;

public class Audi1 extends FourWheeler{
	@Override
	public void start()
	{
		System.out.println("Audi Started");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Half clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Audi Stopped");
	}
}
