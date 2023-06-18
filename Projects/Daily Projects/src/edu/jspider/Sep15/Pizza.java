package edu.jspider.Sep15;

public class Pizza implements Comparable{

	String nameOfPizza;
	String sizeOfPizza;
	double costOfPizza;
	
	public Pizza(String nameOfPizza, String sizeOfPizza, double costOfPizza) {
		this.nameOfPizza = nameOfPizza;
		this.sizeOfPizza = sizeOfPizza;
		this.costOfPizza = costOfPizza;
	}

	@Override
	public String toString() {
		return "Pizza [nameOfPizza=" + nameOfPizza + ", sizeOfPizza=" + sizeOfPizza + ", costOfPizza=" + costOfPizza
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		Pizza p=(Pizza)o;
		return nameOfPizza.compareTo(p.nameOfPizza);
	}
	
	
	
}
