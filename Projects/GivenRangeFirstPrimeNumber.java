import java.util.Scanner;
class GivenRangeFirstPrimeNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter start range :");
		int startRange = new Scanner(System.in).nextInt();
		System.out.println("Enter Final range :");
		int finalRange = new Scanner(System.in).nextInt();
		
		
		for(int i=startRange; i<finalRange; i++)
		{
			Boolean isPrime = true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println("First Prime Number :"+ i);
				break;
			}
		}
	}
}