package print.java; import java.util.Scanner;

public class LeastCommon
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter two Numbers ");
		Scanner object = new Scanner(System.in);
		int number1 = object.nextInt();
		int number2 = object.nextInt();
		int number; int i;
		
		number = (number1>number2?  number1 : number2 );
		
		for ( i = number; i<= number1*number2; i++)
		{
			if ( i%number1 == 0 && i%number2 == 0)
			{
				System.out.println(" LCM  = " + i);
				return;
			}
		}
		
	
	}

}
