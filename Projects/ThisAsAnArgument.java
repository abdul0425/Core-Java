class ThisAsAnArgument
{
	void m1(ThisAsAnArgument a1)
	{
		System.out.println(" Inside M1 method");
	}
	void m2()
	{
		m1(this);
		System.out.println(" Inside M2 method");
	}
	public static void main(String[] args)
	{
		ThisAsAnArgument a1=new ThisAsAnArgument();
		a1.m2();
	}
}