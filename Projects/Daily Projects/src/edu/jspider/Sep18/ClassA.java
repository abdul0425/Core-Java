package edu.jspider.Sep18;

public class ClassA {

	public static void main(String[] args) {
		InterfaceA i=()->
			System.out.println("Method is Overridden.");
		
				//new InterfaceA()
//				{
//					@Override
//					public void m1()
//					{
//						System.out.println("Method is Overridden.");
//					}
//				};
				i.m1();
	}

}
