package edu.jspider.Java08;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipFunction {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(12,65,85,75,35,65,85,75,12);
		l.stream().limit(3).forEach(x->System.out.println(x));
		System.out.println("=======");
		l.stream().skip(6).forEach(y->System.out.println(y));
	}
}
