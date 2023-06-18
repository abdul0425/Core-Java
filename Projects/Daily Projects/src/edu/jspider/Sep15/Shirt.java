package edu.jspider.Sep15;

public class Shirt {

	String color;
	int size;
	int price;
	
	public Shirt(String color, int size, int price) {
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
		return color.equals(((Shirt)obj).color);
	}

	@Override
	public int hashCode() {
		//return price;
		return color.hashCode();
	}
	
	
	
	
}
