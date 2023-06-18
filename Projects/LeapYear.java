package print.java; import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args) 
	{
		System.out.println(" Please Enter The Year : ");
		int year = new Scanner(System.in).nextInt();
		
		if ( year % 400 == 0 )
		{	
			System.out.println(year + ": is a LEAP YEAR " );
		}
		else if ( year % 4 == 0 && year % 100 != 0 )
		{
			System.out.println(year + ": is a LEAP YEAR  " );
		}
		else
		{
			System.out.println(year + ": Not a LEAP YEAR : " );
		}
			
	}

}
