class PrimeNumberUnder100
{
	public static void main(String[] args)
	{
		 int count=0;
		System.out.print("Prime Numbers : ");
		for(int i=2; i<100; i++)
		{
			Boolean isPrime = true;
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)
				{
					isPrime=false;
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
		System.out.println("Total Prime Number  :"+count);
	}
}