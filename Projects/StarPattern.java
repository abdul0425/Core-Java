package print.java; import java.util.Scanner;

public class StarPattern
{

	public static void main(String[] args)
	{
		System.out.println(" Enter the number ");
		int number = new Scanner(System.in).nextInt();
		int row; int column;
		
		for ( row =1; row<=number; row++ )
		{
			for ( column =1; column<=row; column++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
		

	}

}
