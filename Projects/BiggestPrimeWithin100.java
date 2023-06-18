package print.java;

public class BiggestPrimeWithin100 
{

	public static void main(String[] args) 
	{
		int i=2; int j= 2;
		
		for ( i=2; i<100; i++)
		{		
			boolean isPrime = true;
			for ( j=2; j<=i-1; j++)
			{
				if ( i%j == 0 )
				{
					isPrime = false;
					
					break;
				}
			}
			if (isPrime)
			{
				System.out.print("\t"+i);
			}
								
		}
		
	}
}

