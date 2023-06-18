package edu.jspider.MethodReference;

public class Test {

	public static void abc()
	{
		System.out.println("Accessedd bt static method reference");
	}
	
	public static void main(String[] args) {
		Inter i=Test::abc;
		
		i.java();
	}
}
