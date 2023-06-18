class Animal
{

}
class Dog extends Animal
{

}
class LabraDog extends Dog
{

}
class GermanShaffered extends Dog
{

}
class X
{
	public static void main(String[] args)
	{
		Animal a = new LabraDog();
		System.out.println(a instanceof Animal);
	}
}