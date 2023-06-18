package edu.jspider.Association;

public class Flipkart{

	public static void orders()
	{
		System.out.println("Orders Placed.");
	}
	public static void total()
	{
		System.out.println("Total Price.");
	}
	static void pattern()
	{
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		PayPal pp=new PayPal();
		orders();
		pattern();
		total();
		pattern();
		pp.GST();
		pattern();
		pp.billings();
		pattern();
	}

}
