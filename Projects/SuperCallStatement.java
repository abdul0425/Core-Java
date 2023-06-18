class A
{
	A(int i)
	{
		System.out.println("A class constructor");
	}
}
class SuperCallStatement extends A
{
	SuperCallStatement()
	{
		super(10);
		System.out.println("super constructor");	
	}
	public static void main(String[] args)
	{
		SuperCallStatement s=new SuperCallStatement();
	}
}