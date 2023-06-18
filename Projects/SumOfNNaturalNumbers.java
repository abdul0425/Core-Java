package print.java; import java.util.Scanner;

public class SumOfNNaturalNumbers
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter a Natural number :");
		int number = new Scanner(System.in).nextInt();
		int sum = 0;
		for ( int i=1; i<=number; i++)
		{
			sum = sum+i;
		}
		System.out.println(" Sum of N natural numbers :" + sum);
	}

}
