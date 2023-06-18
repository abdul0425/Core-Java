package edu.jspider.Composition;

public class DemoCar {

	Bmw s;
	
	
	public DemoCar(Bmw s) {
		this.s = s;
	}
	public void drive()
	{
		s.start();
		s.accelarate();
		s.stop();
	}
	public void drive(Audi a)
	{
		a.start();
		a.accelarate();
		a.stop();
	}
	public void drive(Benz b)
	{
		b.start();
		b.accelarate();
		b.stop();
	}
	
	void pattern()
	{
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		DemoCar d=new DemoCar(new Bmw());
		d.drive();
		d.pattern();
		d.drive(new Audi());
		d.pattern();
		d.drive(new Benz());
		d.pattern();
		
	}

}


class Bmw {
	public void start()
	{
		System.out.println("Bmw Car Started");
	}
	public void accelarate()
	{
		System.out.println("Half Clutch");
	}
	public void stop()
	{
		System.out.println("Bmw Car Stopped");
	}
}

class Audi {
	public void start()
	{
		System.out.println("Audi Car Started");
	}
	public void accelarate()
	{
		System.out.println("Audi Half Clutch");
	}
	public void stop()
	{
		System.out.println("Audi Car Stopped");
	}
}

class Benz {
	public void start()
	{
		System.out.println("Benz Car Started");
	}
	public void accelarate()
	{
		System.out.println(" Benz Half Clutch");
	}
	public void stop()
	{
		System.out.println("Benz Car Stopped");
	}
}
