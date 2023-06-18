class Car
{
	int i;
	static int j;
	
	public static void main(String[] args)
	{
		Car c= new Car();
		c.i=10;
		j=20;
		System.out.println(c.i);
		System.out.println(j);
	}
}