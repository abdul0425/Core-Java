class Fibonacci
{
	public static void main(String[] args)
	{
		int num1=0; int num2=1;
		
		int sum;
		for(int i=1; i<=16; i++)
		{
			System.out.print(num1+ " " );
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
		}
	}
}