class Cube
{
	int length;
	int width;
	int height;

	Cube(int l, int w, int h)
	{
		length=l;
		width=w;
		height=h;
	}
	Cube()
	{
		this(10,15,20);
		
	}
	void display()
	{
		System.out.println(length+" "+width+" "+height);
	}
	public static void main(String []args)
	{
		Cube c1 = new Cube();
		// Cube c2 = new Cube()
		c1.display();
	}
}