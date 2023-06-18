class Static
{
	static
	{
		System.out.println("Static Block in Test3");
	}
	static void m1()
	{
		System.out.println("Static method m1()");
	}
	
}
class Test3
{
	public static void main(String[] args)
	{
		System.out.println("Main Start");
		Static t = new Static();
		t.m1();
		t.m1();
		System.out.println("Main End");
	}
}