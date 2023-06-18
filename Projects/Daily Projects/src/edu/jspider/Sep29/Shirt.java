package edu.jspider.Sep29;

public class Shirt {

	String color;
	int size;
	double price;
	
	public Shirt(String color, int size, double price) {
		this.color = color;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shirt [color=" + color + ", size=" + size + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Shirt s=(Shirt)obj;
		return color.equals(s.color)&&price==s.price&&size==s.size;
	}
	@Override
	public int hashCode() {
		return color.hashCode();
	}
	
	
}
