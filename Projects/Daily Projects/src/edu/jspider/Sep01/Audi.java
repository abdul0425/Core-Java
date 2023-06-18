package edu.jspider.Sep01;

abstract public class Audi extends Car{
	
	
	/* @Override
	   public void start()
	{
		System.out.println("Start by Button");
	}  */
	
	@Override
	public void accelarate()
	{
		System.out.println("Half Clutch");
	}
	@Override
	public void stop()
	{
		System.out.println("Stop by Button");
	}
}
class AudiE11 extends Audi
{
	@Override
	public void start()
	{
		System.out.println("Start by Button");
	}
}
