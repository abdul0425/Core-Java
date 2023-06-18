package edu.jspider.String;

public class Driver {

	public static void main(String[] args) {
//		Cab c=new Cab()
//				{
//					@Override
//					public void cabBook()
//					{
//						System.out.println("Your cab is Booked.");
//					}
//				};
		
		//Cab c=()->System.out.println("Your cab is Booked.");
		//Cab c=(source,destination)->System.out.println("Your cab is booked from "+source+" to "+destination);
			
		Cab c=source->{
			System.out.println("Your cab is booked from "+source);
			return "Fare : 500";
		};
		
		//Ola o1=new Ola();
		String fare=c.cabBook("jspider");
		System.out.println(fare);
		
		// Predefined Functional Interface.
		// 1. Predicate
		//  public boolean test(T t)
		//   return false;
		
		// 2. Function
		//  public <Input,Return> apply(T t)
		//  
		// 3. Consumer
		//  public void accept(T t)
		// 4. Supplier
		//   get()
		
		
	}

}
