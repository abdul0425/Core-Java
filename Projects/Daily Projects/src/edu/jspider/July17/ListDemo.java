package edu.jspider.July17;

import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(100);
		
		List<Integer> l2=new ArrayList();
		
		Function<Integer,Integer> f=n->n*n;
		
		for(Integer n:l)
			l2.add(f.apply(n)) ;
		System.out.println("Square  :  "+l2);
	}
}
