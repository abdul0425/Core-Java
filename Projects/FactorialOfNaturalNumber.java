package print.java; import java.util.Scanner;

public class FactorialOfNaturalNumber
{

	public static void main(String[] args)
	{
		System.out.println(" Enter a number for Factorial :");
		int number = new Scanner(System.in).nextInt();
		int factorial = 1;
		
		for ( int i=1; i<=number; i++)
		{
			factorial = factorial*i;
		}
		System.out.println(" Factorial for the given No :" + factorial);
	}

}
