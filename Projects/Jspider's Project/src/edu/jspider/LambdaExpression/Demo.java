package edu.jspider.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Arshad","Rivu","Akhil","Pandu");
		list.stream().forEach(name->System.out.println(name));
	}
}
