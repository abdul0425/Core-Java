package edu.jspider.Encapsulation;

public class FactorialByEncapsulation {

	private int i;
	
	
	
	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}

	public int factorial(int i)
	{
		int pro=1;
		for(int j=1;j<=i;j++)
			pro*=j;
		return pro;
	}

	public static void main(String[] args) {
		FactorialByEncapsulation a=new FactorialByEncapsulation();
		a.setI(5);
		int num=a.getI();
		System.out.println(num+" ! = "+a.factorial(num));
	}

}
