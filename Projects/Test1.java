class Circle
{
	int radius;
	
	Circle(int r)
	{
		radius=r;
	}
	
	void display(Circle c)
	{
		System.out.print(radius+" ");
		System.out.print(c.radius+" ");
		System.out.println();
		
	}
}

class Test1
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		c1.display(c2);
		c2.display(c1);
		c2.display(c2);
		c2.display(new Circle(30));
	}
}