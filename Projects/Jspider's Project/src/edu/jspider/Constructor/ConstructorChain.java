package edu.jspider.Constructor;


class SuperKeyword
{
	SuperKeyword()
	{
		System.out.println("Super Class executed");
	}
}
public class ConstructorChain extends SuperKeyword {
	
	public ConstructorChain() {
		super();
		System.out.println("No Parameterised Constructor");
	}
	public ConstructorChain(int a) {
		super();
		System.out.println("Parameterised Constructor");
	}
	public ConstructorChain(String s) {
		super();
		System.out.println("String Constructor");
	}
	

	public static void main(String[] args) {
		ConstructorChain cc = new ConstructorChain();
		ConstructorChain cc1 = new ConstructorChain(10);
		ConstructorChain cc2 = new ConstructorChain("Abc");
	}

}
