package edu.jspider.LambdaExpression;

public class LambdaImplement {

	public static void main(String[] args) {
		//Ola cab=new Ola();
		
		// Lambda Expression with no arguments.
		// Cab cab=()->System.out.println("Your Cab is Booked...");
		 // cab.bookCab();
		 
		
		// Lambda Expression using Argument's.
		 //Ola cab=new Ola();
		// Cab cab=(String source,String destination)-> System.out.println("Your Cab is booked from "
			//	+ "\n"+source+" to "
				//		+ ""+destination);
		// cab.bookCab("Marathahalli", "Kempgueda Airport.");

		// Lambda Expression with return type.
		
		//Ola cab=new Ola();
		//System.out.println(cab.bookCab("Bellanduru","Electronic City"));
		Cab cab=(String source,String destination)-> { System.out.println("Your Cab is booked from "+source+" to "+destination);
				return ("Fare : 1000rs."); };
		System.out.println(cab.bookCab("Bellanduru","Electronic City"));
		}
	}


