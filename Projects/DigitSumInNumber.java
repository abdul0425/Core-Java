package print.java; import java.util.Scanner;

public class DigitSumInNumber 
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter a Number ");
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		int digit; int sum = 0;
		
		while ( number>0 )
		{
			digit = number%10;
			sum = sum + digit;
			number = number/10;
		}
		System.out.println(" Sum of digits = " + sum);

	}

}
