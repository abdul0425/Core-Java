package edu.jspider.Abstraction;

class Bmw 
{
	void start()
	{
		System.out.println("BMW Started");
	}
	void acelarate()
	{
		System.out.println("BMW Acelarated");
	}
	void stop()
	{
		System.out.println("BMW Stop");
	}
	public static void main(String[] args) {
		Bmw b1=new Bmw();
		b1.start();
		b1.acelarate();
		b1.stop();
	}
}

