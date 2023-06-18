package edu.jspider.Sep07;

import java.util.Arrays;

class Circle implements Comparable<Circle>
{
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int compareTo(Circle c)
	{
		return radius-c.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
public class CircleCompare {
	public static void main(String[] args) {
		Circle[] c=new Circle[5];
		c[0]=new Circle(50);
		c[1]=new Circle(60);
		c[2]=new Circle(20);
		c[3]=new Circle(30);
		c[4]=new Circle(40);
		
		Arrays.sort(c);
		
		for(Circle n:c)
			System.out.println(n);
	}
}
