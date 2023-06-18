package edu.jspider.Overriding;

class Parent
{
	 void call()
	{
		System.out.println("Parent's call Executed.");
	}
}

public class Child extends Parent {

	@Override
	public void call()
	{
		//super.call();
		System.out.println("Mine No executed.");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.call();
		
	}

}
