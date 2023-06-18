package edu.jspider.Constructor;

class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(Rectangle r)
	{
		this.length=r.length;
		this.breadth=r.breadth;
	}
	
	void display()
	{
		System.out.println("Length : "+length);
		System.out.println("Length : "+length);
		System.out.println("Rectangle Area : "+length*breadth);
	}
	
	static void pattern()
	{
		System.out.println("*-------------------*");
	}
	
}
public class CopyConstructor {

	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(15,10);
		r1.display();
		Rectangle.pattern();
		Rectangle r2 = new Rectangle(r1);
		r1.display();
		Rectangle.pattern();
		
	}

}
