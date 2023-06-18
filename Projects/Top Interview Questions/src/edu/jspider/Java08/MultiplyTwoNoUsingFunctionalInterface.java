package edu.jspider.Java08;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface A
{
	int multiply(int x,int y);
}
public class MultiplyTwoNoUsingFunctionalInterface {

	public static void main(String[] args) {
		A a1=(a,b)->a*b;
//		int result=(a,b)->a*b;
		System.out.println("Multiply :"+a1.multiply(8, 9));
	}
}
