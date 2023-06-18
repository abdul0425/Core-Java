package edu.jspider.Sep01;

public class SalesMan {
	
	public void provideServiceToAllBank(Bank b)
	{
		b.rateOfInterest();
		b.homeLoan();
	}
	
	static void pattern() {
		System.out.println("---------------------------");
	}
	public static void main(String[] args) {
		SalesMan sm=new SalesMan();
		sm.provideServiceToAllBank(new Icici());
		SalesMan.pattern();
		
		sm.provideServiceToAllBank(new Hdfc());
		SalesMan.pattern();
		
		sm.provideServiceToAllBank(new Sbi());
		SalesMan.pattern();
		
		
		/*  Bank b=new Icici();
		b.rateOfInterest();
		b.homeLoan();
		SalesMan.pattern();
		*/
		
		/*  Bank b=new Hdfc();
		b=new Hdfc();
		b.rateOfInterest();
		b.homeLoan();
		SalesMan.pattern();
		*/
		
		/*  Bank b=new Sbi();
		b=new Sbi();
		b.rateOfInterest();
		b.homeLoan();
		SalesMan.pattern();
		*/
	}

}
