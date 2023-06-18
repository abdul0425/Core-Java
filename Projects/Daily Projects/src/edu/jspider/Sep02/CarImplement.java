package edu.jspider.Sep02;

public class CarImplement {
	static void pattern()
	{
		System.out.println("---------------------");
	}
	public static void main(String[] args) {
		Driver dr=new Driver();
		//Car c=new Audi();
		dr.drive(new Audi());
		dr.music(new Audi());
		dr.bluetooth(new Audi());
		//Audi a=((Audi)c);
		//a.bluetooth();
		//a.music();
		
		CarImplement.pattern();
		
		//c=new Bmw();
		dr.drive(new Bmw());
		dr.gps(new Bmw());
		dr.music(new Bmw());
		 //Bmw b=((Bmw)c);
		//b.music();
		//b.gps();
		CarImplement.pattern();
		
		//c=new Benz();
		dr.drive(new Benz());
		dr.sunRoof(new Benz());
		//Benz bn=((Benz)c);
		//bn.sunRoof();
		CarImplement.pattern();
	}

}
