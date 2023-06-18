package edu.jspider.Casting;

import java.util.Scanner;

public class VegImplement {

	public static void main(String[] args) {
		Shop sh=new Shop();
		Scanner obj=new Scanner(System.in);
		System.out.println("What veg you want ?");
		String s=obj.nextLine();
		
		Veg v=sh.sell(s);
		
		if(v instanceof Carrot)
		{
			((Carrot)v).halwa();
		}
		else if(v instanceof Potato)
		{
			((Potato)v).frenchFried();
		}
	}

}
