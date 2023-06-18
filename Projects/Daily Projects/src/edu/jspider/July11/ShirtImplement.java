package edu.jspider.July11;

import java.util.*;
public class ShirtImplement {

	public static void main(String[] args) {
		Shirt s1=new Shirt("Black", 40, 1199);
		Shirt s2=new Shirt("Blue", 42, 999);
		Shirt s3=new Shirt("Maroon", 42, 1199);
		Shirt s4=new Shirt("White", 40, 1199);
		Shirt s5=new Shirt("Pink", 40, 899);
		Shirt s6=new Shirt("Black", 40, 1199);
		
		Set s=new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		
		for(Object obj:s)
			System.out.println(obj);
	}

}
