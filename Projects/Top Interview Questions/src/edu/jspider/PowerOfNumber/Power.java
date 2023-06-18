package edu.jspider.PowerOfNumber;

public class Power {

	static long power(int x,int y)
	{
		if(y==0)
			return 1;
		return x*(long)Math.pow(x, y-1);
		//return x*power(x,y-1);
	}
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
			System.out.println("Power  :  "+power(i,2));
		System.out.println();
		System.out.println("Power  :  "+power(2,6));
		
	}
}
