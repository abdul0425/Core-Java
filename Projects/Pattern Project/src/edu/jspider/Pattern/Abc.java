package edu.jspider.Pattern;

import java.util.SortedSet;
import java.util.TreeSet;

public class Abc {

	
	static void display(SortedSet s)
	{
		for(Object obj:s)
			System.out.print(obj+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		
		System.out.println("First  :  "+s.first());
		System.out.println("Last  :  "+s.last());
		
		SortedSet s1=s.headSet(40);
		display(s1);
		
		SortedSet s2=s.tailSet(40);
		display(s2);
		
		SortedSet s3=s.subSet(20, 50);
		display(s3);
	}

}
