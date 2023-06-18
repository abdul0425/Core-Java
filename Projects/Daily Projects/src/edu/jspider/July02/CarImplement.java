package edu.jspider.July02;

public class CarImplement {

	public static void main(String[] args) {
		//Driver d=new Driver();
		//d.drive(new Audi());
		//d.drive(new Bently());
		Car c=new Audi();
		c.start();
		c.stop();
		Audi a1=(Audi)c;
		a1.gps();
		//((Audi)c).gps();
		//new Audi().gps();
		
		c=new Bently();
		c.start();
		c.stop();
		new Bently().sunRoof();
		
	}

}
