class CallToThis
{
	CallToThis()
	{
		this(10, "Arshad");
		System.out.println("No argument Constructor");
	}
	CallToThis(int i)
	{
		//this();
		System.out.println("Parameterised Constructor");
	}
	CallToThis(int i, String s)
	{
		//this();
		System.out.println("Two Parameter Constructor");
	}
	public static void main(String[] args)
	{
		//CallToThis c=new CallToThis(5);
		CallToThis c=new CallToThis();
	}
}