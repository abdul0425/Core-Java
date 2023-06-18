package edu.jspiderJava8and9Features;

public interface Car {
	void start();
	void accelerate();
	void stop();
	default void gps()
	{
		System.out.println("GPS is running");
	}
	default void airBag()
	{
		System.out.println("Airbag is Installed.");
	}
	static void generalInfo()
	{
		demo();
		System.out.println("Always Wear Seatbelt's");
		System.out.println("Don't use Mobile while Driving.");
		System.out.println("Don't Drink and Drive.");
		
	}
	
	private static void demo()
	{
		System.out.println("Hii there. Here are some Instruction for you...");
		System.out.println("............................................");
	}
}
