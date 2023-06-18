package print.java; import java.util.Scanner;

public class CrossSignPattern
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter a number ");
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		int i; int j;
		
		for ( i=1; i<=number; i++)
		{
			for ( j=1; j<=number; j++)
			{
				if ( i==j || i+j ==number+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}System.out.println();
		}
	}

}
