package edu.jspiderJava8and9Features;

public class Ferrari implements Car{
	@Override
	public void start()
	{
		System.out.println("Ferrari Started");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Ferrari Double clutch ");
	}
	@Override
	public void stop()
	{
		System.out.println("Ferrari Stoped");
	}
}
