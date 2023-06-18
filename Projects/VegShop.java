class Vegetable
{
	void soldVeg()
	{
		System.out.println("Vegetable Sold");
	}
}
class Carrot extends Vegetable
{
	void prepareHalwa()
	{
		System.out.println("Halwa is Prepared");
	}
}
class Potato extends Vegetable
{
	void chipsFried()
	{
		System.out.println("Chips is Ready");
	}
}
class VegShop
{
	Vegetable sell(String name)
	{
		if(name.equals("Carrot"))
		{
			return new Carrot();
		}
		if(name.equals("Potato"))
		{
			return new Potato();
		}
		System.out.println(name + "Invalid Name");
		return null;
	}
}
class Consumer
{
	public static void main(String[] args)
	{
		VegShop vs = new VegShop();
		Vegetable v1 = vs.sell("Carrot");
		Vegetable v2 = vs.sell("Potato");
		v1.soldVeg();
		v2.soldVeg();
		((Carrot)v1).prepareHalwa();
		((Potato)v2).chipsFried();
	}
}