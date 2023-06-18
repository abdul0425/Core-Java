// "Super" : it's a reference variable which refers to the "Super Class" Objects.
class A
{
	int i=10;
}
class SuperKeyword extends A
{
	 int i=20;
	 void m2(int i)
	 {
		 System.out.println(i+ "  Calling M2 method");
		 System.out.println(this.i+ "  using This keyword ");
		 System.out.println(super.i+ "  using Super keyword");
	 }
	public static void main(String[] args)
	{
		SuperKeyword s1=new SuperKeyword();
		s1.m2(30);
	}		
}