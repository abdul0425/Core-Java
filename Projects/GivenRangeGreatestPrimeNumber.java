import java.util.Scanner;

class GivenRangeGreatestPrimeNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter First No :");
		int firstNumber = new Scanner(System.in).nextInt();
		System.out.println("Enter Second No :");
		int secondNumber = new Scanner(System.in).nextInt();
		int greatestPrime = 0;
		for(int i=firstNumber; i<secondNumber; i++)
		{
			Boolean isPrime = true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
				}
			}
			if(isPrime)
			{
				greatestPrime = i;
			}
		}
		System.out.println("Greatest Prime Number :"+greatestPrime);
	}
}