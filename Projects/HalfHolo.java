import java.util.Scanner;
class HalfHolo
{
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		int number = new Scanner(System.in).nextInt();
		
		
		for (int i=1; i<=number; i++)
		{
			for(int j=number-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			int l=2*i-1;
			for(int k=1; k<=l; k++)
			{
				if( k==1 || k==l || i==number)
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