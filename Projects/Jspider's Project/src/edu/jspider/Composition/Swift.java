package edu.jspider.Composition;

public class Swift {
	public void start()
	{
		System.out.println("Swift Car Started");
	}
	public void accelarate()
	{
		System.out.println("Half Clutch");
	}
	public void stop()
	{
		System.out.println("Swift Car Stopped");
	}
	
	public static void main(String[] args) {
		Driver d=new Driver();
		d.drive(new Swift());
		
	}
}

class Driver
{
	public void drive(Swift s)
	{
		s.start();
		s.accelarate();
		s.stop();
	}
	
}
