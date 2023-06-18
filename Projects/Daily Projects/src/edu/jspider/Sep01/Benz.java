package edu.jspider.Sep01;

abstract public class Benz extends Car{
	@Override
	public void start()
	{
		System.out.println("Start by Remote");
	}
	
	/*  @Override
	public void accelarate()
	{
		System.out.println("Full Clutch");
	}  
	  */
	
	@Override
	public void stop()
	{
		System.out.println("Stop by Remote");
	}
}
class BenzB22 extends Benz
{
	@Override
	public void accelarate()
	{
		System.out.println("Full Clutch");
	}
}
