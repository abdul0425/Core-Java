package print.java; 

public class FibonacciNumber 
{

	public static void main(String[] args) 
	{
		
		int number1 = 0;
		int number2 = 1;
		System.out.print(number1 + " " + number2);
		int sum; int number = 10;
		
		for ( int i=2; i<=number; i++ )
		{
			sum = number1 + number2;
			System.out.print(" " + sum );
			number1 = number2;
			number2 = sum;
		}
		

	}

}
