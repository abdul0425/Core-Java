package print.java; import java.util.Scanner;

public class DayCalculator {

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println(" Please Enter month and year");
		int month = scn.nextInt();
		int year = scn.nextInt();
		
		
		switch( month )
		{
		case 1 :	System.out.println("No of Days : 31");	return;
		case 2 :	if (( year % 400 == 0) || (year % 4 == 0 && year % 100 !=0))
						System.out.println(" No of Days : 29");
					else
						System.out.println("No of Days : 28");
					return;
		case 3 :	System.out.println("No of Days : 31");	return;
		case 4 :	System.out.println("No of Days : 30"); 	return;
		case 5 :	System.out.println("No of Days : 31");	return;
		case 6 :	System.out.println("No of Days : 30");	return;
		case 7 :	System.out.println("No of Days : 31");	return;
		case 8 :	System.out.println("No of Days : 31");	return;
		case 9 :	System.out.println("No of Days : 30");	return;
		case 10 :	System.out.println("No of Days : 31");	return;
		case 11 :	System.out.println("No of Days : 30");	return;
		case 12 :	System.out.println("No of Days : 31");	return;
		}
		

	}

}
