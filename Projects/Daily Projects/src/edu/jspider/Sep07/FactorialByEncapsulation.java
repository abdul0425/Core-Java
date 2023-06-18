package edu.jspider.Sep07;

public class FactorialByEncapsulation {

	private int num;
	
	public  void setNum(int num)
	{
		this.num=num;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public static long factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		FactorialByEncapsulation f1=new FactorialByEncapsulation();
		f1.setNum(5);
		long l=factorial(f1.getNum());
		System.out.println("Factorial : "+l);
	}

}
