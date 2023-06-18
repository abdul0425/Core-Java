package print.java; import java.util.Scanner;

public class SomOfEvenOddDigitsInNumber 
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter a number Sir :");
		int number = new Scanner(System.in).nextInt();
		int reminder = 0; int even = 0; int odd = 0;
		int sumOfEven = 0; int sumOfOdd = 0;
		
		while( number>0)
		{
			reminder = number%10;
			if ( reminder%2 == 0)
			{
				sumOfEven = sumOfEven + reminder;
				even++;
			}
			else
			{
				sumOfOdd = sumOfOdd + reminder;
				odd++;
			}
			number = number/10;
		}
		
		System.out.println("sum of even : " + sumOfEven);
		System.out.println("sum of odd : " + sumOfOdd);
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);

	}

}
