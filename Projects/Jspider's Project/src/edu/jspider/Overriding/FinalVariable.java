package edu.jspider.Overriding;

public class FinalVariable {
	public final int i;
	FinalVariable(int i)
	{
		this.i=i;
	}
	 void m()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		FinalVariable fv=new FinalVariable(10);
		fv.m();
	}

}
