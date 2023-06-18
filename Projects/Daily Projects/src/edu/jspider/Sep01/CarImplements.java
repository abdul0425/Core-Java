package edu.jspider.Sep01;

public class CarImplements {
	
	static void pattern()
	{
		System.out.println("--------------------");
	}
	public static void main(String[] args) {
		//Car c=new Audi();
		Car c=new AudiE11();
		c.start();
		c.accelarate();
		c.stop();
		CarImplements.pattern();
		
		//c=new Benz();
		c=new BenzB22();
		c.start();
		c.accelarate();
		c.stop();
		CarImplements.pattern();
		
	}

}
