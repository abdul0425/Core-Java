package edu.jspider.Constructor;

class ConstructorChain1
{
	int i=10;
	
}
public class ThisAndSuperKeyword extends ConstructorChain1 {

	int i=20;
	void m()
	{
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		
		ThisAndSuperKeyword c=new ThisAndSuperKeyword();
		c.m();
		
	}

}
