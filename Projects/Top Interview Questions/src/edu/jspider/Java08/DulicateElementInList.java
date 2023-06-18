package edu.jspider.Java08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DulicateElementInList {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,30,50,40,10,90,90,30,50,70,10);
		Set<Integer> set=new HashSet<>();
		Set<Integer> s=l.stream().filter(x->!set.add(x)).collect(Collectors.toSet());
		System.out.println(s);
	}
}
