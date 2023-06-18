import java.util.Scanner;
class CrossSign
{
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		int number = new Scanner(System.in).nextInt();
		
		
		for (int i=1; i<=number; i++)
		{
			for(int j=1; j<=number; j++)
			{
				if (i==j || i+j==number+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}