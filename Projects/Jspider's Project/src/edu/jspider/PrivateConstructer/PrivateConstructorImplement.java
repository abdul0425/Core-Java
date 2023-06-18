package edu.jspider.PrivateConstructer;

public class PrivateConstructorImplement {

	public static void main(String[] args) {
		PrivateConstructor obj1=PrivateConstructor.getInstance();
		PrivateConstructor obj2=PrivateConstructor.getInstance();
		PrivateConstructor obj3=PrivateConstructor.getInstance();
		
		System.out.println("Number of Object created  : "+obj1.count);
	}

}
