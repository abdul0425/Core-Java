package edu.jspider.Sep01;

public class Toto extends ThreeWheeler{
	@Override
	public void start()
	{
		System.out.println("Toto Started");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Speed 30kmph");
	}
	@Override
	public void stop()
	{
		System.out.println("Toto Stopped");
	}
}
