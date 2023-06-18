package edu.jspider.Exception;

public class Demo {

	static void calculate(int x,int y)
	{
		if(y==0)throw new ArithmeticException("You can't devide by Zero.");
		System.out.println(x/y);
		
	}
	
	public static void main(String[] args) {
		int a=100,b=0;
		try
		{
			calculate(a,b);
		}
		catch(ArithmeticException arg)
		{
			System.out.println(arg.getMessage());
		}
	}

}
