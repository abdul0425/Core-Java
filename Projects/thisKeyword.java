class A
{
	int i;
	//void method(int x)
	void method(int i)
	{
		this.i=i; //asssigning the "i" value to "i", So use "this" keyword.
	}
	void display()
	{
		System.out.println(i); // So the default value will be 0;
	}
}
class thisKeyword
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.method(10);
		a1.display();
		
	}
}