package edu.jspider.Sep01;

public class Driver {
	public void twoWheelerDrive(TwoWheeler tw)
	{
		tw.start();
		tw.accelerate();
		tw.stop();
	}
	public void threeWheelerDrive(ThreeWheeler th)
	{
		th.start();
		th.accelerate();
		th.stop();
	}
	public void fourWheelerDrive(FourWheeler fw)
	{
		fw.start();
		fw.accelerate();
		fw.stop();
	}
	public static void pattern()
	{
		System.out.println("--------------------");
	}
	public static void pattern1()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void main(String[] args) {
		Driver d=new Driver();
		
		// Two Wheeler Vehicle.
		System.out.println("Two Wheeler Vehicle : ");
		Driver.pattern1();
		d.twoWheelerDrive(new Pulsar220());
		Driver.pattern();
		d.twoWheelerDrive(new Ktm399());
		Driver.pattern();
		
		// Three Wheeler Vehicle.
		System.out.println("Three Wheeler Vehicle : ");
		Driver.pattern1();
		d.threeWheelerDrive(new Auto());
		Driver.pattern();
		d.threeWheelerDrive(new Toto());
		Driver.pattern();
		
		// Four Wheeler Vehicle.
		System.out.println("Four Wheeler Vehicle : ");
		Driver.pattern1();
		d.fourWheelerDrive(new Audi1());
		Driver.pattern();
		d.fourWheelerDrive(new Benz1());
		Driver.pattern();
	}
}
