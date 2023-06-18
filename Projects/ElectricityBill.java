package print.java; import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args)
	{
		System.out.println(" Please Enter Your Electric Units Sir :");
		float units = new Scanner(System.in).nextFloat();
		float Bill = 0.0f;
		
		if ( units <= 50 )
			System.out.println(" You Are Under Free Service Sir :  " + Bill);
		
		if ( units > 50 && units <= 100)
		{
			units = units - 50;
			System.out.println( "Your Billing Amount Is :  " + (units * 3) + " Rs " );
		}
		if ( units >= 101 && units <= 150 )
		{
			units = units - 50;
			System.out.println( "Your Billing Amount Is :  " + (units * 5) + " Rs " );
		}
		if ( units > 151 && units <= 200 )
		{
			units = units - 50;
			System.out.println( "Your Billing Amount Is :  " + (units * 7) + " Rs " );
		}
		if ( units > 200 )
		{
			units = units - 50;
			System.out.println( "Your Billing Amount Is :  " + (units * 12) + " Rs " );
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("                     !!!!!     ThanK YoU     !!!!!                       ");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("|-*-*-*-*_ * Save * Electricity * And * Make * India * Proud*  _*-*-*-*-|");
		

	}

}
