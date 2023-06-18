interface Bank
{
	public int getRateOfInterest();

	default public void homeLoans()
	{
		System.out.println("This Bank Provides Home Loan's");
	}
	static public void guideForBankSystem()
	{
		System.out.println("Use This Guideline's For Online Transaction's");
	}
}
class SBI implements Bank
{
	@Override
	public int getRateOfInterest()
	{
		return 7;
	}
}

class ICICI implements Bank
{
	@Override
	public int getRateOfInterest()
	{
		return 8;
	}
}

class HDFC implements Bank
{
	@Override
	public int getRateOfInterest()
	{
		return 11;
	}
}

class BankApplication
{
	public static void main(String[] args)
	{
		Bank b1;

		b1 = new SBI();
		System.out.println(b1.getRateOfInterest()+ "%");
		b1.homeLoans();
		System.out.println("-----------------");
		b1 = new HDFC();
		System.out.println(b1.getRateOfInterest()+ "%");

		System.out.println("-----------------");

		b1 = new ICICI();
		System.out.println(b1.getRateOfInterest()+ "%");

		System.out.println("-----------------");
		b1.homeLoans();

		System.out.println("-----------------");
		Bank.guideForBankSystem();

	}

}