package edu.jspider.Sep18;

public class Anonymous {

	public static void main(String[] args) {
		Interface i=new Interface()
				{
					@Override
					public void m1()
					{
						System.out.println("m1() overidden");
					}
					@Override
					public void m2()
					{
						System.out.println("m2() overidden");
					}
					@Override
					public void m3()
					{
						System.out.println("m3() overidden");
					}
				};
				
				i.m1();
				i.m2();
				i.m3();
	}

}
