package edu.jspider.Sep25;
import java.util.*;
public class ShirtImplement {

	public static void main(String[] args) {
		Shirt[] s=new Shirt[5];
		Shirt s1=new Shirt("White", 40, 1199.0);
		Shirt s2=new Shirt("Black", 42, 1099.0);
		Shirt s3=new Shirt("Brown", 40, 999.0);
		Shirt s4=new Shirt("Maroon", 42, 899.0);
		Shirt s5=new Shirt("White", 40, 1199.0);
		
		System.out.println("Shirt 1 -> "+s1.hashCode());
		System.out.println("Shirt 2 -> "+s2.hashCode());
		System.out.println("Shirt 3 -> "+s3.hashCode());
		System.out.println("Shirt 4 -> "+s4.hashCode());
		System.out.println("Shirt 5 -> "+s5.hashCode());
		
		Set set=new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		System.out.println("Number Of Shirt's  :  "+set.size());
		
		for(Object o:set)
			System.out.println(o);
	}
}
