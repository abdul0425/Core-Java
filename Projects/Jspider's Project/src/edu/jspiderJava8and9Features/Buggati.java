package edu.jspiderJava8and9Features;

public class Buggati implements Car{
	@Override
	public void start()
	{
		System.out.println("Buggati Started");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Full clutch with full acceleration");
	}
	@Override
	public void stop()
	{
		System.out.println("Buggati Stoped");
	}
}
