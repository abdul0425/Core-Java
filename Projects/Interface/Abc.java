interface DemoInterface
{
	public final static double PI = 3.14;

	void method1();
	void method2();
	void method3();
}
class Interface implements DemoInterface
{
	@Override
	public void method1()
	{
		System.out.println("Abstract Method 1 .");
	}
	@Override
	public void method2()
	{
		System.out.println("Abstract Method 2 .");
	}
	@Override
	public void method3()
	{
		System.out.println("Abstract Method 3 .");
	}
}

class Test
{
	public static void main(String[] args)
	{
		//  Normal Way =>
		Interface itr = new Interface();
		itr.method1();
		itr.method2();
		itr.method3();

		//  Generalized Way => 
		DemoInterface di = new Interface();
		di.method1();
		di.method2();
		di.method3();
		System.out.println(DemoInterface.PI);
	}
}