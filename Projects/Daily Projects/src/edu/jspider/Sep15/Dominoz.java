package edu.jspider.Sep15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class Dominoz {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Pizza p1=new Pizza("Onion Pizza","Small" , 199);
		Pizza p2=new Pizza("Cheese Pizza","Medium" , 299);
		Pizza p3=new Pizza("Onion Cheese Pizza","Large" , 599);
		Pizza p4=new Pizza("Plain Pizza","Small" , 99);
		Pizza p5=new Pizza("Chicken Pizza","Large" , 799);
		SortedSet s=new TreeSet();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);

		
		
		Collections.sort(al);
		
		for(Object obj:al)
			System.out.println(obj);
	}

}
