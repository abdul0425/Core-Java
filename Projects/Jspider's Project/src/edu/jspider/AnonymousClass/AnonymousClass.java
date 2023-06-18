package edu.jspider.AnonymousClass;

public class AnonymousClass {

	public static void main(String[] args) {
//		Iter it=new Iter()
//		{
//			@Override
//			public void m1()
//			{
//				System.out.println("Overridden m1()");
//			};
//		
//		};
//		it.m1();
		
		Iter it= ()->System.out.println("Overridden m1().");
		it.m1();
		
	}

}
