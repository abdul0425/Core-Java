package edu.jspider.OOP;

public class ConstructorOverloading {

//	ConstructorOverloading()
//	{
//		System.out.println("No Parameter");
//	}
//	ConstructorOverloading(byte num)
//	{
//		System.out.println("Byte Parameter");
//	}
//	ConstructorOverloading(short num)
//	{
//		
//	}
//	ConstructorOverloading(int num)
//	{
//		
//	}
	ConstructorOverloading(long num)
	{
		System.out.println("Int Argument.");
	}
//	ConstructorOverloading(float num)
//	{
//		
//	}
//	ConstructorOverloading(double num)
//	{
//		
//	}
	ConstructorOverloading(int num1, int num2)
	{
		
	}
	ConstructorOverloading(int num1,String name)
	{
		
	}
	ConstructorOverloading(String name, int num)
	{
		
	}
	public static void main(String[] args) {
//		ConstructorOverloading s = new ConstructorOverloading((byte)1);
		ConstructorOverloading s = new ConstructorOverloading(333333333);
		
	}

}
