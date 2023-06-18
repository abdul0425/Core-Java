package print.java; import java.util.Scanner;

public class DecimalToBinary1 
{

	public static void main(String[] args)
	{
		System.out.println(" Enter a Number : ");
		int number = new Scanner(System.in).nextInt();
		int digit; int binary = 0; int i=1;
		
		while ( number>0 )
		{
			digit = number%2;
			binary = binary + (i*digit);
			number = number/2;
			i = i*10;
			
		}
		System.out.println(" Binary Value = " + binary );

	}

}
