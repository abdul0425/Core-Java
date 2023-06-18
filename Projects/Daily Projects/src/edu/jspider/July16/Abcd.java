package edu.jspider.July16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Abcd {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList();
		l.add(60);
		l.add(50);
		l.add(40);
		l.add(30);
		l.add(20);
		l.add(10);
		
		List<Integer> num=l.stream().sorted((o1,o2)->((o1>o2)?1:(o1<o2)?-1:0)).collect(Collectors.toList());
		
		System.out.println(num);
	}
}
