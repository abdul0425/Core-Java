package print.java; import java.util.Scanner;

public class CountEvenOddDigitInGivenNo 
{

	public static void main(String[] args)
	{
		System.out.println(" Enter a number sir :");
		int number = new Scanner(System.in).nextInt();
		int reminder = 0;
		int even = 0;
		int odd = 0;
		
		while ( number>0)
		{
			reminder = number%10;
			if (reminder%2 == 0)
			{
				even = even + 1;
			}
			else
				odd = odd + 1;
			number = number/10;
		}
			System.out.println(" Even count =" + even);
			System.out.println(" Odd count =" + odd);
	}
}
