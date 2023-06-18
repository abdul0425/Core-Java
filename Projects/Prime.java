import java.util.Scanner;

class Prime
{
	public static void main(String[] args)
	{
		System.out.println("Starting Range");
		int startRange = new Scanner(System.in).nextInt();
		System.out.println("Last Range");
		int lastRange = new Scanner(System.in).nextInt();
		int count = 0; int greatestPrime = 0;
		
		for(int i=startRange+1; i<lastRange; i++)
		{
			Boolean isPrime = true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				count++;
				greatestPrime = i;
				//System.out.print(i+" ");
			}
		}
		System.out.println("greatestPrime :"+ greatestPrime);
		//System.out.println();
		//System.out.print("Number Count :" +count);
	}
}