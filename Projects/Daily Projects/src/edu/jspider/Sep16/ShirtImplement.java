package edu.jspider.Sep16;

import java.util.HashSet;
import java.util.Set;

public class ShirtImplement {

	public static void main(String[] args) {
		Shirt s1=new Shirt("Black", 42, 1199);
		Shirt s2=new Shirt("White", 40, 1299);
		Shirt s3=new Shirt("Blue", 42, 799);
		Shirt s4=new Shirt("Black", 42, 1199);
		Shirt s5=new Shirt("Maroon", 42, 899);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		
		Set s=new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		for(Object o:s)
			System.out.println(o);
	}
}
