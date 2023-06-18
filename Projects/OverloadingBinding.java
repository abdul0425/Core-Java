class Bike
{
	
}
class KTM extends Bike
{
	
}
class Rider
{
	void ride(Bike b)
	{
		System.out.println(" Bike is Riding");
	}
	void ride(KTM k)
	{
		System.out.println(" KTM is Riding");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Rider r = new Rider();
		KTM k = new KTM();
		Bike b = new KTM();
		r.ride(k);
	}
}