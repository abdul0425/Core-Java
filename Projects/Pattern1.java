package print.java; import java.util.Scanner;

public class Pattern1
{

	public static void main(String[] args)
	{
		System.out.println(" Enter the Number " );
		int number = new Scanner(System.in).nextInt();
		
		int row; int column;
		
		for ( row =1; row <=number; row++)
		{
			for ( column = 1; column<=number; column++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
