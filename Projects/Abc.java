class Circle1
{
	int radius;
	Circle1(int r)
	{
		radius = r;
	}

	void m(Circle1 c)
	{
		System.out.print(radius+" ");
		System.out.print(c.radius+" ");
		System.out.println();
	}
}
class Xyz
{
	public static void main(String[] args)
	{
		Circle1 c1 = new Circle1(10);
		Circle1 c2 = new Circle1(20);

		c1.m(c2);
		c2.m(c1);
		c2.m(c2);
		c2.m(new Circle1(30));
	}
}