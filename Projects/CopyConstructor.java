class Rectangle
{
	int length;
	int breadth;
	Rectangle(int l, int b)
	{
		length = l;
		breadth = b;
	}
	Rectangle(Rectangle arg)
	{
		length = arg.length;
		breadth = arg.breadth;
	}
}

class CopyConstructor
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(r1);
		System.out.println(r1.length+" "+r1.breadth);
		System.out.println(r2.length+" "+r2.breadth);
		
		
	}
}
