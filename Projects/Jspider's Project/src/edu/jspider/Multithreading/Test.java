package edu.jspider.Multithreading;

public class Test implements Runnable{

	@Override
	public void run()
	{
		System.out.println("Thread is running !");
	}
	public static void main(String[] args) {
		Test t=new Test();
		Thread th=new Thread(t);
		th.start();
	}
}
