import java.util.Scanner;

class PrimeNumberUnderRange
{
	public static void main(String[] args)
	{
		System.out.println("Enter starting range");
		int startRange = new Scanner(System.in).nextInt();
		System.out.println("Enter final range");
		int finalRange = new Scanner(System.in).nextInt();
		
		int count = 0;
		System.out.print("Prime Numbers : ");		
		for(int i=startRange; i<finalRange; i++)
		{
			Boolean isPrime = true;
			for(int j=2; j<i/2; j++)
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
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.print("Number count :" +count);
		
		
	}
}