package edu.jspider.SortedSet;

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
		return color.equalsIgnoreCase(s.color) && size==s.size && price==s.price;
	}
	@Override
	public int hashCode() {
		return color.hashCode();
	}
	
}
