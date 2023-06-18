package print.java; import java.util.Scanner;

public class SumOfDigitsInNumber 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int reminder = 0;
		System.out.println(" Enter a number sir : ");
		int number = new Scanner(System.in).nextInt();
		
		while( number/10 != 0)
		{
			reminder = number % 10;
			sum = sum + reminder;
			number = number/10;
		}
		if ( number/10 == 0)
		{
			reminder = number % 10;
			sum = sum + reminder;
			number = number/10;
		}
		System.out.println(" The sum for the given number digit = " + sum );
		}
}
