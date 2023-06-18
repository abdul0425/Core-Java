package edu.jspider.Sep14;

class A
{
	int calculate(int a,int b)
	{
		try
		{
//			System.out.println(a-b);
			return a-b;
		}
		catch(Exception e)
		{
			return a+b;
		}
		finally
		{
			return a*b;
		}
	}
}


public class Demo {

	
	public static void main(String[] args) {
		A a1=new A();
		int result=a1.calculate(2, 3);
		System.out.println("Result  : "+result);
	}

}
