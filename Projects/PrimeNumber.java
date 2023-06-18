import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int number = new Scanner(System.in).nextInt();
		Boolean isPrime = true;
	
		if(number<=1)
		{
			System.out.println(number + ": Not Prime");
		}
		for(int i=2; i<=number/2; i++)
		{
			if(number%i == 0)
			{
				isPrime = false;
			}
		}
		if(isPrime)
			System.out.println(number + ": Prime Number");
		else
			System.out.println(number + ": Not Prime");
	}
}