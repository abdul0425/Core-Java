package edu.jspider.Abstraction;

public class Audi {

	void start()
	{
		System.out.println("Audi Started");
	}
	void acelarate()
	{
		System.out.println("Audi Acelarated");
	}
	void stop()
	{
		System.out.println("Audi Stoped");
	}
	public static void main(String[] args) {
		Audi a1=new Audi();
		a1.start();
		a1.acelarate();
		a1.stop();
	}

}
