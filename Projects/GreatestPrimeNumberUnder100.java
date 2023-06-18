package print.java;

public class GreatestPrimeNumberUnder100 
{

	public static void main(String[] args)
	{
		 int greatestPrime=0; int i; int count=0;
		for ( i=2; i<100; i++)
		{
			boolean isPrime=true;
			for ( int j=2; j<=i/2; j++)
			{
				if ( i%j == 0)
				{
					isPrime=false;
					break;
				}
			}
			if (isPrime)
			{
				System.out.print(" " + i);
				count++;
				greatestPrime=i;
			}
		}
		System.out.println();
		System.out.println(" Count : " + count);
		System.out.println(" Greatest Prime Number : " + greatestPrime);
	}

}
