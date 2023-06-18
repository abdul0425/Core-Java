class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int l, int b)
	{
		length=l;
		breadth=b;
	}
	Rectangle(Rectangle arg)
	{
		this.length=arg.length;
		this.breadth=arg.breadth;
	}
}

class Test2
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(15,30);
		System.out.print(r1.length+" "+r1.breadth);
		System.out.println();
		Rectangle r2 = new Rectangle(r1);
		System.out.print(r2.length+" "+r2.breadth);
	}
}