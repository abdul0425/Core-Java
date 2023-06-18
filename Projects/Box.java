class A
{
	int length;
	int width;
	int height;
	
	A(int l, int w, int h)
	{
		length = l;
		width = w;
		height = h;
	}
	A(int d)
	{
		this(d,d,d);
	}
	
}

class Box
{
	public static void main(String[] args)
	{
		A a1 = new A(10);
		System.out.println(a1.length+" "+a1.width+" "+a1.height);
		
		
	}
}