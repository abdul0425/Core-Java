package edu.jspider.Casting;

public class CarImplement {

	
	static void pattern()
	{
		System.out.println("------------------------------------");
		
	}
	public static void main(String[] args) {

		//Swift sf=new Swift();
		Car car=new Swift();
		car.start();
		car.accelarate();
		car.stop();
		System.out.println(car instanceof Swift);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Object);
		System.out.println(car instanceof Audi);
		System.out.println(car instanceof BMW);
		((Swift)car).music();
		CarImplement.pattern();
		
		car=new Audi();
		car.start();
		car.accelarate();
		car.stop();
		System.out.println(car instanceof Audi);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Object);
		System.out.println(car instanceof Swift);
		System.out.println(car instanceof BMW);
		((Audi)car).gps();
		CarImplement.pattern();
		
		car=new BMW();
		car.start();
		car.accelarate();
		car.stop();
		System.out.println(car instanceof BMW);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof Object);
		System.out.println(car instanceof Swift);
		System.out.println(car instanceof Audi);
		((BMW)car).sunRoof();
		CarImplement.pattern();
	}

}
