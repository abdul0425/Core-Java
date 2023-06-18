package print.java; import java.util.Scanner;

public class DecimalNumberOnceCompliment
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter a number sir : ");
		int number = new Scanner(System.in).nextInt();
		int binary = 0; int temp = number;
		int position = 1; String s = " ";
		int onceCompliment;
		
		while( number > 0 )
		{
			int reminder = number % 2;
			binary = binary + ( reminder * position);
			number = number/2;
			position = position * 10;
		}
		System.out.println("Binary No = " + binary);
		
		number = temp;
		while ( number>0 )
		{
			int digit = number%2;
			if ( digit == 0 )
				s = "1" + s;
			else
				s = "0" + s;
			number = number/2;
			
		}
		System.out.println("1's Compliment No = " + s);

	}

}
