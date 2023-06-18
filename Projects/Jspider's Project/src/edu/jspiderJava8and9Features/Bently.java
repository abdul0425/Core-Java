package edu.jspiderJava8and9Features;

public class Bently implements Car{
	@Override
	public void start()
	{
		System.out.println("Bently Started");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Bently Full clutch ");
	}
	@Override
	public void stop()
	{
		System.out.println("Bently Stoped");
	}

}
