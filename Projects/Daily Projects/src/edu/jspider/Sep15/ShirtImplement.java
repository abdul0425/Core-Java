package edu.jspider.Sep15;

import java.util.*;

public class ShirtImplement {

	public static void main(String[] args) {
		
		//Creating object for shirt's
		Shirt s1=new Shirt("Black", 40, 799);
		Shirt s2=new Shirt("White", 42, 999);
		Shirt s3=new Shirt("Cream", 44, 899);
		Shirt s4=new Shirt("Blue", 42, 699);
		Shirt s5=new Shirt("Black", 40, 799);
		
		//Printing hashCode value.
		System.out.println("s1 -> "+s1.hashCode());
		System.out.println("s2 -> "+s2.hashCode());
		System.out.println("s3 -> "+s3.hashCode());
		System.out.println("s4 -> "+s4.hashCode());
		System.out.println("s5 -> "+s5.hashCode());
		
		Set s=new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		for(Object n:s)
			System.out.println(n);
		
		
	}

}
