package edu.jspider.Blocks;

public class StaticBlock {

	static int i;
	int z;
	static
	{
		i=45;
		System.out.println("Hello");
	}
	static
	{
		i=78;
		System.out.println("Hello Team");
	}
	{
		z=10;
		System.out.println(z);
	}
	public static void main(String[] args) {
		System.out.println(i);
		StaticBlock s1=new StaticBlock();
	}

}
