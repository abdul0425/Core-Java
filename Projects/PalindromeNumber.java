package print.java; import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args)
	{
		System.out.println(" Enter a Numer sir :");
		int number = new Scanner(System.in).nextInt();
		int temp = number;
		int totalSum = 0;
		int reminder;
		
		while ( number>0 )
		{
			reminder = number % 10;
			totalSum = (totalSum * 10) + reminder;
			number = number/10;
		}
		
		if ( temp == totalSum)
		{
			System.out.println(" It's Pallindrome");
		}
		else
			System.out.println(" Not Pallindrome");

	}

}
