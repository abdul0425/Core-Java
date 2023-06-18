package edu.jspider.Casting;

public class Implement {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();
		a.m3();
		//a.m4();
		
		//B b= (B) a;
		//b.m4();
		
		((B)a).m4();
	}

}
