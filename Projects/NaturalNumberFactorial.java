package print.java; import java.util.Scanner;

public class NaturalNumberFactorial
	{

	public static void main(String[] args)
	{
		System.out.println(" Enter a number :");
		int number = new Scanner(System.in).nextInt();
		int i; int factorial = 1;
		for ( i = 1; i <= number ; i++)
		{
			factorial = factorial * i;
		}
		System.out.println(" Factorial is =" + factorial);
		
	}
  }
